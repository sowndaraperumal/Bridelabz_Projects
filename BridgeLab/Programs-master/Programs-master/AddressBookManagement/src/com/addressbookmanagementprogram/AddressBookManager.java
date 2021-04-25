package com.addressbookmanagementprogram;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.interfaceimplementation.AddressBookImplementation;
import com.interfaceimplementation.AddressBookManagerImplem;
import com.module.PersonDetail;
import com.utility.FileReadAndWrite;


public class AddressBookManager {
	static String say;
	static int count=0;
	static String files[]=new String[10];
	static boolean b=false;
	static int choice;
	static String change;
	static String pathfile;
static	File f;
static File[] filelist1;
static String filename;
	static ArrayList<PersonDetail>newlist=new ArrayList<>();
static String Filenamepath=null;	
static	Scanner s=new Scanner(System.in);
static ArrayList<PersonDetail>personlist;

static	ArrayList<PersonDetail> list =new ArrayList();


static ArrayList<PersonDetail> modifiedlist(ArrayList<PersonDetail> personlist) {
	System.out.println("d"+personlist);
	//FileReadAndWrite.readbook(filename);
	int choice;
	
    AddressBookImplementation addressBookImplementation=new AddressBookImplementation();
    String say="yes";
do {
	System.out.println("\n1.addnewperson\n2.editpersondetail\n3.deletepersondetail\n4.sortbyzip\n5.print\n.6.sort by name\n6.exit");
	System.out.println("enter the choice ");

	choice=s.nextInt();
    
    
    switch(choice) {
	case 1:
		System.out.println(personlist);
		newlist=addressBookImplementation.addPerson();
	//	System.out.println(newlist);
		personlist.addAll(newlist);		System.out.println("after adding new person");
		System.out.println(personlist);
		break;
	case 2:
	personlist=addressBookImplementation.editPersonDetail(personlist);
		//System.out.println(newlist);
		break;
	case 3:
		personlist=addressBookImplementation.deletePesonDetail(personlist);
		break;
	case 4:
		
		addressBookImplementation.sortByZip(personlist);
	    break;
	case 5:
		addressBookImplementation.print(personlist);
		break;
	case 6:
		addressBookImplementation.sortByName(personlist);
		break;
	case 7:
	 //   personlist=addressBookImplementation.exit(personlist);
	   //return personlist;
	   System.out.println("close");
	   break;
	}
    System.out.println("you want to contiue");
    say=s.next();
    		
    		
}while((say.equals("yes")));
	return personlist;
}
public static void main(String[] args) {
	System.out.println("Address Booking Management System");
	AddressBookManagerImplem addressbookmanager=new AddressBookManagerImplem();

	while(b==false) {
		
		System.out.println("1.createbook\n2.open\n3.save\n4.save as\n5.quit");
		System.out.println("enter your choice");
		choice=s.nextInt();
		
		switch(choice) {
		case 1:
			
			String say;
		System.out.println("wellcome create a new address book ");
		System.out.println("enter the name of the file");
		filename=s.next();
		
		files[count]=filename;
		++count;
		
		String path="/home/bridgeit/Desktop/2d/address/"+filename;
		int i=0;
		//String filess[]=new String[files.length];
		boolean b=true;
		File file=new File(path);
		f=new File("/home/bridgeit/Desktop/2d/address/");
		File[] filelist=f.listFiles();
			
		
		for (File file2 : filelist) {
				System.out.println(file2.getName());
			if(file2.getName().equals(filename))
			{
				b=false;
			}
			}
			
			
			
			if(b==true) {
				if(f.listFiles().length==0) {
				personlist=addressbookmanager.createAddressBook();
				System.out.println(list);
      			FileReadAndWrite.fileWritess(personlist, path);

				System.out.println(list);
				}
				else {
					if(f.length()!=0) {
				//	File[] files=f.listFiles();
					String filepath=null;
					System.out.println("do ou want to modified pervoius changes");
					change=s.next();
                      if(change.equals("yes") & Filenamepath!=null ) {
              			FileReadAndWrite.fileWritess(personlist, Filenamepath);

                    	  //  addressbookmanager.save(newlist, Filenamepath);
                      }
					System.out.println("close the pervious one");
					say=s.next();
						
					if(say.equalsIgnoreCase("yes")) {
						/*for (File file2 : files) {
							File file1=new File("/home/bridgeit/Desktop/2d/address/"+file2.getName());

						if(file1.length()==0) {
							
					filepath=file2.getName();}
					i++;
					}*/
					System.out.println("aa"+list);
					System.out.println();
				//	FileReadAndWrite.fileWrites(list, filess[filess.length-1]);
			addressbookmanager.save(list,files[count-2]);
			System.out.println(files[count-2]);
					personlist=addressbookmanager.createAddressBook();
					
					}
					else {
						personlist=addressbookmanager.createAddressBook();	
						addressbookmanager.save(personlist,filename);

}

				}
				
			}
			System.out.println("sucess");
			
			}
			else {
				System.out.println("plz enter new name");
			}
		

			//	createNewBook();
			break;
		case 2:
			
			f=new File("/home/bridgeit/Desktop/2d/address/");
			filelist1=f.listFiles();
if(filelist1.length!=0) {
			System.out.println(f.length());
			
			personlist=addressbookmanager.open();
			//System.out.println("aa"+personlist);
			System.out.println(personlist);
		modifiedlist(personlist);
			//System.out.println(p);
			Filenamepath=addressbookmanager.openBook();
		//	System.out.println(Filenamepath);
}else {
	System.out.println("folder is empty");
}
			break;
		case 3:
			System.out.println(Filenamepath);
			System.out.println("do want to save the file ");
			
			addressbookmanager.save(personlist, filename);
		//	System.out.println(list);
			System.out.println("save ");
			//save();
			break;
		case 4:

			f=new File("/home/bridgeit/Desktop/2d/address/");
			filelist1=f.listFiles();
			if(filelist1.length!=0) {
			
		//	System.out.println(Filenamepath);
			if(Filenamepath==null) {
				System.out.println("currently all files are closed");
			}else {
			String filetxt=	"/home/bridgeit/Desktop/2d/address/"+s.next();
			FileReadAndWrite.fileWritess(personlist, filetxt);
			}
			}
			else {
				System.out.println("folder is empty");
			}
			
			break;
		case 5:
			if(Filenamepath==null) {
				System.out.println("curretly all file is closed");
			}else {
//				String filetxt=	"/home/bridgeit/Desktop/2d/address/"+s.next();
				FileReadAndWrite.fileWritess(personlist, Filenamepath);
				}
			System.out.println("close");
			System.exit(0);
			break;
		}
		if(b==false) {
			System.out.println("do you want perfrom anything");
			say=s.next();
		}else {
			b=true;
			break;
		}

		
		
		
		
	}
}
}
