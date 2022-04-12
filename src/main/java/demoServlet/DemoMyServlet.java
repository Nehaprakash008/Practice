package demoServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoMyServlet
 */
public class DemoMyServlet extends HttpServlet {
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd;
		String userName= request.getParameter("userName");
		String password= request.getParameter("password");
		if("admin".equalsIgnoreCase(userName)  && "Admin@123".equals(password))
		{
			rd = getServletContext().getRequestDispatcher("/Welcome.html");
			System.out.println("valid user");
			rd.forward(request,response);
			
		}else
		{
			rd = getServletContext().getRequestDispatcher("/LoginError.html");
			System.out.println("Invalid user");
			rd.forward(request,response);
			
		}
		
		response.getWriter().append("Response from doGet() method ");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Response from doPost() method ");
	}

}
