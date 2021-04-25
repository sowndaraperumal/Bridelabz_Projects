package com.interfaceimplementation;

import java.util.ArrayList;

import com.module.PersonDetail;

public interface AdderssBook {
ArrayList<PersonDetail> addPerson();
ArrayList<PersonDetail> editPersonDetail(ArrayList<PersonDetail>existinglist);

ArrayList<PersonDetail> deletePesonDetail(ArrayList<PersonDetail>existinglist);
//void sortByZip(String filename);
void print(ArrayList<PersonDetail>personlist);
ArrayList<PersonDetail> exit(ArrayList<PersonDetail> filename);

void sortByZip(ArrayList<PersonDetail> personlist);
void sortByName(ArrayList<PersonDetail>personlist);
}
