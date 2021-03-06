package com.pinocchiovirus.demomicrorestapi.coffee.resource;

import com.pinocchiovirus.demomicrorestapi.coffee.service.CoffeeService;
import com.pinocchiovirus.demomicrorestapi.coffee.model.Coffee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/coffee")
public class CoffeeController {
    private final CoffeeService coffeeService;

    @Autowired
    public CoffeeController(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }

    @GetMapping
    public List<Coffee> getCoffees(){
        return coffeeService.getCoffees();
    }

}
