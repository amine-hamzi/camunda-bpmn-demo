package com.execution.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class FundReservation implements JavaDelegate {


    @Override
    public void execute(DelegateExecution execution){
        Long numCompte = (Long)execution.getVariable("numCompte");
        System.out.println("reservation de fond executé pour le compte :" + numCompte );
    }
}