package com.sql.api.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sql.api.modal.InputValue;
import com.sql.api.service.SqlService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Bharathidasan
 *
 */
@RestController
@RequestMapping("api/sql")
@Slf4j
public class SqlApiController {
	
	@Autowired
	SqlService sqlService;
	
	
	@PostMapping("/query")
	private ResponseEntity<Object> runSql(@ModelAttribute InputValue inputValue) {
		
		log.info(" Input SQL : "  +inputValue.getSql());
		
		Map<String, Object>  mapResponse = sqlService.runSql(inputValue);
        	  	
    	return new ResponseEntity<Object>(mapResponse, HttpStatus.OK);
		
	}

}
