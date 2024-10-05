package com.execution.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class PushPayment implements JavaDelegate {


    @Override
    public void execute(DelegateExecution execution){
        Long numCompte = (Long)execution.getVariable("numCompte");
        System.out.println("push payment executé pour le compte :" + numCompte );
    }
}