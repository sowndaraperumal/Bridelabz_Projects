package com.model;

public class Patient {

	@Override
	public String toString() {
		return "Patient [name=" + name + ", moblienumber=" + moblienumber + ", id=" + id  + ", age="
				+ age + "]";
	}
	private String name;
	private String  moblienumber;
	private int id;
    private int age;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMoblienumber() {
		return moblienumber;
	}
	public void setMoblienumber(String moblienumber) {
		this.moblienumber = moblienumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
    public int compareTo(Patient other) {
        return name.compareTo(other.name);
    }
}