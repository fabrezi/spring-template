package com.example.springtemplate;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class CoffeeController {
    private List<Coffee> coffees = new ArrayList<>();

    public CoffeeController(){
        coffees.addAll(List.of(
                new Coffee("Chock of nuts"),
                new Coffee("Bourbon"),
                new Coffee("Jugnu")
        ));
    }

    @GetMapping("/cafe")
    Iterable<Coffee> getCofees(){
        return coffees;
    }

    @GetMapping("/{id}")
    Optional<Coffee> getCoffeeById(@PathVariable String id){
        for (Coffee c: coffees){
            if(c.getId().equals(id)){
                return Optional.of(c);
            }
        }
        return Optional.empty();
    }


    @PostMapping("/viva")
    Coffee postCoffee(@RequestBody Coffee coffee){
        coffees.add(coffee);
        return coffee;
    }


}
