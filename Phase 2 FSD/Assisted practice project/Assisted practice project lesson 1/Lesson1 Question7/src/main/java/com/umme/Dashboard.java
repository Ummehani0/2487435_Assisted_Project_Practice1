package com.umme;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Dashboard")
public class Dashboard extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        
        String userId = request.getParameter("userid");
        if (userId == null ) {
            out.println("<h2>No UserId was found in the URL.</h2><br>");
        } else {
            out.println("<h2>UserId obtained from URL Rewriting is :<h2>" + userId + "<br>");
        }
        out.println("</body></html>");

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}