package com.company.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/RegForm")
public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			PrintWriter out=resp.getWriter();
			
			String myusername = req.getParameter("username");
			String myemail = req.getParameter("email");
			String mypassword = req.getParameter("password");

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			PreparedStatement pre = con.prepareStatement("Insert into student1 values(?,?,?)");
			pre.setString(1, myusername);
			pre.setString(2, myemail);
			pre.setString(3, mypassword);
			int count = pre.executeUpdate();
			if(count>0) {
				resp.setContentType("text/html");
				out.print("<h3 style='color:green'>User Registered Succefully</h3>");
				RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
				rd.include(req, resp);
			}
			else {
				resp.setContentType("text/html");
				out.print("<h3 style='color:red '>User not  Registered Succefully</h3>");
				RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
				rd.include(req, resp);

			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
