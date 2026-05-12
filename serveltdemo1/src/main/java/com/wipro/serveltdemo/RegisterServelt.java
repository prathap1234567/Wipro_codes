package com.wipro.serveltdemo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class RegisterServelt
 */
@WebServlet("/RegisterServelt")
public class RegisterServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServelt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		        String name   = request.getParameter("name");
		        String email  = request.getParameter("email");
		        String ageStr = request.getParameter("age");

		        response.setContentType("text/html");
		        PrintWriter out = response.getWriter();

		        if (name==null||name.trim().isEmpty()){
		            out.println("<h3>Error: Name cannot be empty!</h3>");
		            return;
		        }
		        int age=Integer.parseInt(ageStr);
		        if (age <=18){
		            out.println("<h3>Error: Age must be greater than 18!</h3>");
		            return;
		        }
		        out.println("<h2>Welcome " + name + "!</h2>");
		        out.println("<p>Email: " + email + "</p>");
		        out.println("<p>Age: " + age + "</p>");
		    }
		}


		