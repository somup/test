package com.example.demo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.intuit.platform.rest.client.config.RestClientApplicationContext;
import com.intuit.platform.services.common.logging.framework.LogScrubber;



@Configuration
@Import({  RestClientApplicationContext.class })
@ComponentScan({"com.intuit.platform.webs.services.account.rest, com.intuit.platform.webs.services.account.service, com.intuit.platform.webs.services.account.validations, com.intuit.platform.webs.services.account.integrations" })
public class RestApplicationContext {
	
	@Bean(name="RestClientLogScrubber")
	public LogScrubber logScrubber(){
		LogScrubber logScrubber = new LogScrubber();
		logScrubber.setObjectFieldsToMask("vatRegistrationId");
		logScrubber.setXmlFieldsToMask("vatRegistrationId");
		logScrubber.setJsonFieldsToMask("vatRegistrationId");
		return logScrubber;
	}
}