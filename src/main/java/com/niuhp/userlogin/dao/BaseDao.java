package com.niuhp.userlogin.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BaseDao<T> {

	T findById(Serializable id);

	List<T> findAll();

	List<T> findByProperty(String propertyName, Object propertyValue);

	List<T> findByPropertyMap(Map<String, Object> propMap);

	T save(T entity);

	void update(T entity);

	void delete(T entity);

	void deleteById(Serializable id);
}
