package com.example.superhero4.dto;

import java.util.List;

public class City {

    String cityName;
    List<String> herolist;

    public City (String cityName, List herolist){
        this.cityName = cityName;
        this.herolist = herolist;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<String> getHerolist() {
        return herolist;
    }

    public void setHerolist(List<String> herolist) {
        this.herolist = herolist;
    }

}
