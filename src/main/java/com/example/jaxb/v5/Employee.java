package com.example.jaxb.v5;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Employee {
	
	@XmlElement(name = "name", /*namespace = "http://def.com",*/ required = true)
	public String nejm;
	
	@XmlElementWrapper
	@XmlElement(name = "entry")
	public List<Entry> map;
	
	@XmlTransient
	public int age;
	
	public Priority priority;
	
	@XmlElement(required = true, nillable = true)
	public String nillableExample;

	@Override
	public String toString() {
		return "v5.Employee [nejm=" + nejm + ", map=" + map + ", age=" + age
				+ ", priority=" + priority + "]";
	}
}
