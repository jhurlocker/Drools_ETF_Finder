package com.redhat.brms.demo.etf;

public class RuleRunnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RuleRunner ruleRunner = new RuleRunner();

		ETFResults etfResults = ruleRunner.executeRules(25, 3, 4, "low");
	}

}
