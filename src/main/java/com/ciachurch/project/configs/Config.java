package com.ciachurch.project.configs;

import com.ciachurch.project.dao.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    @Autowired
    public Address getAddressKim(Address address){
         address = new Address("yeye","yoyoyo");
        return address;
    }
}
