import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CommitAndRollback {
	static String name;
	static int total,percentage;
	static int rollNumber;
	 static PreparedStatement preparedStatement;
		static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		try{  
			  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");  
			con.setAutoCommit(false);  
			  
			 preparedStatement=con.prepareStatement("insert into class(name,rollnumber,mark,percentage) values(?,?,?,?)");  
			  
			while(true){  
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
			preparedStatement.executeUpdate();  
			  
			System.out.println("commit/rollback");  
			String answer=scanner.next(); 
			if(answer.equals("commit")){  
			con.commit();  
			}  
			if(answer.equals("rollback")){  
			con.rollback();  
			}  
			  
			  
			System.out.println("Want to add more records y/n");  
			String ans=scanner.next();  
			if(ans.equals("n")){  
			break;  
			}  
			  
			}  
			con.commit();  
			System.out.println("record successfully saved");  
			  
			con.close();//before closing connection commit() is called  
			}catch(Exception e){System.out.println(e);}  
	/*try {	System.out.println("enter the name");
	name=scanner.next();
	System.out.println("enter the roll number");
	rollNumber=scanner.nextInt();
	System.out.println("enter the total mark ");
	total=scanner.nextInt();
	System.out.println("enter the percent");
	percentage=scanner.nextInt();
	
		Class.forName("com.mysql.jdbc.Driver");
	System.out.println("s");	
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		System.out.println(connection);
		preparedStatement=connection.prepareStatement("insert into class(name,rollnumber,mark,percentage) values(?,?,?,?)");
		preparedStatement.setString(1,name );
		preparedStatement.setInt(2, rollNumber);
		preparedStatement.setInt(3, total);
		preparedStatement.setInt(4, percentage);
		System.out.println(preparedStatement);
		preparedStatement.executeUpdate();
 System.out.println(preparedStatement);
		System.out.println("enter the commit or rollback the transaction");
		String say=scanner.next();
		
		if(say.equalsIgnoreCase("commit")) {
			System.out.println("ssaa");
			connection.commit();
		}else if(say.equalsIgnoreCase("rollback")) {
			System.out.println("ss");
			connection.rollback();
		}
		connection.rollback();
		ResultSet resultSet=preparedStatement.executeQuery();
		System.out.println(resultSet);
		while(resultSet.next()) {
			System.out.println("id= "+resultSet.getInt(1)+" name = "+resultSet.getString(2)+" roll number= "+resultSet.getInt(3)+" total mark = "+resultSet.getInt(4)+" percentage ="+resultSet.getInt(5));;
	}
	}catch (Exception e) {
		// TODO: handle exception
	}*/
}
}
