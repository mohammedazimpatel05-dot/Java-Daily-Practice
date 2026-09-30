import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCInsertUpdate {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "";

        try {
            Connection con = DriverManager.getConnection(
                    url, username, password);

            System.out.println("Database connected successfully.");

            // 1. Insert data
            String insertSQL =
                    "INSERT INTO student (id, name, age, course) VALUES (?, ?, ?, ?)";

            PreparedStatement psInsert =
                    con.prepareStatement(insertSQL);

            psInsert.setInt(1, 1);
            psInsert.setString(2, "Omkar");
            psInsert.setInt(3, 20);
            psInsert.setString(4, "BCA");

            int rowsInserted = psInsert.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Record inserted successfully.");
            }

            // 2. Modify/Update data
            String updateSQL =
                    "UPDATE student SET age = ?, course = ? WHERE id = ?";

            PreparedStatement psUpdate =
                    con.prepareStatement(updateSQL);

            psUpdate.setInt(1, 23);
            psUpdate.setString(2, "MCA");
            psUpdate.setInt(3, 1);

            int rowsUpdated = psUpdate.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Record updated successfully.");
            }

            // 3. Close resources
            psInsert.close();
            psUpdate.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("Database Error: " + e.getMessage());
        }
    }
}
