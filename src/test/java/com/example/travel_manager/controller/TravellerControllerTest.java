package com.example.travel_manager.controller;

import com.example.travel_manager.repository.TravellerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.annotation.DirtiesContext;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest(classes = TravellerControllerTest.class)
@AutoConfigureMockMvc
class TravellerControllerTest {

    @Autowired
    TravellerRepository travellerRepository;

    @Autowired
    MockMvc mockMvc;

    @Test
    @DirtiesContext
    void checkTravellerList() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("api/traveller"))
                .andExpect(status().isOk())
                .andExpect(content().json("[]"));
    }
}