package com.example.superhero4.controller;
import com.example.superhero4.dto.City;
import com.example.superhero4.dto.SuperPower;
import com.example.superhero4.dto.SuperPowerCount;
import com.example.superhero4.model.SuperHero;
import com.example.superhero4.service.SuperHeroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping(path = "superhero")
public class SuperHeroController {

    private SuperHeroService superHeroService;
    public SuperHeroController(SuperHeroService superHeroService){
        this.superHeroService = superHeroService;
    }

    @GetMapping("")
    public ResponseEntity<List<SuperHero>> showHeroes() {
        List<SuperHero> superHeroList = superHeroService.getHeroes();
        return new ResponseEntity(superHeroList, HttpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity<List<SuperHero>> showHeroPath(@PathVariable String name) {
        List<SuperHero> superHeroList = superHeroService.getSpeceficHero(name);
        return new ResponseEntity(superHeroList, HttpStatus.OK);
    }

    @GetMapping("/powers/count")
    public ResponseEntity<List<SuperPowerCount>> showHeroNumberOfPowers(){
        List<SuperPowerCount> superPowerCounts = superHeroService.getHeroesNumberOfPowers();
        return new ResponseEntity(superPowerCounts, HttpStatus.OK);
    }

    @GetMapping("/powers/count/{name}")
    public ResponseEntity<List<SuperPowerCount>> showHeroNumberOfPowersPath(@PathVariable  String name){
        List<SuperPowerCount> superPowerCounts = superHeroService.getSpeceficHeroesNumberOfPowers(name);
        return new ResponseEntity(superPowerCounts, HttpStatus.OK);
    }

    @GetMapping("/powers")
    public ResponseEntity<List<SuperPower>> showHeroesSuperpower() {
        List<SuperPower> superPowerList = superHeroService.getHeroesPowers();
        return new ResponseEntity(superPowerList, HttpStatus.OK);
    }

    @GetMapping("/powers/{name}")
    public ResponseEntity<List<SuperPower>> showHeroesSuperpowerPath(@PathVariable String name) {
        List<SuperPower> superPowerList = superHeroService.getSpeceficPower(name);
        return new ResponseEntity(superPowerList, HttpStatus.OK);
    }

    @GetMapping("/city")
    public ResponseEntity<List<City>> showHeroesCity (){
        List<City> cityList = superHeroService.getCity();
        return new ResponseEntity<>(cityList, HttpStatus.OK);
    }

    @GetMapping("/city/{name}")
    public ResponseEntity<List<City>> showHeroesCityPath (@PathVariable String name){
        List<City> cityList = superHeroService.getSpeceficCity(name);
        return new ResponseEntity<>(cityList, HttpStatus.OK);
    }

}
