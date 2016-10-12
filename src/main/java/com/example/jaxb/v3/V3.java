package com.example.jaxb.v3;

import static java.lang.System.out;

import com.example.jaxb.V0;

/**
 * Class level annotations
 */
public class V3 extends V0 {
	public static void main(String[] args) {
		V3 v = new V3();
		
		//Init
		
		v.initContext(V3Factory.class);
		
		//Sample instance

		Employee e = new Employee();
		e.age = 6;
		e.name = "Jane";
		
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
