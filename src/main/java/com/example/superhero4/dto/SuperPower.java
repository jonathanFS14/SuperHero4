package com.example.superhero4.dto;
import java.util.List;
public class SuperPower {

    private String realName;
    private String heroName;
    private List<String> powerlist;

    public SuperPower (String realName, String heroName, List powerlist){
        this.realName = realName;
        this.heroName = heroName;
        this.powerlist = powerlist;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public List<String> getPowerlist() {
        return powerlist;
    }

    public void setPowerlist(List<String> powerlist) {
        this.powerlist = powerlist;
    }
}
