package com.bigchungus.clinet.controller;

import com.bigchungus.clinet.model.Laboratory;
import com.bigchungus.clinet.service.LaboratoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class LaboratoryController {

    LaboratoryService laboratoryService;

    public LaboratoryController(){
        laboratoryService = new LaboratoryService();
    }


    @PostMapping("/addLaboratory")
    public Laboratory homeInit(@RequestBody Laboratory laboratory) {
        return laboratoryService.addNewLaboratory(laboratory);
    }
}
