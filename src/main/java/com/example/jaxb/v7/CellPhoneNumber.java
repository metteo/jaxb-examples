package com.example.jaxb.v7;

import javax.xml.bind.annotation.XmlType;

@XmlType(name = "cell-phone")
public class CellPhoneNumber extends PhoneNumber {
	
	public String operator;

	@Override
	public String toString() {
		return "CellPhoneNumber [operator=" + operator + ", number=" + number
				+ "]";
	}
}
