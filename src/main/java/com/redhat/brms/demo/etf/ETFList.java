package com.redhat.brms.demo.etf;

import java.util.ArrayList;
import java.util.HashMap;

public class ETFList {
	
	public ArrayList<ETF> getAllETFs(){
		
		ArrayList<ETF> etfList = new ArrayList<ETF>();
		etfList.add(this.getEtf1());
		etfList.add(this.getEtf2());
		etfList.add(this.getEtf3());
		etfList.add(this.getEtf4());
		etfList.add(this.getEtf5());
		etfList.add(this.getEtf6());
		etfList.add(this.getEtf7());
		etfList.add(this.getEtf8());
		etfList.add(this.getEtf9());
		etfList.add(this.getEtf10());
		etfList.add(this.getEtf11());
		etfList.add(this.getEtf12());
		
		return etfList;
	}
	
	public ETF getEtf1() {
		
		ETF etf = new ETF();
		etf.setSymbol("SHY");
		etf.setName("iShares 1-3 Year Treasury Bond ETF");
		etf.setCategory("bond");
		etf.setAssetClass("government");
		etf.setRiskRange(2);
		etf.setReturnRange(3);
		etf.setRating(3);
		etf.setYield(0.58);
		etf.setYtdReturn(0.9);
		etf.setExpenseRange(0.15);
		etf.setLink("http://www.morningstar.com/etfs/ARCX/SHY/quote.html");

		return etf;
	}
	
	public ETF getEtf2() {
		
		ETF etf = new ETF();
		etf.setSymbol("TLT");
		etf.setName("iShares 20+ Year Treasury Bond ETF");
		etf.setCategory("Bond");
		etf.setAssetClass("Government");
		etf.setRiskRange(4);
		etf.setReturnRange(3);
		etf.setRating(4);
		//etf.setYield(2.4);
		//etf.setYtdReturn(9.3);
		etf.setExpenseRange(0.15);
		etf.setLink("http://www.morningstar.com/etfs/XNAS/TLT/quote.html");

		return etf;
	}

	public ETF getEtf3() {
		
		ETF etf = new ETF();
		etf.setSymbol("BIB");
		etf.setName("ProShares Ultra Nasdaq Biotechnology ETF");
		etf.setCategory("Leveraged");
		etf.setAssetClass("Equity");
		etf.setRiskRange(5);
		etf.setReturnRange(5);
		etf.setRating(5);
		//etf.setYield(2.4);
		//etf.setYtdReturn(9.3);
		etf.setExpenseRange(0.95);
		etf.setLink("http://www.morningstar.com/etfs/XNAS/BIB/quote.html");

		return etf;
	}
	
	public ETF getEtf4() {
		
		ETF etf = new ETF();
		etf.setSymbol("RYJ");
		etf.setName("Guggenheim Raymond James SB-1 Equity ETF");
		etf.setCategory("All Cap Equities");
		etf.setAssetClass("Equity");
		etf.setRiskRange(4);
		etf.setReturnRange(3);
		etf.setRating(3);
		//etf.setYield(2.4);
		//etf.setYtdReturn(9.3);
		etf.setExpenseRange(0.75);
		etf.setLink("http://www.morningstar.com/etfs/ARCX/RYJ/quote.html");

		return etf;
	}
	
	public ETF getEtf5() {
		
		ETF etf = new ETF();
		etf.setSymbol("BIV");
		etf.setName("Vanguard Intermediate-Term Bond ETF");
		etf.setCategory("Total Bond");
		etf.setAssetClass("Bond");
		etf.setRiskRange(5);
		etf.setReturnRange(5);
		etf.setRating(5);
		//etf.setYield(2.4);
		//etf.setYtdReturn(9.3);
		etf.setExpenseRange(0.09);
		etf.setLink("http://www.morningstar.com/etfs/ARCX/BIV/quote.html");

		return etf;
	}
	
