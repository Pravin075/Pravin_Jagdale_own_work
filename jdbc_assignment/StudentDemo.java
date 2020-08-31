import java.util.*;
import java.sql.*;

public class StudentDemo
{
public static void main(String arg[])
{
System.out.println("enter roll no,name,age");
Scanner sc=new Scanner(System.in);
int roll=sc.nextInt();
String name=sc.next();
int age=sc.nextInt();

String ss= "jdbc:mysql://localhost:3306/studentdb";
try(Connection con =DriverManager.getConnection(ss,"root","Pravin@123"))
{
PreparedStatement pst=con.prepareStatement("insert into student values(?,?,?)");
pst.setInt(1,roll);
pst.setString(2,name);
pst.setInt(3,age);
int rs=pst.executeUpdate();

PreparedStatement ps=con.prepareStatement("select * from student");
ResultSet rst=ps.executeQuery();
while(rst.next())
{
int no=rst.getInt("rollno");
int no1=rst.getInt("age");
String no3=rst.getString("name");
System.out.println("roll="+ no +" name="+ no3 +" age="+ no1);
}
}
catch(Exception ie)
{
System.out.println(ie);
}

}

}