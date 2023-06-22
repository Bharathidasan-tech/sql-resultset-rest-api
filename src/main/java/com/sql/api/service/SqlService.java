package com.sql.api.service;

import java.util.Map;

import com.sql.api.modal.InputValue;

/**
 * @author Bharathidasan
 *
 */
public interface SqlService {
	
	public Map<String, Object> runSql(InputValue inputValue);

}
