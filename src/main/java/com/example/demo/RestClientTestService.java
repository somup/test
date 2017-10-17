package com.example.demo;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.intuit.platform.common.exception.CommonException;


@RestController
public class RestClientTestService {

	
	@RequestMapping(value="/testURL")
	public void test() throws CommonException, InterruptedException
	{
		String uri="https://qbnsubscription-qal.api.intuit.com/scripts/subisapi.dll";
		 String request="<ISUBSCRIPTION_GETBYSUBSCRIPTIONNUMBER>\n" + 
		 		"   <SUBSCRIPTIONNUMBER><![CDATA[1713839]]></SUBSCRIPTIONNUMBER>\n" + 
		 		"</ISUBSCRIPTION_GETBYSUBSCRIPTIONNUMBER>";
		
				 HttpEntity entity = new HttpEntity(request,getHeaders());
				
				          
				        
		 RestTemplate template = new RestTemplate();
		 ResponseEntity<String> obj1=template.exchange(uri, HttpMethod.POST,entity, String.class);
		 System.out.println(obj1);
			 
		 		 
		
	}
	
	private HttpHeaders getHeaders()
	{
		HttpHeaders header = new HttpHeaders();
		header.add("Accept", "application/xml");
		header.add("authorization", "Intuit_IAM_Authentication intuit_token_type=IAM-Ticket,intuit_appid=Intuit.cto.qbn.subscription,intuit_token=V1-227-b3316n32szq4kete9oubdc,intuit_userid=123146698498039,intuit_app_secret=LFK303cY10v50kVc2dgmR7,intuit_realmid=123146698499104");
		header.add("intuit_originatingip","123.45.67.89");
		header.add("intuit_offeringId", "Intuit.cto.iam.ius.tests");
		header.add("intuit_tid", "Junit_8db8-4840-b7cd-9e63693f8742");
		header.add("intuit_locale", "en_CA");
		header.add("Content-Type", "application/xml");
		return header;
	}
}
