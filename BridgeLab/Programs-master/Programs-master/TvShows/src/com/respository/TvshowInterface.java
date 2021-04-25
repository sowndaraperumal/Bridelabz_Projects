package com.respository;

import com.model.Client;
import com.model.ShowDetail;

public interface TvshowInterface {
void createClient(Client client);
void updateClient();
void readClient();
void deleteClient();
boolean logInVerify(Client client);
void readShow();
boolean logInVerifyManager(Client client);

void createShow(ShowDetail detail);

}
