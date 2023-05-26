package com.datahub.stringtranformer.controller;

import com.datahub.stringtranformer.service.StringTransformerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringTransformerController {

    @Autowired
    private StringTransformerService stringTransformerService;

    @PostMapping("/strings/{string}")
    public String saveString(@PathVariable String string) {
        return stringTransformerService.salvarString(string);
    }

}
