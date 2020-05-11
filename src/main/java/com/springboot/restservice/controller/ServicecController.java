package com.springboot.restservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest")
@RestController
public class ServicecController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ServicecController.class);

	@RequestMapping(value = "/service", produces = { MediaType.APPLICATION_JSON_VALUE }, method = RequestMethod.GET)
	public ResponseEntity<String> productCopyEventRequest() {

		LOGGER.info("This is a Sample Reset Service Call. Rest API call sucessfully invoked.");
		return new ResponseEntity<String>("SUCCESS", HttpStatus.ACCEPTED);

	}
}
