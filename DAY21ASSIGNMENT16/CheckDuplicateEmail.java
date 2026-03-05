import java.sql.*;
import java.util.Scanner;

public class CheckDuplicateEmail {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password");

            String checkQuery = "SELECT * FROM users WHERE email=?";
            PreparedStatement ps1 = con.prepareStatement(checkQuery);
            ps1.setString(1, email);

            ResultSet rs = ps1.executeQuery();

            if (rs.next()) {
                System.out.println("Email already exists!");
            } else {
                String insertQuery = "INSERT INTO users(username,password,email) VALUES(?,?,?)";
                PreparedStatement ps2 = con.prepareStatement(insertQuery);

                ps2.setString(1, "testuser");
                ps2.setString(2, "12345");
                ps2.setString(3, email);

                ps2.executeUpdate();
                System.out.println("User inserted successfully!");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}