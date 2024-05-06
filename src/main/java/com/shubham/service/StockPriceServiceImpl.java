package com.shubham.service;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;

import com.shubham.binding.StockPriceResponce;
import com.shubham.repo.StockPriceRepository;

public class StockPriceServiceImpl implements  StockPriceService {

	@Autowired
	private StockPriceRepository stockPriceRepo;
	
	
	
	
	@Override
	public StockPriceResponce getStockPrice(String comapnyName) {
		Double stockPrice = stockPriceRepo.findStockPriceByCompanyName(comapnyName);
		
		StockPriceResponce responce =new StockPriceResponce();
		responce.setCompanyName(comapnyName);
		responce.setCompanyStockprice(stockPrice);
		
		
		
		return responce;
	}

}
