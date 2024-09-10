package com.user.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.api.binding.CitizenApp;
import com.user.api.service.AppRegService;

@RestController
public class AppRestController {
	@Autowired
	private AppRegService service;
	
	@PostMapping("/app")
	public ResponseEntity<String>  CreateApp(@RequestBody CitizenApp app){
		String response = service.createCitizenApp(app);
		return new ResponseEntity<String>(response,HttpStatus.OK);
		
	}
	
	@GetMapping("/applications/{userId}/{userTpye}")
	public ResponseEntity<List<CitizenApp>> getApplication(@PathVariable("userId") Integer  userId, @PathVariable("userType") String userTpye){
		List<CitizenApp> apps = service.getApplication(userId, userTpye);
		return new ResponseEntity<List<CitizenApp>>(apps, HttpStatus.OK);
	}

}
