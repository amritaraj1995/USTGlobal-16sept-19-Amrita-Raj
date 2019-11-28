package com.ustglobal.empwebappp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ustglobal.empwebappp.dao.EmployeeDAO;
import com.ustglobal.empwebappp.dto.EmployeeInfo;
import com.ustglobal.empwebappp.util.EmployeeDaoManager;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter(); 
		
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		EmployeeDAO dao = EmployeeDaoManager.getEmployeeDAO();
		EmployeeInfo info = new  EmployeeInfo();
		info.setId(id);
		info.setName(name);
		info.setEmail(email);
		info.setPassword(password);
		
		boolean check = dao.registerEmployee(info);
		String msg = "";
		if(check ) {//== true
			msg = "Registration Complted";
//			out.println("<html>");
//			out.println("<h4>Registration completed</h4>");
//			out.println("</html>");
		}else {
			
			msg = "Id cannot be repeated";
//			out.println("<html>");
//			out.println("<h4>Id can not be repeated</h4>");
//			out.println("</html>");
		}
		req.setAttribute("msg", msg);
		RequestDispatcher dispatcher = req.getRequestDispatcher("./login.jsp");
		dispatcher.include(req, resp);
		
	}//end of doPost
}//end of RegisterServlet
