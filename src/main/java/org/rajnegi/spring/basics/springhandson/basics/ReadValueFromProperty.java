package org.rajnegi.spring.basics.springhandson.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = { "classpath:app.properties" })
public class ReadValueFromProperty {

	@Value("${placeholder}")
	private String placeHolder;
	
	@Autowired
	Environment env;

	public String getUrl() {
		return env.getProperty("url")+"; "+placeHolder;
	}
	
}
