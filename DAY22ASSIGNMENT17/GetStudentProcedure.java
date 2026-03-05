import java.sql.*;

public class GetStudentProcedure {

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password");

            CallableStatement cs = con.prepareCall("{call getStudentById(?)}");
            cs.setInt(1, 101);

            ResultSet rs = cs.executeQuery();

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Marks: " + rs.getInt("marks"));
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}