	public ETF getEtf6() {
		
		ETF etf = new ETF();
		etf.setSymbol("FDL");
		etf.setName("First Trust Morningstar Dividend Leaders");
		etf.setCategory("Large Cap");
		etf.setAssetClass("Equity");
		etf.setRiskRange(2);
		etf.setReturnRange(5);
		etf.setRating(5);
		//etf.setYield(2.4);
		//etf.setYtdReturn(9.3);
		etf.setExpenseRange(0.45);
		etf.setLink("http://www.morningstar.com/etfs/ARCX/FDL/quote.html");

		return etf;
	}
	
	public ETF getEtf7() {
		
		ETF etf = new ETF();
		etf.setSymbol("IUSG");
		etf.setName("iShares Core U.S. Growth ETF");
		etf.setCategory("Large Cap");
		etf.setAssetClass("Equity");
		etf.setRiskRange(2);
		etf.setReturnRange(4);
		etf.setRating(4);
		//etf.setYield(2.4);
		//etf.setYtdReturn(9.3);
		etf.setExpenseRange(0.07);
		etf.setLink("http://www.morningstar.com/etfs/ARCX/IUSG/quote.html");

		return etf;
	}
	
	public ETF getEtf8() {
		
		ETF etf = new ETF();
		etf.setSymbol("SPLV");
		etf.setName("PowerShares S&P 500 Low Volatility Portfolio ETF");
		etf.setCategory("Large Cap Blend");
		etf.setAssetClass("Equity");
		etf.setRiskRange(1);
		etf.setReturnRange(4);
		etf.setRating(4);
		//etf.setYield(2.4);
		//etf.setYtdReturn(9.3);
		etf.setExpenseRange(0.25);
		etf.setLink("http://www.morningstar.com/etfs/ARCX/SPLV/quote.html");

		return etf;
	}
	
	public ETF getEtf9() {
		
		ETF etf = new ETF();
		etf.setSymbol("VNQ");
		etf.setName("Vanguard REIT Index Fund ETF");
		etf.setCategory("Real Estate");
		etf.setAssetClass("Real Estate");
		etf.setRiskRange(4);
		etf.setReturnRange(4);
		etf.setRating(3);
		//etf.setYield(2.4);
		//etf.setYtdReturn(9.3);
		etf.setExpenseRange(0.12);
		etf.setLink("http://www.morningstar.com/etfs/ARCX/VNQ/quote.html");

		return etf;
	}
	
	public ETF getEtf10() {
		
		ETF etf = new ETF();
		etf.setSymbol("VB");
		etf.setName("Vanguard Small-Cap Index Fund ETF");
		etf.setCategory("Equity");
		etf.setAssetClass("Small Cap");
		etf.setRiskRange(3);
		etf.setReturnRange(4);
		etf.setRating(4);
		//etf.setYield(2.4);
		//etf.setYtdReturn(9.3);
		etf.setExpenseRange(0.08);
		etf.setLink("http://www.morningstar.com/etfs/ARCX/VB/quote.html");

		return etf;
	}
	
	public ETF getEtf11() {
		
		ETF etf = new ETF();
		etf.setSymbol("BTAL");
		etf.setName("U.S. Market Neutral Anti-Beta ETF");
		etf.setCategory("Long-Short");
		etf.setAssetClass("Alternatives");
		etf.setRiskRange(5);
		etf.setReturnRange(3);
		etf.setRating(2);
		//etf.setYield(2.4);
		//etf.setYtdReturn(9.3);
		etf.setExpenseRange(1.49);
		etf.setLink("http://www.morningstar.com/etfs/ARCX/BTAL/quote.html");

		return etf;
	}
	
	public ETF getEtf12() {
		
		ETF etf = new ETF();
		etf.setSymbol("ADRU");
		etf.setName("BLDRS Europe Select ADR Index ETF");
		etf.setCategory("Europe Equities");
		etf.setAssetClass("Equity");
		etf.setRiskRange(3);
		etf.setReturnRange(2);
		etf.setRating(2);
		//etf.setYield(2.4);
		//etf.setYtdReturn(9.3);
		etf.setExpenseRange(0.30);
		etf.setLink("http://www.morningstar.com/etfs/XNAS/ADRU/quote.html");

		return etf;
	}
}
