package com.example.travel_manager.repository;

import com.example.travel_manager.model.Traveller;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TravellerRepository extends MongoRepository<Traveller, String> {
}
