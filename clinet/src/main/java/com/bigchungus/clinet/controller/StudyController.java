package com.bigchungus.clinet.controller;

import com.bigchungus.clinet.model.Study;
import com.bigchungus.clinet.service.StudyService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class StudyController {

    StudyService studyService;

    public StudyController(){
        studyService = new StudyService();
    }

    @PostMapping("/addStudy")
    public Study addNewStudy(@RequestBody Study study) {
        return studyService.addNewStudty(study);
    }

    @DeleteMapping("/deleteStudy")
    public void deleteStudy(@RequestBody Study study){
        studyService.deleteStudy(study);
    }
}
