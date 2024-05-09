package com.company.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
			PrintWriter out = resp.getWriter();
			try{
			String myname = req.getParameter("username");
			String mypass = req.getParameter("password");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			PreparedStatement pre = con.prepareStatement("select * from student1 where username=? and password=?");
			pre.setString(1, myname);
			pre.setString(2, mypass);
			ResultSet rs = pre.executeQuery();
			System.out.println("query execute zhali");
			if (rs.next()) {
				System.out.println("succefully login");
				HttpSession session=req.getSession();
				session.setAttribute("session_name", rs.getString("username"));
				resp.setContentType("Text/Html");
                out.print("<h3 style='color:green'>You are sucessfully Login</h3>");
                RequestDispatcher rd=req.getRequestDispatcher("Profile.jsp");
                rd.include(req, resp);

			} else {
				resp.setContentType("Text/Html");
				out.print("<h3 style='color:red'> Name and Password are incorrect.Plrese try again.</h3>");
				RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
				rd.include(req, resp);
			}
			}
		catch(Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
}
}

