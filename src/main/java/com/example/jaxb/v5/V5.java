package com.example.jaxb.v5;

import static java.lang.System.out;

import java.util.ArrayList;

import com.example.jaxb.V0;

/**
 * Field/property level annotations
 */
public class V5 extends V0 {
	public static void main(String[] args) {
		V5 v = new V5();
		
		//Init
		
		v.initContext(Employee.class);
		
		//Sample instance

		Employee e = new Employee();
		e.age = 5;
		e.nejm = "John";
		
		e.priority = Priority.HIGH;
		
		e.map = new ArrayList<Entry>();
		e.map.add(new Entry("gender", "male"));
		e.map.add(new Entry("age", "6"));
		
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
