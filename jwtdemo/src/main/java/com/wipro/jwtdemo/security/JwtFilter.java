package com.wipro.jwtdemo.security;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.wipro.jwtdemo.service.CustomUserDetailsService;
import com.wipro.jwtdemo.util.JwtUtil;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtFilter extends OncePerRequestFilter {

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private CustomUserDetailsService service;

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain)
            throws ServletException, IOException {
    	String path = request.getServletPath();
    	if(path.equals("/auth/login") ||
    			   path.equals("/auth/register")) {    		 
    			    filterChain.doFilter(request, response);
    			    return;
    			}
    	
        String authHeader =
                request.getHeader("Authorization");

        String token = null;
        String username = null;
        System.out.println("authHeader="+authHeader);
        if(authHeader != null &&
                authHeader.startsWith("Bearer ")) {

            token = authHeader.substring(7);

            username =
                    jwtUtil.extractUsername(token);
            System.out.println("username="+username);
        }

        if(username != null &&
                SecurityContextHolder.getContext()
                        .getAuthentication() == null) {

            UserDetails userDetails =
                    service.loadUserByUsername(username);
            System.out.println("userDetails="+userDetails);
            if(jwtUtil.validateToken(
                    token,
                    userDetails)) {
            	System.out.println("token Validated");
                UsernamePasswordAuthenticationToken auth =
                        new UsernamePasswordAuthenticationToken(
                                userDetails,
                                null,
                                userDetails.getAuthorities());

                SecurityContextHolder.getContext()
                        .setAuthentication(auth);
            }
        }

        filterChain.doFilter(request, response);
    }
}