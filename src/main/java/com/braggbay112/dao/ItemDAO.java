package com.braggbay112.dao;

import java.util.List;

import com.braggbay112.dao.GenericDAO;
import com.braggbay112.domain.Item;





public interface ItemDAO extends GenericDAO<Item, Integer> {
  
	List<Item> findAll();
	






}


