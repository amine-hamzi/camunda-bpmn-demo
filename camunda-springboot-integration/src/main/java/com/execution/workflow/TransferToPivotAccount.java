package com.execution.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class TransferToPivotAccount implements JavaDelegate {


    @Override
    public void execute(DelegateExecution execution){
        System.out.println("transfer compte pivot executé pour le compte" );
    }
}