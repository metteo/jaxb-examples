package com.example.jaxb.v7;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlSeeAlso({
	CellPhoneNumber.class, 
	HomePhoneNumber.class, 
	WorkPhoneNumber.class
})
@XmlType(name = "phone")
public abstract class PhoneNumber {
	
	public String number;
}
