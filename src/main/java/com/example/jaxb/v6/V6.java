package com.example.jaxb.v6;

import static java.lang.System.out;

import java.util.Locale;

import com.example.jaxb.V0;

/**
 * XmlAdapters
 */
public class V6 extends V0 {
	public static void main(String[] args) {
		V6 v = new V6();
		
		//Init
		
		v.initContext(Employee.class);
		
		//Sample instance

		Employee e = new Employee();
		e.age = 5;
		e.name = "John";
		e.nativeLanguage = Locale.ENGLISH;
		//e.extraLanguage = Locale.ITALIAN; // no default constructor
		
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
