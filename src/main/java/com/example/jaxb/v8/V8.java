package com.example.jaxb.v8;

import static java.lang.System.out;

import com.example.jaxb.V0;

/**
 * Inheritance: xs:choice
 */
public class V8 extends V0 {
	public static void main(String[] args) {
		V8 v = new V8();
		
		//Init
		
		v.initContext(Employee.class);
		
		//Sample instance

		Employee e = new Employee();
		e.age = 5;
		e.name = "John";
		
		CellPhoneNumber cellNumber = new CellPhoneNumber();
		cellNumber.number = "+48 456";
		cellNumber.operator = "Play";
		
		e.number = cellNumber;
		
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
