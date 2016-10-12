package com.example.jaxb.v8_1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	
	public String name;
	
	public int age;
	
	@XmlElements({
		@XmlElement(name = "cell", type = CellPhoneNumber.class),
		@XmlElement(name = "home", type = HomePhoneNumber.class),
		@XmlElement(name = "work", type = WorkPhoneNumber.class)
	})
	public PhoneNumber number;

	@Override
	public String toString() {
		return "v8_1.Employee [name=" + name + ", age=" + age + ", number="
				+ number + "]";
	}
}
