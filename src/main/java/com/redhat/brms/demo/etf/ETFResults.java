package com.redhat.brms.demo.etf;

import java.util.ArrayList;

public class ETFResults {
	private boolean eligible = true;
	private ArrayList<ETF> userSelectedETFList;
	private ArrayList<ETF> ageGroupETFList;
	
	public boolean isEligible() {
		return eligible;
	}

	public void setEligible(boolean eligible) {
		this.eligible = eligible;
	}

	public ArrayList<ETF> getUserSelectedETFList() {
		return userSelectedETFList;
	}

	public void setUserSelectedETFList(ArrayList<ETF> userSelectedETFList) {
		this.userSelectedETFList = userSelectedETFList;
	}

	public ArrayList<ETF> getAgeGroupETFList() {
		return ageGroupETFList;
	}

	public void setAgeGroupETFList(ArrayList<ETF> ageGroupETFList) {
		this.ageGroupETFList = ageGroupETFList;
	}
}
