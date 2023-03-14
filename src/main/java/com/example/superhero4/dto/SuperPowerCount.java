package com.example.superhero4.dto;

public class SuperPowerCount {

    private String realName;
    private String heroName;
    private int countPower;

    public SuperPowerCount(String realName, String heroName, int countPower){
        this.realName = realName;
        this.heroName = heroName;
        this.countPower = countPower;
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

    public int getCountPower() {
        return countPower;
    }

    public void setCountPower(int countPower) {
        this.countPower = countPower;
    }
}
