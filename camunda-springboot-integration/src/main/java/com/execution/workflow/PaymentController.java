package com.execution.workflow;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PaymentController  {

    private final RuntimeService runtimeService;

    public PaymentController(RuntimeService runtimeService) {
        this.runtimeService = runtimeService;
    }

    @GetMapping("/iniate-payment/{numCompte}")
    public String initiatePayment(@PathVariable Long numCompte){
        Map<String, Object> variables = new HashMap<>();
        variables.put("numCompte", numCompte);
        runtimeService.startProcessInstanceByMessage("StartPayment",numCompte.toString(),variables);
        return "process initiated";
    }

    @GetMapping("/recieve-payment/{numCompte}")
    public String recievePayment(@PathVariable Long numCompte){
        runtimeService.correlateMessage("recieveResponse", numCompte.toString());
        return "process initiated";
    }



}