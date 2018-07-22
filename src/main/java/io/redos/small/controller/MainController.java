package io.redos.small.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class MainController {

    @RequestMapping("index")
    public String getIndex(){
        log.info("进入{}的{}",this.getClass().getSimpleName(),"getIndex()");
        return "index";
    }
}
