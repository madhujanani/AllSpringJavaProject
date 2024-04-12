package org.training.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.training.web.model.UserCredentials;
import org.training.web.service.LoginService;

/**
 * Servlet implementation class HomeServlet
 */

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
//LoginService service = new LoginService() ;	
//	@Autowired
//	LoginService service;
	

    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    String msg;
    List<UserCredentials>userList = new ArrayList<>();
    public void init() {
    	 msg="honeyBun";
    	 userList.add(new UserCredentials(1,"mark","mark123"));
    	 userList.add(new UserCredentials(2,"ram","ram123"));
    	 userList.add(new UserCredentials(3,"kai","kai123"));

    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		out.print("<html><body>");
		out.print("<h>"+msg+" from servlet</h1>");
		out.print("</body></html>");*/
		request.setAttribute("name", msg);
		//request.setAttribute("passww", msg);
		RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
		rd.forward(request,response);
//		response.sendRedirect("home.jsp"); this will give same output but expose the file name.like home.jsp,previous will give only home
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		RequestDispatcher rd ;
//		String username = request.getParameter("uname");
//		String passwrd = request.getParameter("pass");
//		if (username.equals("kiiran")&&passwrd.equals("12345")) {
//			request.setAttribute("name",  username);
//			 rd = request.getRequestDispatcher("home.jsp");
//			rd.forward(request,response);
//		} 
//		else if (username.equals("kiiran")) {
//			request.setAttribute("name",  username);
//		 rd = request.getRequestDispatcher("wrongpass.jsp");
//			rd.forward(request,response);
//		}
//		
//		else {
//			rd = request.getRequestDispatcher("loginfail.jsp");
//			rd.forward(request,response);
//			}
		//CONTROLLER SHOULD NOT HAVE bUSS LOGIC,--ITS JOB IS TO GET THE REQUEST FROM USER AND SEND IT SERVICE LAYER
//		request.setAttribute("name",  username);
//		request.setAttribute("passww",  passwrd);
		
		request.setAttribute("Users", userList);
		 rd = request.getRequestDispatcher("home.jsp");
			rd.forward(request,response);
			
//		boolean validUser = service.isValidUser(username, passwrd);
//		if (validUser==true) {
//		 rd = request.getRequestDispatcher("home.jsp");
//			rd.forward(request,response);
//		} else {
//			 rd = request.getRequestDispatcher("loginfail.jsp");
//			rd.forward(request,response);
//		}
//	
	}
	
	}

	


