import java.sql.*;

public class connn {
    Connection connection;
    Statement statement;
    public connn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","niral@29");
            statement = connection.createStatement();

            if(connection.isClosed()){
                System.out.println("connection closed");
            }
            else{
                System.out.println("connection created...");
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
    public static void main(String[] args) {
        new connn();
    }
}