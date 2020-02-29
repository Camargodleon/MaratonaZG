package com.equiperocket.concliciador.crawlercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.equiperocket.concliciador.webcrawler.WebCrawler;

@RestController
@RequestMapping("/")
public class CrawlerController {
	
	@Autowired
	WebCrawler crawler;
	
	
	@PostMapping
	public ResponseEntity<String> crawl(@RequestBody String url){
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(crawler.fetchHtmlFrom(url));
		
	}
	
	

}
