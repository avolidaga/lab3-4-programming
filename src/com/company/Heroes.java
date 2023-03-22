package com.company;

import java.util.Objects;

public abstract class Heroes {
    private String name;
    private Mood mood = Mood.RELAX;
    private int numberShorty;

    public Heroes(String name){
        this.name = name;
    }

    public Heroes() {
        
    }


    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Heroes{" +
                "name='" + name + '\'' +
                ", mood=" + mood +
                ", numberShorty=" + numberShorty +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Heroes heroes = (Heroes) o;
        return numberShorty == heroes.numberShorty && Objects.equals(name, heroes.name) && mood == heroes.mood;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mood, numberShorty);
    }
}
