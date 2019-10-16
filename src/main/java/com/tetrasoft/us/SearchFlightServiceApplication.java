package com.tetrasoft.us;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.tetrasoft.us.dto.SearchFlightDto;

@SpringBootApplication
public class SearchFlightServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchFlightServiceApplication.class, args);
	}

//	@PostConstruct
//	public void test() {
//
//		RestTemplate template = new RestTemplate();
//		String url= "http://localhost:8080/api/flight/flights/{source}/{destination}";
//		Map<String, String> uriparamsmap = new HashMap<String, String>();
//		uriparamsmap.put("source", "Hyderabad");
//		uriparamsmap.put("destination", "Tirupati");
//		ResponseEntity<SearchFlightDto> res = template.getForEntity(url, SearchFlightDto.class, uriparamsmap);
//		System.out.println(res.getBody());
//	}
}
