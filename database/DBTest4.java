import static java.lang.System.*;
import java.sql.*;

class DBTest4
{
	public static void main(String args[])throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shivam","root","hesoyam123");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from Students order by name");


		while(rs.next())
		{
			out.println(rs.getInt(1));
			out.println(rs.getString(2));
			out.println(rs.getString("Gender"));
			out.println(rs.getString(4));
			out.println(rs.getString(5));
			out.println(rs.getString(6));
			out.println("------------------------");
		}




		rs.close();
		st.close();
		con.close();
	}
}