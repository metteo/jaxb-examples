package com.example.jaxb.v1;

import static java.lang.System.out;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import com.example.jaxb.V0;

/**
 * No annotations
 */
public class V1 extends V0 {
	public static void main(String[] args) {
		V1 v = new V1();
		
		//Init
		
		v.initContext(Employee.class);
		
		//Sample instance

		Employee e = new Employee();
		e.age = 5;
		e.name = "John";
		
		//Marshalling
		
		out.println(e);
		out.println("------------------------------------------------");
		
		JAXBElement<Employee> e1 = new JAXBElement<Employee>(
			new QName("http://abc.com", "employee"), 
			Employee.class, 
			e
		);
		
		String xml = v.marshal(e1);
		
		out.println(xml);
		out.println("------------------------------------------------");
		
		//Unmarshalling
		
		JAXBElement<Employee> e2 = v.unmarshal(xml, Employee.class);
		
		out.println(e2.getName());
		out.println(e2.getValue());
		out.println("------------------------------------------------");
		
		//Schema
		
		out.println(v.generateSchema());
	}
}
