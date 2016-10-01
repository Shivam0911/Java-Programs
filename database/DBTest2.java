import static java.lang.System.*;
import java.sql.*;

class DBTest2
{
	public static void main(String args[])throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/unisoft","root","root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from Students order by name");

		//rs.afterLast();
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

		/*	first(), last(), absolute(3), next(), previous(), rs.beforeFirst(), rs.afterLast()*/


		rs.close();
		st.close();
		con.close();
	}
}