package com.example.jaxb.v8;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "home-phone")
public class HomePhoneNumber extends PhoneNumber {
	
	public String number;
	public String availableAfter;

	@Override
	public String toString() {
		return "HomePhoneNumber [availableAfter=" + availableAfter
				+ ", number=" + number + "]";
	}
}
