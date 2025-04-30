import java.sql.*;

public class DemoJDBC {
    public static void main(String[] args) throws Exception {

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String password = "gaurav123";
//        String query = "insert into student values(3,'John',50)";
//        String query = "update student set name = 'Maxi' where sid = 3";
        String query = "delete from student where sid = 3";

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url,uname,password);
        System.out.println("Connection Established");


        Statement st = con.createStatement();
        boolean status = st.execute(query);
        System.out.println(status);
        //The status is showing false but the data is added in the dataset .
        //It shows false because it does not return status about data being added or not .
        //It represents the count of the data , something like that , so thats the reason why it is showing false.

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
