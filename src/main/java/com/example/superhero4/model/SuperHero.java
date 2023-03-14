package com.example.superhero4.model;

public class SuperHero {

    private String realName;
    private String superheroName;
    private int creationYear;
    private int heroId;

    public SuperHero(String realName, String superheroName, int creationYear, int heroId) {
        this.realName = realName;
        this.superheroName = superheroName;
        this.creationYear = creationYear;
        this.heroId = heroId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getSuperheroName() {
        return superheroName;
    }

    public void setSuperheroName(String superheroName) {
        this.superheroName = superheroName;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    public int getHeroId() {
        return heroId;
    }

    public void setHeroId(int heroId) {
        this.heroId = heroId;
    }
}
