package com.bigchungus.clinet.service;

import com.bigchungus.clinet.model.Study;
import com.bigchungus.clinet.repository.StudyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


public class StudyService {

    @Autowired
    StudyRepository studyRepository;

    public Study addNewStudty(Study study){
        return studyRepository.save(study);
    }

    public void deleteStudy(Study study) {
       studyRepository.delete(study);
    }
}
