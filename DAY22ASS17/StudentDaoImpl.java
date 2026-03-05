import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentDAOImpl implements StudentDAO {

    public void addStudent(Student s) {

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb",
                    "root",
                    "password");

            String query = "INSERT INTO Student VALUES(?,?,?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.setInt(3, s.getMarks());

            ps.executeUpdate();

            System.out.println("Student inserted successfully");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}