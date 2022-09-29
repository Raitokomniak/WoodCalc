package com.raito.woodcalc;
import java.io.IOException;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class WoodRestController {
    @PostMapping("/newKuvio")
    public RedirectView NewKuvio() throws IOException{
        WoodcalcApplication.cApp.NewKuvio();
        return new RedirectView("/");
    }

    @PostMapping("/editKuvioKuutiot")
    public RedirectView EditKuvioKuutiot(int kuvioID, int kuutiot) throws IOException{
        WoodcalcApplication.cApp.EditKuvioKuutiot(kuvioID, kuutiot);
        return new RedirectView("/");
    }

    @PostMapping("/editKuvioLitrakoko")
    public RedirectView EditKuvioLitrakoko(int kuvioID, int litrakoko) throws IOException{
        WoodcalcApplication.cApp.EditKuvioLitrakoko(kuvioID, litrakoko);
        return new RedirectView("/");
    }

    @PostMapping("/reset")
    public RedirectView Reset(){
        WoodcalcApplication.cApp.Reset();
        return new RedirectView("/");
    }

    @PostMapping("/poistaKuvio")
    public RedirectView PoistaKuvio(int kuvioID){
        WoodcalcApplication.cApp.PoistaKuvio(kuvioID);
        return new RedirectView("/");
    }
}

