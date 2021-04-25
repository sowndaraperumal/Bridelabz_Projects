package com.module;

public class PersonAddressDetail {
private String city;
private long zipcode;
private String state;
private String phonenumber;
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public long getZipcode() {
	return zipcode;
}
public void setZipcode(long zipcode2) {
	this.zipcode = zipcode2;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}
@Override
public String toString() {
	return "PersonAddressDetail [city=" + city + ", zipcode=" + zipcode + ", state=" + state + ", phonenumber="
			+ phonenumber + "]";
}

}
