package com.assistedpractice.question3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
* @see HttpServlet#HttpServlet()
*/
    public NameServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

        /**
         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                String YourName = request.getParameter("fname");
                String YourFatherName = request.getParameter("lname");
                
                PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("Your full name is " + YourName + " " + YourFatherName);
            out.println("</body></html>");
        }
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            // TODO Auto-generated method stub
            doGet(request, response);
    }

}
