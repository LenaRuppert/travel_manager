package com.example.travel_manager.controller;

import com.example.travel_manager.service.TravellerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class TravellerController {

    private final TravellerService travellerService;
}
