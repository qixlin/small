package io.redos.small.controller;

import io.redos.small.model.SharePlate;
import io.redos.small.service.SharePlateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private SharePlateService sps;
    @RequestMapping("/insert")
    public String addRecord(){
        SharePlate sh = new SharePlate("nihao");
        sps.add(sh);
        System.out.println(sh);
        return "complete";
    }
}
