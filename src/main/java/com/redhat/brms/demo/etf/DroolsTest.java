package com.redhat.brms.demo.etf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;







//import org.drools.core.FactHandle;
import org.kie.api.KieBase;
import org.kie.api.KieBaseConfiguration;
import org.kie.api.KieServices;
import org.kie.api.builder.Message;
import org.kie.api.builder.Message.Level;
import org.kie.api.builder.Results;
import org.kie.api.event.kiebase.KieBaseEventListener;
import org.kie.api.event.rule.DebugAgendaEventListener;
import org.kie.api.logger.KieRuntimeLogger;
import org.kie.api.runtime.Environment;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieContext;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.KieSessionConfiguration;
import org.kie.api.runtime.rule.FactHandle;
import org.kie.api.runtime.rule.QueryResults;
import org.kie.internal.builder.conf.RuleEngineOption;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
        	

            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
	        
    	    List list = new ArrayList();
    	    
    	    KieBaseConfiguration kbc = ks.newKieBaseConfiguration();
    	   // kbc.setProperty("drools.ruleEngine",  "reteoo");
    	   // kbc.setOption(RuleEngineOption.RETEOO);
    	  // System.out.println("REO VALUE= " +  RuleEngineOption.valueOf("drools.ruleEngine"));
    	    KieContainer kContainer = ks.getKieClasspathContainer();
//    	    Results results = ks.getKieClasspathContainer().verify("ETFRules");
//    	    List<Message> messageList = results.getMessages(Level.ERROR);
//    	    for (Message message : messageList){
//    	    	System.out.println(message.getText());
//    	    }
    	    //KieBase kbase = kContainer.newKieBase("ETFRules", kbc);
    	    
    	    KieSession kSession = kContainer.newKieSession("ksession-rules");
    	    
    	   // KieRuntimeLogger logger = ks.getLoggers().newConsoleLogger( kSession );
    	    Integer integer = 4;
    	    Integer integer2 = 4;
    	     
    	    CriteriaSelection cs = new CriteriaSelection();
    	    cs.setAge(25);
    	    cs.setSelectedRating(3);
    	    cs.setSelectedRisk(4);
    	    //cs.setSelectedReturn(4);
    	    cs.setSelectedExpense("low");
    	    
    	    kSession.insert(cs);

    	    ETFList etfList = new ETFList();
    	    for (ETF etf : etfList.getAllETFs()){
    	    	kSession.insert(etf);
    	    }
    	    ETFResults ETFResults = new ETFResults();
    	    kSession.insert(ETFResults);
    	    kSession.fireAllRules();
    	    kSession.dispose();
    	    System.out.println("ELIGIBILITY= " + ETFResults.isEligible());
    	    System.out.println("USER LIST= " + ETFResults.getUserSelectedETFList());
    	    System.out.println("AGE GROUP LIST= " + ETFResults.getAgeGroupETFList());
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}
