package com.cognitiveradio.services;

import com.cognitiveradio.entities.Information;
import com.cognitiveradio.repositories.InformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RadioServiceImpl implements RadioService {

    @Autowired
    InformationRepository informationRepository;

    @Override
    public List<Information> getInformation() {
            System.out.println("Dostalem zapytane");

            return informationRepository.findAll();
    }
}
