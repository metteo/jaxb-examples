package com.example.jaxb.v7;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	
	public String name;
	
	public int age;
	
	@XmlElement
	public PhoneNumber number;

	@Override
	public String toString() {
		return "v7.Employee [name=" + name + ", age=" + age + ", number="
				+ number + "]";
	}
}
