package com.example.jaxb.v3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlEnum//(String.class)
public enum Priority {
	HIGH, NORMAL, LOW
}
