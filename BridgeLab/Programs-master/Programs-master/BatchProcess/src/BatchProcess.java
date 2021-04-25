import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BatchProcess {
	static String name;
	static int total,percentage;
	static int rollNumber;
	 static PreparedStatement preparedStatement;
	static Scanner scanner=new Scanner(System.in);
	
public static void main(String[] args) {

			
	
	
	
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
	preparedStatement=con.prepareStatement("insert into class(name,rollnumber,mark,percentage) values(?,?,?,?)");
	String choice="yes";
	do {
	System.out.println("enter the name");
	name=scanner.next();
	System.out.println("enter the roll number");
	rollNumber=scanner.nextInt();
	System.out.println("enter the total mark ");
	total=scanner.nextInt();
	System.out.println("enter the percent");
	percentage=scanner.nextInt();
		preparedStatement.setString(1,name );
		preparedStatement.setInt(2, rollNumber);
		preparedStatement.setInt(3, total);
		preparedStatement.setInt(4, percentage);
		preparedStatement.addBatch();
		System.out.println(preparedStatement);

		System.out.println("do you want one time");
	choice=scanner.next();
	}while(choice.equals("yes"));
	System.out.println(preparedStatement);
	preparedStatement.executeBatch();
		System.out.println(preparedStatement);
		ResultSet resultSet=preparedStatement.executeQuery();
		while(resultSet.next()) {
			System.out.println("id= "+resultSet.getInt(1)+" name = "+resultSet.getString(2)+" roll number= "+resultSet.getInt(3)+" total mark = "+resultSet.getInt(4)+" percentage ="+resultSet.getInt(5));;
	}
		}catch (Exception e) {
		// TODO: handle exception
	}
	

}}
