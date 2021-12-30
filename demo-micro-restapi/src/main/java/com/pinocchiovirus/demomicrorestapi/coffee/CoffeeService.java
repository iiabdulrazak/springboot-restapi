package com.pinocchiovirus.demomicrorestapi.coffee;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class CoffeeService {
    public List<Cofee> getCoffees(){
        return List.of(
                new Cofee(
                        1L,
                        "Abdulrazak A. Osman",
                        LocalDate.of(2021, Month.DECEMBER, 29),
                        "0547079680"
                ),
                new Cofee(
                        2L,
                        "Abdulrahman A. Osman",
                        LocalDate.of(2021, Month.DECEMBER, 30),
                        "0546995684"
                ),
                new Cofee(
                        3L,
                        "Abdulwahab A. Osman",
                        LocalDate.of(2021, Month.DECEMBER, 30),
                        "0590599809"
                )
        );
    }
}
