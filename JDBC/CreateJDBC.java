import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CreateJDBC {
    private static final String URL = "jdbc:mysql://localhost:3306/dbmarket";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void insertDataKaryawan(Scanner scanNEW) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "INSERT INTO karyawan (NoId, Username, Password) VALUES (?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                System.out.println("----MEMBUAT DATA LOGIN BARU----");

                System.out.print("Enter value for ID (integer): ");
                int idValue = scanNEW.nextInt();

                System.out.print("Enter value for Username: ");
                String usernameValue = scanNEW.next();

                System.out.print("Enter value for Password: ");
                String passwordValue = scanNEW.next();

                preparedStatement.setInt(1, idValue);
                preparedStatement.setString(2, usernameValue);
                preparedStatement.setString(3, passwordValue);

                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Berhasil menambah data login baru");
                } else {
                    System.out.println("Tidak dapat menambah data login baru");
                }

                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

