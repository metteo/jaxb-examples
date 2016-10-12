package com.example.jaxb.v4;

import static java.lang.System.out;

import com.example.jaxb.V0;

/**
 * Package level annotations
 */
public class V4 extends V0 {
	public static void main(String[] args) {
		V4 v = new V4();
		
		//Init
		
		v.initContext(Employee.class);
		
		//Sample instance

		Employee e = new Employee();
		e.age = 5;
		e.name = " John ";
		
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
