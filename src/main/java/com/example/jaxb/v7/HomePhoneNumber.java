package com.example.jaxb.v7;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "home-phone")
public class HomePhoneNumber extends PhoneNumber {
	
	public String availableAfter;

	@Override
	public String toString() {
		return "HomePhoneNumber [availableAfter=" + availableAfter
				+ ", number=" + number + "]";
	}
}
