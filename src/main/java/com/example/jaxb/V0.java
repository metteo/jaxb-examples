package com.example.jaxb;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public abstract class V0 {
	
	protected JAXBContext jaxbContext;

	public void initContext(Class<?>... classes){
		try {
			jaxbContext = JAXBContext.newInstance(classes);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public <T> String marshal(T o) {
		try {
			Marshaller m = jaxbContext.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			StringWriter sw = new StringWriter();
			m.marshal(o, sw);
			
			return sw.toString();
		} catch (JAXBException e) {
			e.printStackTrace();
			
			return null;
		}
	}
	
	public <T> T unmarshal(String xml) {
		try {
			Unmarshaller um = jaxbContext.createUnmarshaller();
			
			@SuppressWarnings("unchecked")
			T o = (T)um.unmarshal(new StringReader(xml));
			
			return o;
		} catch (JAXBException e) {
			e.printStackTrace();
			
			return null;
		}	
	}
	
	public <T> JAXBElement<T> unmarshal(String xml, Class<T> resultType) {
		try {
			Unmarshaller um = jaxbContext.createUnmarshaller();
			
			JAXBElement<T> o = um.unmarshal(new StreamSource(new StringReader(xml)), resultType);
			
			return o;
		} catch (JAXBException e) {
			e.printStackTrace();
			
			return null;
		}	
	}
	
	public String generateSchema() {
		try {
			final StringWriter schema = new StringWriter();
			
			jaxbContext.generateSchema(new SchemaOutputResolver() {
				
				@Override
				public Result createOutput(String namespaceUri, String suggestedFileName)
						throws IOException {
					
					schema.write(suggestedFileName + ": " + namespaceUri + "\n");
					
			        StreamResult result = new StreamResult(schema);
			        result.setSystemId(suggestedFileName);
			        return result;
				}
			});
			
			return schema.toString();
		} catch (IOException e) {
			e.printStackTrace();
			
			return null;
		}
	}
}
