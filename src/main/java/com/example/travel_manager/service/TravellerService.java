package com.example.travel_manager.service;

import com.example.travel_manager.repository.TravellerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TravellerService {

    private final TravellerRepository travellerRepository;
    private final IdService idService;
}
