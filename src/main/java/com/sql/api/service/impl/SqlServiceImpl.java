package com.sql.api.service.impl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sql.api.config.AppConfig;
import com.sql.api.modal.InputValue;
import com.sql.api.repository.SqlRepository;
import com.sql.api.service.SqlService;

/**
 * @author Bharathidasan
 *
 */
@Service
public class SqlServiceImpl implements SqlService {
	
	@Autowired
	SqlRepository sqlRepository;
	
	@Autowired
    private AppConfig appConfig;


	@Override
	public Map<String, Object> runSql(InputValue inputValue) {
		
		Map<String, Object> response = new LinkedHashMap<String, Object>();
		List<Map<String, Object>> responseData = sqlRepository.runSql(inputValue);
		response.put(appConfig.getApiResponse(), responseData);
		return response;
	}

}
