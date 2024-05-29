package jp.co.aforce.beans;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
 
public class LoginDAO extends DAO{
	public Login search(String login_id, String password)
	throws Exception{
		Login login = null;
		
		Connection con = getConnection();
		
		PreparedStatement st;
		st = con.prepareStatement("select * from login where login_id = ? and password = ?");
		st.setString(1, login_id);
		st.setString(2, password);
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			login = new Login();
			login.setLogin_id(rs.getString("login_id"));
			login.setPassword(rs.getString("password"));
		}
		
		st.close();
		con.close();
		return login;
	}
	
	public boolean register(String login_id, String password
		) throws Exception {
		Connection con = getConnection();
		
		PreparedStatement st;
		st = con.prepareStatement("insert into login(login_id, password) values(?, ?)");
		st.setString(1, login_id);
		st.setString(2, password);
		
		int result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result > 0;
	}
}
