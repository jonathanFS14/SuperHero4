package com.example.superhero4.service;
import com.example.superhero4.dto.City;
import com.example.superhero4.dto.SuperPower;
import com.example.superhero4.dto.SuperPowerCount;
import com.example.superhero4.model.SuperHero;
import com.example.superhero4.repositories.HeroRepositoryDB;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuperHeroService {

    HeroRepositoryDB superHeroRepository;
    public SuperHeroService(HeroRepositoryDB superHeroRepository){
        this.superHeroRepository = superHeroRepository;
    }

    public List<SuperHero> getHeroes(){
      return superHeroRepository.Heroes();
    }

    public List<SuperHero> getSpeceficHero(String name){
        return superHeroRepository.speceficHero(name);
    }

    public List<SuperPowerCount> getHeroesNumberOfPowers(){
        return superHeroRepository.heroesNumberOfPowers();
    }

    public List<SuperPowerCount> getSpeceficHeroesNumberOfPowers(String name){
        return superHeroRepository.speceficNumberOfPowers(name);
    }

    public List<SuperPower> getHeroesPowers(){
        return superHeroRepository.heroesPower();
    }

    public List<SuperPower> getSpeceficPower(String name){
        return superHeroRepository.speceficPower(name);
    }

    public List<City> getCity(){
        return superHeroRepository.city();
    }

    public List<City> getSpeceficCity (String name){
        return superHeroRepository.speceficCity(name);
    }

}
