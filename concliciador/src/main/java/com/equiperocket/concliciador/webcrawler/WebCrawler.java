package com.equiperocket.concliciador.webcrawler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WebCrawler {
	
	@Autowired
	RestTemplate consume;

	public WebCrawler() {
	}

	public String fetchHtmlFrom(String url) {
		ResponseEntity<String> str = consume.getForEntity(url, String.class);
		
		return str.getBody();
		

	}


}
