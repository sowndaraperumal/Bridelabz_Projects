package com.respository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.model.Client;
import com.model.ShowDetail;

public class TvShowImplementation implements TvshowInterface {
	static Connection con;
	static PreparedStatement stmt;
	static ResultSet set;
	static Scanner scanner = new Scanner(System.in);

	@Override
	public void createClient(Client client) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TvShow", "root", "root");
			stmt = con.prepareStatement("insert into clientdetails(name,password) values(?,?)");
			stmt.setString(1, client.getName());
			stmt.setString(2, client.getPassword());
			stmt.executeUpdate();
			set = stmt.executeQuery("select * from clientdetails");
			while (set.next()) {
				System.out.println("id = " + set.getInt(1) + "  name = " + set.getString(2));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void updateClient() {
		try {
			System.out.println("enter the name what you given the name in table");
			String name = scanner.next();
			System.out.println("enter the new name");

			String newName = scanner.next();
			System.out.println(("enter the new password"));
			String password = scanner.next();
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TvShow", "root", "root");
			stmt = con.prepareStatement("update clientdetails set name=?,password=? where name=?");
			stmt.setString(1, newName);
			stmt.setString(2, password);
			stmt.setString(3, name);
			stmt.executeUpdate();
			set = stmt.executeQuery("select * from clientdetails");
			while (set.next()) {
				System.out.println("id = " + set.getInt(1) + "  name = " + set.getString(2));
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void readClient() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TvShow", "root", "root");
			stmt = con.prepareStatement("select * from clientdetails");
			set = stmt.executeQuery();
			while (set.next()) {
				System.out.println("id = " + set.getInt(1) + "  name = " + set.getString(2));
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void deleteClient() {
		try {
			System.out.println("enter id to delelte");
			int id = scanner.nextInt();
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TvShow", "root", "root");
			stmt = con.prepareStatement("delete from clientdetails where id=?");
			stmt.setInt(1, id);
			System.out.println(stmt);
			stmt.executeUpdate();
			System.out.println(stmt);
			set = stmt.executeQuery("select * from clientdetails");
			System.out.println(set);

			while (set.next()) {
				System.out.println("id " + set.getInt(1) + " " + set.getString(2));
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public boolean logInVerify(Client client) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TvShow", "root", "root");
			stmt = con.prepareStatement("select * from clientdetails");
			set = stmt.executeQuery();
			while (set.next()) {
				if (set.getString(2).equals(client.getName()) && set.getString(3).equals(client.getPassword())) {
					return true;
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public void readShow() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TvShow", "root", "root");
			stmt = con.prepareStatement("select * from showlist");
			System.out.println("ss");

			set = stmt.executeQuery();
			while (set.next()) {
				System.out.println("show name= " + set.getString(2) + " pay to watch" + set.getInt(3));
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public boolean logInVerifyManager(Client client) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TvShow", "root", "root");
			stmt = con.prepareStatement("select * from clientdetails");
			set = stmt.executeQuery();
			while (set.next()) {
				if (client.getName().equals("sowndar") && client.getPassword().equals("sowndar18")) {
					return true;
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public void createShow(ShowDetail detail) {
		try {
			System.out.println("dd");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("aa");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/TvShow", "root", "root");
			System.out.println("ss");
			stmt = con.prepareStatement("insert into showlist(name,amount) values(?,?)");

			System.out.println("sss" + detail.getAmount());
			stmt.setString(1, detail.getName());
			stmt.setInt(2, detail.getAmount());
			System.out.println(stmt);
			stmt.executeUpdate();
			System.out.println(stmt);
			set = stmt.executeQuery("select * from showlist");
			while (set.next()) {
				System.out.println("ssss");
				System.out.println("name " + set.getString(2) + "  amount to watch " + set.getInt(3));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
