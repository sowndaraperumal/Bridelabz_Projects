
<html>
<body><%@page import="java.io.*" %>
<body><%@page import="java.sql.*" %>
<h1>hello admin</h1></body></html>
<%
	Class.forName("com.mysql.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");

	PreparedStatement ps=connection.prepareStatement("select * from servlet");
	ResultSet rs=ps.executeQuery();
	String email=request.getParameter("email");
	String password=request.getParameter("password");
	
	while(rs.next()!=false) {
	if(rs.getString(4).equals(email))	{
		out.print(rs.getString(2)+" "+rs.getString(3)  );
		}

	}
	ResultSet set=ps.executeQuery();

	out.print(set.next());
while(set.next()!=false){
	out.println(set.getString(1)+" "+set.getString(2)+" "+set.getString(3));

}

%>
<br></br>
<a href="index.html"><input type="submit" value="logout"></a> 
