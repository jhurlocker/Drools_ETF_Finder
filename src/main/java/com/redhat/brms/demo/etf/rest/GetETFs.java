package com.redhat.brms.demo.etf.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.redhat.brms.demo.etf.ETFResults;
import com.redhat.brms.demo.etf.RuleRunner;


@Path("/etfs/")
public class GetETFs {
	@GET
	@Path("etfList/{age}/{selectedRating}/{selectedRisk}/{selectedExpense}")
	@Produces("application/json")
	public ETFResults getETFList(@PathParam("age") Integer age,
								@PathParam("selectedRating") Integer selectedRating,
								@PathParam("selectedRisk") Integer selectedRisk,
								@PathParam("selectedExpense") String selectedExpense) {

		RuleRunner ruleRunner = new RuleRunner();

		ETFResults etfResults = ruleRunner.executeRules(age, selectedRating, selectedRisk, selectedExpense);
		
		return etfResults;

	}
}
