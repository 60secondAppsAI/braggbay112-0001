package com.braggbay112.dao;

import java.util.List;

import com.braggbay112.dao.GenericDAO;
import com.braggbay112.domain.Feedback;





public interface FeedbackDAO extends GenericDAO<Feedback, Integer> {
  
	List<Feedback> findAll();
	






}


