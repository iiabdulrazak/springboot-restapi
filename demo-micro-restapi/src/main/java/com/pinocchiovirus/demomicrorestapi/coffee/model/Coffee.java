package com.pinocchiovirus.demomicrorestapi.coffee.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Coffee {
    @Id
    @SequenceGenerator(
            name = "coffee_sequence",
            sequenceName = "coffee_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "coffee_sequence"
    )
    private Long id;
    private String name;
    private LocalDate dop;
    private String pNumber;

    public Coffee() {
    }

    public Coffee(Long id, String name, LocalDate dop, String pNumber) {
        this.id = id;
        this.name = name;
        this.dop = dop;
        this.pNumber = pNumber;
    }

    public Coffee(String name, LocalDate dop, String pNumber) {
        this.name = name;
        this.dop = dop;
        this.pNumber = pNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDop() {
        return dop;
    }

    public void setDop(LocalDate dop) {
        this.dop = dop;
    }

    public String getpNumber() {
        return pNumber;
    }

    public void setpNumber(String pNumber) {
        this.pNumber = pNumber;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dop=" + dop +
                ", pNumber=" + pNumber +
                '}';
    }
}
