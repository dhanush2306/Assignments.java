import java.sql.*;

public class SalaryIncrease {
    public static void main(String[] args) {

        String dept = "IT";

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb", "root", "password");

            String query = "UPDATE employees SET salary = salary + (salary * 0.10) WHERE department=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, dept);

            int rows = ps.executeUpdate();

            System.out.println(rows + " employee salaries updated.");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}