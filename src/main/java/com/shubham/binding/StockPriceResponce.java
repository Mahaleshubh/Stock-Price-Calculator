package com.shubham.binding;

public class StockPriceResponce {

	private String companyName;
	
	private Double companyStockprice;
	
	private Integer portNumber;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Double getCompanyStockprice() {
		return companyStockprice;
	}

	public void setCompanyStockprice(Double companyStockprice) {
		this.companyStockprice = companyStockprice;
	}

	public Integer getPortNumber() {
		return portNumber;
	}

	public void setPortNumber(Integer portNumber) {
		this.portNumber = portNumber;
	}
}
