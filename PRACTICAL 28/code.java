QUESTION:
Write a Java program that interacts with database. It enables to-
(a) Inserts the student name and roll number to database.
(b) Fetch records from table
(c) Modify the records
(d) Delete the records.
SOURCE CODE:
import java.sql.*;
Class Student {
public static void main(String arg[ ]) throws SQLException {
class.forName (”sun.jdbc.odbc.JdbcOdbcDriver”);
Connection c= DriverManager.getConnection(“Jdbc.odbc:DSN”,”username”,”password”);
Statement s = c.createStatement( );
Resultset rs = s.executeQuery (“ SQL statement”);
ResultSetMetaData rsmd =rs.getMetaData( );
int i =rsmd.getColumnCount( );
for(int j=i; j<=i; j++)
{
 System.out.println( rsmd.getColumnName( j)+”\t”);
 System.out.println(” ”);
}
while(rs.next( ) );
{
 for(int j=i; j<=i; j++)
 {
 System.out.println( rs.getString( j)+”\t”);
 }
 System.out.println(” ”);
}
s.close( );
c.close( );
}
}
