package com.example.jaxb.v5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlEnum(Integer.class)
public enum Priority {
	@XmlEnumValue("1") HIGH, 
	@XmlEnumValue("0") NORMAL, 
	@XmlEnumValue("-1") LOW
}
