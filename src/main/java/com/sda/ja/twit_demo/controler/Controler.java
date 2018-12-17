package com.sda.ja.twit_demo.controler;

import com.sda.ja.twit_demo.model.Wpis;
import com.sda.ja.twit_demo.model.dto.WpisDto;
import com.sda.ja.twit_demo.service.WpisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class Controler {
    @Autowired
    private WpisService wpisService;

    @GetMapping("/wpisForm")
    public String getWpisForm(){
        return "wpisForm";
    }
    @PostMapping("/addWpis")
    public String submitWpis(WpisDto wpis){
        Optional<Wpis>wpisOptional = wpisService.addWpis(wpis);
        if(wpisOptional.isPresent()){
            return "redirect:/wpisForm";
        }
          return    "redirect:/wpisForm";
    }
}
