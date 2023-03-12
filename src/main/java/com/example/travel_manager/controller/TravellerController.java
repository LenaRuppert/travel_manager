package com.example.travel_manager.controller;

import com.example.travel_manager.model.Traveller;
import com.example.travel_manager.service.TravellerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/workouts")
@RequiredArgsConstructor
public class TravellerController {

    private final TravellerService travellerService;

    @GetMapping()
    public List<Traveller> travellerList(){
        return travellerService.listAllTraveller();
    }
}
