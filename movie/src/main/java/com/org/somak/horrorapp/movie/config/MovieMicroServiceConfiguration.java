package com.org.somak.horrorapp.movie.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="movie.micro.service")
public class MovieMicroServiceConfiguration {

	private String defaulttag;

	public String getDefaulttag() {
		return defaulttag;
	}

	public void setDefaulttag(String defaulttag) {
		this.defaulttag = defaulttag;
	}
	
	
}
