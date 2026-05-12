package com.wipro.homeassignment;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;  

/**
 * Servlet implementation class StudentAddServelt
 */
@WebServlet("/StudentAddServelt")
public class StudentAddServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentAddServelt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getRequestDispatcher("WEB-INF/pages/studentadd.jsp")
		.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

			String name = request.getParameter("name");
			String course = request.getParameter("course");
			String language = request.getParameter("language");
			System.out.println(name + " " + course + " " + language);
			String url = "jdbc:mysql://localhost:3306/wipro_train_assignments?allowPublicKeyRetrieval=true&useSSL=false";
			String userId = "root";
			String passWord = "8188mlbs";

			try {
				Connection con = DriverManager.getConnection(url, userId, passWord);
				String sql = "insert into student (name, course, language) values(?,?,?)";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, name);
				ps.setString(2, course);
				ps.setString(3, language);

				ps.execute();
				ps.executeUpdate();
				con.close();

			} catch (SQLException ex) {
				ex.printStackTrace();
			}


			response.sendRedirect("ListStudent");
	
	}

}
