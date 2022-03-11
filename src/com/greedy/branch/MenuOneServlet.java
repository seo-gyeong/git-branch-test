package com.greedy.branch;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/menu1")
public class MenuOneServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("test", "MENU1입니다.");
		request.getRequestDispatcher("/WEB-INF/views/branch/result.jsp").forward(request, response);;
	}

	

}
