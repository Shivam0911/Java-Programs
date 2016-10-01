import java.sql.*;

public class DBHelper {
    public static boolean insertStudent(int rollNumber, String name, String gender, String email, String mobileNumber, String course){
        boolean status = false;
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/unisoft","root","root");){
            PreparedStatement st = con.prepareStatement("insert into students values(?,?,?,?,?,?)");
            st.setInt(1, rollNumber);
            st.setString(2, name);
            st.setString(3, gender);
            st.setString(4, email);
            st.setString(5, mobileNumber);
            st.setString(6, course);
            st.executeUpdate();
            status = true;
        }catch (Exception ex) {}        
        return status;
    }
    public static boolean insertStudent(Student s){
        boolean status = false;
        try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/unisoft","root","root");){
            PreparedStatement st = con.prepareStatement("insert into students values(?,?,?,?,?,?)");
            st.setInt(1, s.getRollNumber());
            st.setString(2, s.getName());
            st.setString(3, s.getGender());
            st.setString(4, s.getEmail());
            st.setString(5, s.getMobileNumber());
            st.setString(6, s.getCourse());
            st.executeUpdate();
            status = true;
        }catch (Exception ex) {}        
        return status;
    }    
}
