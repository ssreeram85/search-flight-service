package com.tetrasoft.us.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.tetrasoft.us.dto.SearchFlightDto;

@RestController
@RequestMapping("/api/flight")
public class FlightSearchController {
	
	@RequestMapping("/search/{source}/{destination}")
	public List<SearchFlightDto> findflightBySourceAndDestination(@PathVariable(name = "source") String source,@PathVariable(name = "destination") String destination){
		RestTemplate template = new RestTemplate();
		String url= "http://localhost:8080/api/flight/flights/{source}/{destination}";
		Map<String, String> uriparamsmap = new HashMap<String, String>();
		uriparamsmap.put("source", source);
		uriparamsmap.put("destination", destination);
		ResponseEntity<List> forEntity = template.getForEntity(url, List.class, uriparamsmap);
		List<SearchFlightDto> list =forEntity.getBody();
		return list;
	}

}
