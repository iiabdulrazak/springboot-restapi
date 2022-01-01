package com.pinocchiovirus.demomicrorestapi.coffee.repository;

import com.pinocchiovirus.demomicrorestapi.coffee.model.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeeRepository extends JpaRepository<Coffee, Long> {
    //Responsible of data access
}
