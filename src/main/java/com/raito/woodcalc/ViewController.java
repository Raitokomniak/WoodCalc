package com.raito.woodcalc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
    @RequestMapping("/")
    public String Index(Model model){
        model.addAttribute("kuviot", WoodcalcApplication.cApp.GetAllKuviot());
        model.addAttribute("keskiarvo", WoodcalcApplication.cApp.LaskeKeskiarvo());
        return "index";
    }

}
