package com.sql.api.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.Tuple;
import javax.persistence.TupleElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sql.api.modal.InputValue;


/**
 * @author Bharathidasan
 *
 */
@Repository
public class SqlRepository {
	
	@Autowired
	private EntityManager entityManagerObj;
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> runSql(InputValue inputValue){	
		
		List<Map<String, Object>> response = new ArrayList<Map<String, Object>>();
		Query query =entityManagerObj.createNativeQuery(inputValue.getSql(),Tuple.class);
		List<Tuple> resultList=query.getResultList();
		response = convertTuplesToMap(resultList);
		return response;
	}
	
	/**
	 * @param tuples
	 * @return
	 */
	public static List<Map<String, Object>> convertTuplesToMap(List<Tuple> tupleList) {
		
	    List<Map<String, Object>> convertedReponse = new ArrayList<Map<String, Object>>();
	    for (Tuple tupleObj : tupleList) {
	        Map<String, Object> map = new HashMap<>();
	        for (TupleElement<?> key : tupleObj.getElements()) {
	        	map.put(key.getAlias(), tupleObj.get(key));
	        }
	        convertedReponse.add(map);
	    }
	    return convertedReponse;
	}
	

}
