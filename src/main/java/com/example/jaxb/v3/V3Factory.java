package com.example.jaxb.v3;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * aka. ObjectFactory
 */
@XmlRegistry
public class V3Factory {
	public Employee createEmployee() { return new Employee(); }
}
