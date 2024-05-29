package jp.co.aforce.beans;
 
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
 
public class LoginAction extends Action {
	public String execute(
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
 
		HttpSession session = request.getSession();
 
		String login_id = request.getParameter("login_id");
		String password = request.getParameter("password");
		LoginDAO dao = new LoginDAO();
		Login login = dao.search(login_id, password);
 
		if (login != null) {
			session.setAttribute("login", login);
			return "login-success.jsp";
		}
		return "login-error.jsp";
	}
}
