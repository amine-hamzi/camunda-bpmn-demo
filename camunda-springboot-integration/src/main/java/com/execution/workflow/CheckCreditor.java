package com.execution.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CheckCreditor implements JavaDelegate {


    @Override
    public void execute(DelegateExecution execution){
        Long numCompte = (Long)execution.getVariable("numCompte");
        System.out.println("checkCreditor has been executed " + numCompte );
        boolean isEligible = false;
        if(numCompte % 2 == 0)
            isEligible = true;
        execution.setVariable("isEligible", isEligible);
    }
}