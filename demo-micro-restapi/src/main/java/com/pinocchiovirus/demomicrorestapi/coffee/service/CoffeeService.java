package com.pinocchiovirus.demomicrorestapi.coffee.service;

import com.pinocchiovirus.demomicrorestapi.coffee.model.Coffee;
import com.pinocchiovirus.demomicrorestapi.coffee.repository.CoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CoffeeService {
    private final CoffeeRepository coffeeRepository;

    @Autowired
    public CoffeeService(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    public List<Coffee> getCoffees(){
        return coffeeRepository.findAll();
    }
}
