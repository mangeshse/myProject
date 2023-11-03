package com.config;

import com.utilities.FileUtile;

public class Configuration {
	FileUtile file = new FileUtile();

	public String getUrl(String env) {
		return file.readConfigPropertiesFiles("\\src\\main\\resources\\config.properties", "app." + env + ".url");
	}
}
