package com.shubham.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.shubham.binding.StockPriceResponce;
import com.shubham.service.StockPriceService;

@RestController
public class StockPriceRestController {

	@Autowired
	private StockPriceService service;
	
	@GetMapping("/price/{companyName}")
	public ResponseEntity<StockPriceResponce> getStockPrice(@PathVariable String companyName){
		StockPriceResponce responce = service.getStockPrice(companyName);
		return new ResponseEntity<>(responce, HttpStatus.OK);
		
		
	}
}
