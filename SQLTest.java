import java.sql.*;
public class SQLTest {
	public SQLTest() throws SQLException {
	Connection con = DriverManager.getConnection("path","username","password");
	String loginString  =  "SELECT MOD_CODE, CW_NO, MARK FROM CW_MARK WHERE STUDENT = ? AND PASSWORD = ?";
	PreparedStatement loginStatement;
	loginStatement = con.prepareStatement(loginString);
	
	loginStatement.setString(1, "Mary01");
	loginStatement.setString(2, "Mary01");
	
	loginStatement.executeQuery();
	}
			
}
