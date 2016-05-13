package com.redhat.brms.demo.etf;

import org.kie.api.KieBaseConfiguration;
import org.kie.api.KieServices;
import org.kie.api.event.rule.AfterMatchFiredEvent;
import org.kie.api.event.rule.DefaultAgendaEventListener;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RuleRunner {
	private Logger log = LoggerFactory.getLogger(RuleRunner.class);
	
	public ETFResults executeRules(Integer age, Integer selectedRating, Integer selectedRisk, String selectedExpense){
		
	    KieServices ks = KieServices.Factory.get();
	
	    KieContainer kContainer = ks.getKieClasspathContainer();
	    
	    KieSession kSession = kContainer.newKieSession("ksession-rules");
	    
	    //Add event listener to the session so we can log all the rules that fire
	    kSession.addEventListener(new DefaultAgendaEventListener(){
	    	public void afterMatchFired(AfterMatchFiredEvent event){
	    		super.afterMatchFired(event);
	    		log.info("EVENT= " + event);
	    		log.info("RULE NAME= " + event.getMatch().getRule().getName());
	    	}
	    });
	    
	    //Insert ETFResults so we can store all the ETF lists created by the rules
	    ETFResults ETFResults = new ETFResults();
	    kSession.insert(ETFResults);
	    
	    //Set and insert the selections from the user input on index.html
	    CriteriaSelection cs = new CriteriaSelection();
	    cs.setAge(age);
	    cs.setSelectedRating(selectedRating);
	    cs.setSelectedRisk(selectedRisk);
	    cs.setSelectedExpense(selectedExpense);
	    
	    kSession.insert(cs);
	
	    //Insert all of the ETFs into the rule session
	    ETFList etfList = new ETFList();
	    for (ETF etf : etfList.getAllETFs()){
	    	kSession.insert(etf);
	    }
	
	    kSession.fireAllRules();
	    kSession.dispose();
	    
	    //Return the results with the lists of ETFs
	    return ETFResults;
	}
}
