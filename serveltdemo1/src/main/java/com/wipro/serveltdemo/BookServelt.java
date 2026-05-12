package com.wipro.serveltdemo;
import java.util.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;



/**
 * Servlet implementation class BookServelt
 */
@WebServlet("/BookServelt")
public class BookServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookServelt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Book> books = Arrays.asList(
	            new Book(1,"Java Basics",500),
	            new Book(2, "Spring Boot",800),
	            new Book(3,"Hibernate",650)
	        );
	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        out.println("Book List:");

	        for (Book b:books){
	            out.println(b.id+" " +b.title+"  "+b.price+"</p>");
	        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
