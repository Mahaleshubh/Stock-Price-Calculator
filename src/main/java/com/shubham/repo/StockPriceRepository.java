package com.shubham.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.shubham.entity.StockPrice;

public interface StockPriceRepository extends JpaRepository<StockPrice,Integer> {

	@Query("select companyStockPrice from StockPrice where companyName=:companyName")
	public Double findStockPriceByCompanyName(String companyName);
}
