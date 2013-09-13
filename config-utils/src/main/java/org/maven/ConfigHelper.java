package org.maven;

import java.util.HashMap;
import java.util.Map.Entry;

public class ConfigHelper {

	private HashMap<String, String> config;

	public ConfigHelper() {
		this(new HashMap<String, String>());
	}

	public ConfigHelper(HashMap<String, String> config) {
		super();
		this.config = config;
	}

	public StringHelper getStringHelper() {
		return new StringHelper(toString());
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		
		for (Entry<String, String> entry : config.entrySet()) {
			result.append(entry.getKey());
			result.append(": ");
			result.append(entry.getValue());
			result.append("\n");
		}
		
		return result.toString();
	}
	
	
}
