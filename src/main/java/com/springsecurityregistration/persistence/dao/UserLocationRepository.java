package com.springsecurityregistration.persistence.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.springsecurityregistration.persistence.model.User;
import com.springsecurityregistration.persistence.model.UserLocation;

public interface UserLocationRepository extends JpaRepository<UserLocation, Long> {
    UserLocation findByCountryAndUser(String country, User user);

}
