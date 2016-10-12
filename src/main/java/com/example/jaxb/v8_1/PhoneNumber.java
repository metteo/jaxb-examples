package com.example.jaxb.v8_1;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlSeeAlso({
	CellPhoneNumber.class, 
	HomePhoneNumber.class, 
	WorkPhoneNumber.class
})
@XmlType(name = "phone")
public abstract class PhoneNumber {
}
