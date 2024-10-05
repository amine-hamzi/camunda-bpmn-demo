package com.execution.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class RejectPaiement implements JavaDelegate {


    @Override
    public void execute(DelegateExecution execution){
        Long numCompte = (Long)execution.getVariable("numCompte");
        System.out.println("paiement rejeté pour le numero de compte :" + numCompte );
    }
}