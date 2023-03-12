package com.example.travel_manager.service;

import com.example.travel_manager.model.Traveller;
import com.example.travel_manager.repository.TravellerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TravellerService {

    private final TravellerRepository travellerRepository;
    private final IdService idService;

    public List<Traveller> listAllTraveller(){
        return travellerRepository.findAll();
    }
}
