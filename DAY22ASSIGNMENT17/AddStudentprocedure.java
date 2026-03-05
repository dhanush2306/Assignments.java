import java.sql.*;

public class AddStudentProcedure {

    public static void main(String[] args) {

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password");

            CallableStatement cs = con.prepareCall("{call addStudent(?,?,?)}");

            cs.setInt(1, 101);
            cs.setString(2, "Dhanush");
            cs.setInt(3, 85);

            cs.execute();

            System.out.println("Student inserted successfully!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}