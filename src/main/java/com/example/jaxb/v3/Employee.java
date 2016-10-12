package com.example.jaxb.v3;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlType(
	namespace = "http://abc.com", 
	name = /*""*/"EmployeeType", 
	propOrder = /*{}*/{"name", "age", "enabled"}
)
@XmlRootElement(
	namespace = "http://def.com", 
	name = "employe"
)
@XmlSeeAlso({Priority.class})
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
//@XmlJavaTypeAdapter
public class Employee extends Base {
	
	public String name;
	
	public int age;

	@Override
	public String toString() {
		return "v3.Employee [name=" + name + ", age=" + age + ", isEnabled()="
				+ isEnabled() + "]";
	}
}
