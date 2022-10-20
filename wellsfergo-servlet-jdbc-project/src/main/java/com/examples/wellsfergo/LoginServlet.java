package com.examples.wellsfergo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
		
		String uname = request.getParameter("lid");
		String passwd = request.getParameter("pwd");
		boolean isFound=false;
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/wellsfergo";
		String uid = "root";
		String pwd = "Password@1";
		Connection con = DriverManager.getConnection(url,uid,pwd);
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("select * from users");
		while(rs.next()) {
			if( rs.getString(1).equals(uname) && rs.getString(2).equals(passwd)) {
					isFound=true;
					break;
			}
		}
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><body>");
		
		if(isFound)
				out.println("<p style=color:green >Valid user <p>");
		else
			out.println("<p style=color:red >Invalid user <p>");
		out.println("</body></html>");
		
		}
		catch(Exception e) {
			
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
