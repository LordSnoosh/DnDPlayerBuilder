package com.sin.newt.models;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Random;

public class Player {

    private Integer playerId;
    private String name;
    private Integer age;
    private Boolean isDm;

    public Player() {
    }

    private void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public Player(String name, Integer age, Boolean isDm) {
        setName(name);
        setAge(age);
        setDm(isDm);
        Random rand = new Random();
        setPlayerId(rand.nextInt(100) + 1);
    }

    public Player(Integer randNum) {
        setPlayerId(randNum);
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Boolean getDm() {
        return isDm;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDm(Boolean dm) {
        isDm = dm;
    }
}