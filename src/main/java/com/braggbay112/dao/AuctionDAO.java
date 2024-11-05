package com.braggbay112.dao;

import java.util.List;

import com.braggbay112.dao.GenericDAO;
import com.braggbay112.domain.Auction;





public interface AuctionDAO extends GenericDAO<Auction, Integer> {
  
	List<Auction> findAll();
	






}


