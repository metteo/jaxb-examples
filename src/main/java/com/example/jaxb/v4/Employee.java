package com.example.jaxb.v4;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	
	public String name;
	
	public int age;
	
	public void setNumber(String number) {}
	public String getNumber() { return null; }

	@Override
	public String toString() {
		return "v4.Employee [name=" + name + ", age=" + age + "]";
	}
}
