package com.example.jaxb.v5;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class Entry {
	
	@XmlAttribute(name = "key", /*namespace = "http://abc.com",*/ required = true)
	public String key;
	
	@XmlValue
	public String value;

	public Entry() {}

	public Entry(String key, String value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString() {
		return key + "=" + value;
	}
}
