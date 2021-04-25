package com.controller;

import java.util.Scanner;

import com.model.Client;
import com.model.ShowDetail;
import com.respository.TvShowImplementation;
import com.respository.TvshowInterface;
import com.services.ManagerImple;
import com.services.ManagerService;

public class ManagerTvShow {
	static Scanner scanner=new Scanner(System.in);
	static int choice;
	static boolean b;
	static String name;
	static String password;
	static Client client;
	static ShowDetail detail;
	static ManagerService managerService=new ManagerImple();
	static TvshowInterface baseRepository=new TvShowImplementation();
	
	public static void main(String[] args) {
	
	do {
	System.out.println("1.log in \n2.add client in the table \n3.delete client in the table \n4.upadte client in the table\n5.read the client detail in the table\n6.add show \n7.view shows and rate\n8.quit");
	System.out.println("enter the choice");
	
	choice=scanner.nextInt();
	
	switch (choice) {
	case 1:
        client=managerService.clientDetail();
		b=managerService.logInVerify(client);
		if(b==true) {
			System.out.println("wellcome"+client.getName());
			System.out.println("now you can watch the shows");
			managerService.viewListOfShow();
			
		}
		else {
			
			
			System.out.println("sorry username and password is invalid");
		}
		
		break;
	case 2:

		client=managerService.clientDetail();
		baseRepository.createClient(client);
		break;
	case 3:
		System.out.println("add the show");
		System.out.println("only the person\n sowndar can delete the person in the  show list ");
		client=managerService.clientDetail();
		b=managerService.logInVerifyManager(client);
		if(b==true) {
			baseRepository.deleteClient();
		}
		break;
	case 4:
		System.out.println("update the client table");
		baseRepository.updateClient();
		break;
	case 5:
		System.out.println("display the client details");
		baseRepository.readClient();
		break;
	case 6:
		System.out.println("add the show");
		System.out.println("only the person\n sowndar can add the show list and enter the password");
		client=managerService.clientDetail();
		b=managerService.logInVerifyManager(client);
		if(b==true) {
			System.out.println("hello sowndar you can add the show list");
			detail=managerService.addShow();
			baseRepository.createShow(detail);
			
		}
		break;
	case 7:
		System.out.println("display the show list");
		baseRepository.readShow();
		break;
	case 8:
		System.exit(0);
		break;
	}

	
}while(choice<8);
}
}