package com.sda.ja.twit_demo.controler;

import com.sda.ja.twit_demo.en.Typ;
import com.sda.ja.twit_demo.model.Wpis;
import com.sda.ja.twit_demo.model.dto.WpisDto;
import com.sda.ja.twit_demo.service.WpisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class WpisControler {
    @Autowired
    private WpisService wpisService;

    @GetMapping("/wpisForm")
    public String getWpisForm(Model model){
        model.addAttribute("wpisTyp", Typ.values());
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

    @GetMapping("/list")
    public String getWpisList(Model model){
        model.addAttribute("wpisList", wpisService.getAll());
        return "list";
    }

    @GetMapping("/removeWpis")
    public String remove(@RequestParam(name = "wpisId") Long wpisId) {
        wpisService.remove(wpisId);

        return "redirect:/list";
    }



}
