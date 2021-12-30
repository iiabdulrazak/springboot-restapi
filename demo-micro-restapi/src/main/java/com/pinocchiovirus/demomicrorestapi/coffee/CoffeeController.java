package com.pinocchiovirus.demomicrorestapi.coffee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/coffee")
public class CoffeeController {
    @GetMapping
    public List<Cofee> getCoffees(){
        return List.of(
                new Cofee(
                        1L,
                        "Abdulrazak A. Osman",
                        LocalDate.of(2021, Month.DECEMBER, 29),
                        "0547079680"
                )
        );
    }
}
