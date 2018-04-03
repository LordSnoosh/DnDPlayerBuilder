package com.sin.newt.models;

public class Character {

    private Integer charId;
    private String name;
    private Integer age;
    private Integer level;
    private Integer raceId;
    private Integer ClaId;

    public Character(){

    }

    private void setCharId(Integer charId){
        this.charId = charId;
    }

    public Character(Integer randNum){
        setCharId(randNum);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCharId() {
        return charId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getRaceId() {
        return raceId;
    }

    public void setRaceId(Integer raceId) {
        this.raceId = raceId;
    }

    public Integer getClaId() {
        return ClaId;
    }

    public void setClaId(Integer claId) {
        ClaId = claId;
    }
}
