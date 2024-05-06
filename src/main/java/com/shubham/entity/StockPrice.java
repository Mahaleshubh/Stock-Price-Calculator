package com.shubham.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="STOCK-PRICE-DTLS")
public class StockPrice {

	@Id
	@Column(name="STOCK_PRICE_ID")
	private Integer stockId;
	@Column(name="COMPANY_NAME")
	private String companyName;
	@Column(name="COMPANY_STOCK_PRICE")
	private Double companyStockPrice;
	public Integer getStockId() {
		return stockId;
	}
	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Double getCompanyStockPrice() {
		return companyStockPrice;
	}
	public void setCompanyStockPrice(Double companyStockPrice) {
		this.companyStockPrice = companyStockPrice;
	}
	@Override
	public String toString() {
		return "StockPrice [stockId=" + stockId + ", companyName=" + companyName + ", companyStockPrice="
				+ companyStockPrice + "]";
	}
	
}
