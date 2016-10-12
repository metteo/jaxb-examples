package com.example.jaxb.v6;

import java.util.Locale;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
public class Employee {
	
	public String name;
	
	public int age;
	
	@XmlJavaTypeAdapter(LocaleAdapter.class)
	@XmlSchemaType(name="language")
	public Locale nativeLanguage;
	
	public Locale extraLanguage;

	@Override
	public String toString() {
		return "v6.Employee [name=" + name + ", age=" + age + ", nativeLanguage="
				+ nativeLanguage + ", extraLanguage=" + extraLanguage + "]";
	}
}
