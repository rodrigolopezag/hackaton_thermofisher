package com.bigchungus.clinet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CreateController {

    @RequestMapping(value="/create", method = RequestMethod.GET)
    public String create() {
        return "create";
    }


}
