package com.example.travel_manager.service;

import lombok.AllArgsConstructor;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;



class IdServiceTest {

    IdService idService = new IdService();

    @Test
    void generateId() {
        assertNotNull(idService.generateId());

    }
}