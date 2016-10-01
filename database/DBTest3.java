import static java.lang.System.*;
import java.sql.*;

/

class DBTest1
{
	public static void main(String args[])throws Exception
		{
			//Step 1 : Load the Driver Class into JVM

			Class.forName("com.mysql.jdbc.Driver");				//gets connected to DriverManager

			//Step 2 : To create a connection to the Database

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shivam","hesoyam123","root");

			//Step 3 : To send a SQL command to DBMS

			Statement st = con.createStatement();

			//st.execute(query);				DDL
			//st.executeUpdate(query)			DML
			//st.executeQuery(query)			DRL

			st.executeUpdate("insert into students values(1001,'Nagendra Dhagarra','Male','ndhagarra@gmail.com','9319056587','Java')");
			st.executeUpdate("insert into students values(1002,'Alok Bisht','Male','alok@gmail.com','9319056587','Android')");
			st.executeUpdate("insert into students values(1003,'Gaurav Jain','Male','gaurav@gmail.com','9319056587','PHP')");
			st.executeUpdate("insert into students values(1004,'Mehuli Sharma','Female','mehuli@gmail.com','9319056587','Oracle DBA')");
			st.executeUpdate("insert into students values(1005,'Rajat Goel','Male','rajat@gmail.com','9319056587','C#.Net')");

			//Step 4

		con.close();
}


//Apache Derby - Java Free