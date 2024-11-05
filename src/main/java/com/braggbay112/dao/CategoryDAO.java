package com.braggbay112.dao;

import java.util.List;

import com.braggbay112.dao.GenericDAO;
import com.braggbay112.domain.Category;





public interface CategoryDAO extends GenericDAO<Category, Integer> {
  
	List<Category> findAll();
	






}


