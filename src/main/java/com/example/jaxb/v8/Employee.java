package com.example.jaxb.v8;

import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	
	public String name;
	
	public int age;
	
	@XmlElementRef
	public PhoneNumber number;

	@Override
	public String toString() {
		return "v8.Employee [name=" + name + ", age=" + age + ", number="
				+ number + "]";
	}
}
