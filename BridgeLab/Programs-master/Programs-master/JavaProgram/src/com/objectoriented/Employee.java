package com.objectoriented;

public class Employee {
private String Empname;
private String Empno;
private String mobilenum;
public String getEmpname() {
	return Empname;
}
public void setEmpname(String empname) {
	Empname = empname;
}
public String getEmpno() {
	return Empno;
}
public void setEmpno(String empno) {
	Empno = empno;
}
public String getMobilenum() {
	return mobilenum;
}
public void setMobilenum(String mobilenum) {
	this.mobilenum = mobilenum;
}
@Override
	public String toString() {
	return "Employee [Empname=" + Empname + ", Empno=" + Empno + ", mobilenum=" + mobilenum
    + "]";	}
}
