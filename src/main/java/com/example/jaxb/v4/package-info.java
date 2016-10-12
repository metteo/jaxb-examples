@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlSchemaTypes(
	@XmlSchemaType(
		namespace = "http://www.w3.org/2001/XMLSchema", 
		name = "token", 
		type = String.class
	)
)
@XmlJavaTypeAdapters({
	@XmlJavaTypeAdapter(value = CollapsedStringAdapter.class, type = String.class)
})
@XmlSchema(
	namespace = "http://abc.com", 
	xmlns = {
		@XmlNs(prefix = "abc", namespaceURI = "http://abc.com")
	},
	attributeFormDefault = XmlNsForm.UNSET,
	elementFormDefault = XmlNsForm.UNSET
)
package com.example.jaxb.v4;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSchemaTypes;
import javax.xml.bind.annotation.XmlSchema;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;