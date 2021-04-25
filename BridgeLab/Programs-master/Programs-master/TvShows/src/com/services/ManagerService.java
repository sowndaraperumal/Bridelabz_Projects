package com.services;

import com.model.Client;
import com.model.ShowDetail;

public interface ManagerService {
	
void viewListOfShow();
Client clientDetail();
ShowDetail addShow();
boolean logInVerify(Client client);
boolean logInVerifyManager(Client client );
}
