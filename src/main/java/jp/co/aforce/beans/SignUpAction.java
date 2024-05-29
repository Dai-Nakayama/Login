package jp.co.aforce.beans;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SignUpAction extends Action {
	public String execute(
		HttpServletRequest request, HttpServletResponse response
	) throws Exception {
		
		String login_id = request.getParameter("login_id");
		String password = request.getParameter("password");
		
		LoginDAO dao = new LoginDAO();
		boolean success = dao.register(login_id, password);
		
		if (success) {
			return "signup-success.jsp";
		} else {
			return "signup-error.jsp";
		}
	}
}
