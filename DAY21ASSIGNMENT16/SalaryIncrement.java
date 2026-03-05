import java.sql.*;

public class SalaryIncrement {

    public static void main(String[] args) {

        String department = "IT";

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password");

            String query = "UPDATE users SET salary = salary + (salary * 0.10) WHERE department=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, department);

            int rows = ps.executeUpdate();

            System.out.println(rows + " record(s) updated successfully!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}