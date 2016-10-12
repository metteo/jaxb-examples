package com.example.jaxb.v8;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "cell-phone")
public class CellPhoneNumber extends PhoneNumber {
	
	public String number;
	public String operator;

	@Override
	public String toString() {
		return "CellPhoneNumber [operator=" + operator + ", number=" + number
				+ "]";
	}
}
