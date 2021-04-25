package com.interfaceimplementation;

import java.util.ArrayList;

import com.module.PersonDetail;

public interface AddressBookManager {
ArrayList<PersonDetail> createAddressBook();
ArrayList<PersonDetail> open();
void save(ArrayList<PersonDetail>list,String file);
void saceAs();
void quit();
}
