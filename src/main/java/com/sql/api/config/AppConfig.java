package com.sql.api.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


/**
 * @author Bharathidasan
 * @version 1.0
 * @see AppConfig
 */
@Component
@PropertySource({"classpath:app-config.properties" })
public class AppConfig
{

        
    @Value("${api.response}")
    private String apiResponse;

	/**
	 * @return the apiResponse
	 */
	public String getApiResponse() {
		return apiResponse;
	}

	/**
	 * @param apiResponse the apiResponse to set
	 */
	public void setApiResponse(String apiResponse) {
		this.apiResponse = apiResponse;
	} 
	

}
