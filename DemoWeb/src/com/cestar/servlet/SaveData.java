package com.cestar.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaveData
 */
@WebServlet("/SaveData")
public class SaveData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());  	//Context path is package name
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		//define properties which you get from html form
		int id=Integer.parseInt(request.getParameter("e_id"));
		String name=request.getParameter("e_name");
		String city=request.getParameter("e_city");
		int contact=Integer.parseInt(request.getParameter("e_contact"));
		String email=request.getParameter("e_email");
	
		
		out.print("<br><h1>Hello Class!</h1>");
		out.print("<br><h1>Your employee id recived as </h1>"+id);
		out.print("<br><h1>Employee name recived as</h1>"+name);
		out.print("<h1>Employee city is</h1>"+city);
		out.print("<h1>Employee contact is</h1>"+contact);
		out.print("<h1>Employee e-mail is</h1>"+email);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
