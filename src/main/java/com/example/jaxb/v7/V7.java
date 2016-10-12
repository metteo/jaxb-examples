package com.example.jaxb.v7;

import static java.lang.System.out;

import com.example.jaxb.V0;

/**
 * Inheritance: xsi:type
 */
public class V7 extends V0 {
	public static void main(String[] args) {
		V7 v = new V7();
		
		//Init
		
		v.initContext(Employee.class);
		
		//Sample instance

		Employee e = new Employee();
		e.age = 5;
		e.name = "John";
		
		HomePhoneNumber homeNumber = new HomePhoneNumber();
		homeNumber.number = "+48 123";
		homeNumber.availableAfter = "6 PM";
		
		e.number = homeNumber;
		
		//Marshalling
		
		out.println(e);
		out.println("------------------------------------------------");
		
		String xml = v.marshal(e);
		
		out.println(xml);
		out.println("------------------------------------------------");
		
		//Unmarshalling
		
		Employee e2 = v.unmarshal(xml);

		out.println(e2);
		out.println("------------------------------------------------");
		
		//Schema
		
		out.println(v.generateSchema());
	}
}
