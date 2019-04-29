package com.bigchungus.clinet.service;

import com.bigchungus.clinet.model.Laboratory;
import com.bigchungus.clinet.repository.LaboratoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class LaboratoryService {

    @Autowired
    LaboratoryRepository laboratoryRepository;

    public Laboratory addNewLaboratory(Laboratory laboratory){
        return laboratoryRepository.save(laboratory);
    }

}
