package com.redhat.brms.demo.etf;

public class ETF {
	
	//ETF stock symbol
	private String symbol;
	//ETF name
	private String name;
	//ETF category 
	private String category;
	//ETF asset class 
	private String assetClass;
	//ETF overall risk a scale of 1 - 5 with 5 being the largest risk
	private Integer riskRange;
	//ETF overall return on a scale of 1 - 5 with 5 being the best
	private Integer returnRange;
	//ETF overall rating on a scale of 1 - 5 with 5 being the best
	private Integer rating;
	//ETF annual yield percentage
	private Double yield;
	//ETF YTD return
	private Double ytdReturn;
	//ETF expense ratio
	private Double expenseRange;
	//ETF link
	private String link;
	
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAssetClass() {
		return assetClass;
	}
	public void setAssetClass(String assetClass) {
		this.assetClass = assetClass;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public Double getYield() {
		return yield;
	}
	public void setYield(Double yield) {
		this.yield = yield;
	}
	public Double getYtdReturn() {
		return ytdReturn;
	}
	public void setYtdReturn(Double ytdReturn) {
		this.ytdReturn = ytdReturn;
	}
	public Double getExpenseRange() {
		return expenseRange;
	}
	public void setExpenseRange(Double expense) {
		this.expenseRange = expense;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Integer getRiskRange() {
		return riskRange;
	}
	public void setRiskRange(Integer riskRange) {
		this.riskRange = riskRange;
	}
	public Integer getReturnRange() {
		return returnRange;
	}
	public void setReturnRange(Integer returnRange) {
		this.returnRange = returnRange;
	}
	
}
