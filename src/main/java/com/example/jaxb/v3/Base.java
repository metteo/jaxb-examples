package com.example.jaxb.v3;

import javax.xml.bind.annotation.XmlTransient;

@XmlTransient
public class Base {
	private boolean enabled;

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}
