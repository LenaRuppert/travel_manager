package com.example.travel_manager.service;

import com.example.travel_manager.repository.TravellerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.example.travel_manager.model.Traveller;
import org.mockito.Mockito;


import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class TravellerServiceTest {

    TravellerService travellerService;
    TravellerRepository travellerRepository;
    IdService idService;
    Traveller traveller1;

    @BeforeEach
    public void setUp(){
        travellerRepository = mock(TravellerRepository.class);
        idService = mock(IdService.class);
        travellerService = new TravellerService(travellerRepository, idService);
    }

    @Test
    void checkListAllTraveller() {
        //GIVEN
        List<Traveller> expectedList = new ArrayList<>();
        expectedList.add(new Traveller("1", "newTraveller"));
        when(travellerRepository.findAll()).thenReturn(expectedList);

        //WHEN
        List<Traveller> TravellerList = travellerService.listAllTraveller();

        //THEN
        Mockito.verify(travellerRepository).findAll();
        assertEquals(expectedList, TravellerList);
    }
}