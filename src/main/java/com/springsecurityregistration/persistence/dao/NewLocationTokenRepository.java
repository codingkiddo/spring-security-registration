package com.springsecurityregistration.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springsecurityregistration.persistence.model.NewLocationToken;
import com.springsecurityregistration.persistence.model.UserLocation;

public interface NewLocationTokenRepository extends JpaRepository<NewLocationToken, Long> {

    NewLocationToken findByToken(String token);

    NewLocationToken findByUserLocation(UserLocation userLocation);

}
