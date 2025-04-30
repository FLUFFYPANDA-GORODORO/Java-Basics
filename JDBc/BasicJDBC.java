import java.sql.*;

public class DemoJDBC {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String password = "*******";
//        String query = "select name from student where sid = 1";
        String query = "select * from student";

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,uname,password);
        System.out.println("Connection Established");

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
//        rs.next();
//        String name = rs.getString("name");
//        System.out.println(name);

        while(rs.next()){
            System.out.print(rs.getInt(1) + " : ");
            System.out.print(rs.getString(2) + " : ");
            System.out.print(rs.getInt(3));
            System.out.println();
        }

        con.close();


        System.out.print("Connection Closed");
    }
}

/*

7 Steps of JDBC

1.import the package -> import java.sql.*
2.load and register (optional) -> Class.forName("org.postgresql.Driver");
3.create connection
4.create statement
5.execute statement
6.process the result
7.close

*/

//postgreSql : port 5432
//MySql : port 3306
