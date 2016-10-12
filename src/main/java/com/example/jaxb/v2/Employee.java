package com.example.jaxb.v2;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	
	public String name;
	
	public int age;

	@Override
	public String toString() {
		return "v2.Employee [name=" + name + ", age=" + age + "]";
	}
}
