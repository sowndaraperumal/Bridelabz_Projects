package com.services;

import java.util.Scanner;

import com.model.Client;
import com.model.ShowDetail;
import com.respository.TvShowImplementation;
import com.respository.TvshowInterface;

public class ManagerImple implements ManagerService{
static TvshowInterface repository=new TvShowImplementation();
static Client client;
static ShowDetail detail;


static Scanner scanner=new Scanner(System.in);


	@Override
	public void viewListOfShow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean logInVerify(Client client) {
		
		return repository.logInVerify(client);
		}

	@Override
	public Client clientDetail() {
		client=new Client();
		System.out.println("enter the name ");
		String name=scanner.next();
		client.setName(name);
		System.out.println("enter the password");
	String 	password=scanner.next();
		client.setPassword(password);
		return client;
	}

	@Override
	public ShowDetail addShow() {
		detail=new ShowDetail();
		System.out.println("enter the show name");
		String name=scanner.next();
		detail.setName(name);
		System.out.println("enter the show amount to watch");
		int amount=scanner.nextInt();
		detail.setAmount(amount);
		return  detail;
		
	}

	@Override
	public boolean logInVerifyManager(Client client) {
		// TODO Auto-generated method stub
		return repository.logInVerifyManager(client);
	}

}
