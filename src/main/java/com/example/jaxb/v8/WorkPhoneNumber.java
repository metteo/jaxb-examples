package com.example.jaxb.v8;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "work-phone")
public class WorkPhoneNumber extends PhoneNumber {
	
	public String number;
	public String workingHours;

	@Override
	public String toString() {
		return "WorkPhoneNumber [workingHours=" + workingHours + ", number="
				+ number + "]";
	}
}
