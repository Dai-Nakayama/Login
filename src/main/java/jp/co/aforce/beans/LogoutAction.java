package jp.co.aforce.beans;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LogoutAction extends Action {
	public String execute(
		HttpServletRequest request, HttpServletResponse response
	) throws Exception {
		
		HttpSession session=request.getSession();
		
if (session.getAttribute("login")!=null) {
	session.invalidate();
	return "logout-success.jsp";
}

		return "logout-error.jsp";
	}
}