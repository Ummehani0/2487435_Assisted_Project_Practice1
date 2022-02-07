package com.getpost;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public GetHandler() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
          PrintWriter out = response.getWriter();
            out.println("<html><body>");
            
            out.println("<h1>Performing GET Operation</h1>");
            out.println("<hr>");
            String name = request.getParameter("name" );
            String email = request.getParameter("email");
            
            String mobile = request.getParameter("mobile");
            String address = request.getParameter("address");
//            out.println("Name=" + name + "<br>email=" + email + "<br>= mobile"  + mobile + "<br>= address"  + address);
            out.println("Name=" + name + "<br>email=" + email );
            out.println("<br>");
            out.println("mobile=" + mobile + "<br>Address=" + address);
            out.println("<hr>");
            out.println("</body></html>");
          
}
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
      
}

}

