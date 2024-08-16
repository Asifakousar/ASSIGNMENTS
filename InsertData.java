import java.sql.*;

public class InsertData {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/PlcaeOrders";
        String username = "postgres";
        String password = "root";
        String query = "insert into categories (category_id, category_name) values (?, ?)";
        int category_id = 11;
        String category_name = "Electronics";
        try (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement st = con.prepareStatement(query);) {
            System.out.println("Connection Established");
            st.setInt(1, category_id);
            st.setString(2, category_name);

            int rowsAffected = st.executeUpdate();

            if(rowsAffected > 0) {
                System.out.println("Record inserted successfully!");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
