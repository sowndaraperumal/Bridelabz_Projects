package com.bridgelabz.behavoiralpattern;

public class User {
private String name;

public String getName() {
	return name;
}
public User(String user) {
this.name=user;
}
public void setName(String name) {
	this.name = name;
}
void sendMsg(String message)
{
ChatRoom.showMsg(this, message);	
}
}
