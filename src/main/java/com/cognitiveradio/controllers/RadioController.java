package com.cognitiveradio.controllers;

import com.cognitiveradio.entities.Information;
import com.cognitiveradio.repositories.InformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cognitiveradio.services.RadioService;
import com.google.gson.Gson;
import java.util.List;

@RestController
public class RadioController {

    @Autowired
    RadioService radioService;

    @Autowired
    InformationRepository informationRepository;

    @RequestMapping(value = "/getInformation")
    public List<Information> getInformation() {
        System.out.println("Dostalem zapytanie na getInformation");
        List<Information> information = radioService.getInformation();
        System.out.println("Information size:" + information.size());
        for(Information a : information)
        {
            System.out.println(0);
            System.out.println(a.toString());
        }
        //List <Information> information = informationRepository.findAll();
        Gson gson = new Gson();

        //return gson.toJson(information);
        return informationRepository.findAll();
        //return radioService.getInformation();
    }

}
