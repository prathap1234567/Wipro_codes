package com.wipro.homeassignment;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.*;
import java.util.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Servlet implementation class ListStudent
 */
@WebServlet("/ListStudent")
public class ListStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String url = "jdbc:mysql://localhost:3306/wipro_train_assignments?allowPublicKeyRetrieval=true&useSSL=false";
		String userId = "root";
		String passWord = "8188mlbs";

		try {
			Connection con = DriverManager.getConnection(url, userId, passWord);

			String sql = "select * from student";

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			List<StudentRegDto> list = new ArrayList<>();

			while (rs.next()) {
				String name = rs.getString("name");
				String course = rs.getString("course");
				String language = rs.getString("language");

				StudentRegDto s = new StudentRegDto(name, course, language);
				list.add(s);
			}

			request.setAttribute("list", list);

			request.getRequestDispatcher("WEB-INF/pages/StudentList.jsp")
			.forward(request, response);

		} catch (SQLException ex) {
			ex.printStackTrace();
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
