import java.sql.*; //Package import

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/WorkshopDatabase";
        String userName = "postgres";
        String password = "root";
        String query = "Select * from customers";
        try{
            Connection con = DriverManager.getConnection(url, userName,password); //create connection
            System.out.println("Connection with Database sucessful!");
            PreparedStatement st = con.prepareStatement(query);
            //Statement st = con.createStatement(); //object creation or create connection statement
            ResultSet rs = st.executeQuery(); // excute query
            int ColumnCount = rs.getMetaData().getColumnCount();//column count
            System.out.println();
            while(rs.next()){ //process result and will iterate
                for(int i =1; i<=ColumnCount; i++){
                    System.out.println(rs.getInt(1)+" " +rs.getString(2)+rs.getString(3));
                }
            }
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}