package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.LoginLogic;
import model.User;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doget");
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		String img = request.getParameter("img");
		
		
		User user = new User(name,pass,img);
		
		LoginLogic loginLogic = new LoginLogic();
		boolean isLogin = loginLogic.execute(user);
		
		if(isLogin) {
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", user);
			
			
		}
	RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/loginResult.jsp");
	dispatcher.forward(request, response);
	}

}
