package com.redhat.brms.demo.etf;

public class CriteriaSelection {
	
	//User's age
	private Integer age;
	
	//Acceptable risk selected by user
	private Integer selectedRisk;
	
	//Acceptable rating selected by user
	private Integer selectedRating;
	
	//Acceptable return selected by user
	private Integer selectedReturn;
	
	//Acceptable expense selected by user
	private String selectedExpense;
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getSelectedRisk() {
		return selectedRisk;
	}
	public void setSelectedRisk(Integer selectedRisk) {
		this.selectedRisk = selectedRisk;
	}
	public Integer getSelectedRating() {
		return selectedRating;
	}
	public void setSelectedRating(Integer selectedRating) {
		this.selectedRating = selectedRating;
	}
	public Integer getSelectedReturn() {
		return selectedReturn;
	}
	public void setSelectedReturn(Integer selectedReturn) {
		this.selectedReturn = selectedReturn;
	}
	public String getSelectedExpense() {
		return selectedExpense;
	}
	public void setSelectedExpense(String selectedExpense) {
		this.selectedExpense = selectedExpense;
	}
	
}
