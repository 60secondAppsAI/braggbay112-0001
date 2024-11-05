package com.braggbay112.dao;

import java.util.List;

import com.braggbay112.dao.GenericDAO;
import com.braggbay112.domain.Transaction;





public interface TransactionDAO extends GenericDAO<Transaction, Integer> {
  
	List<Transaction> findAll();
	






}


