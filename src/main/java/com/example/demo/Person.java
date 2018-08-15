package com.example.demo;

import java.io.Serializable;
import java.util.List;

public class Person implements Serializable{

    private String username;
    private List<Weight> weights;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Weight> getWeights() {
        return weights;
    }

    public void setWeights(List<Weight> weights) {
        this.weights = weights;
    }


}

class Weight implements Serializable{
    private double weight;
    private String wdate;

    public Weight(double weight, String wdate) {
        this.weight = weight;
        this.wdate = wdate;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getWdate() {
        return wdate;
    }

    public void setWdate(String wdate) {
        this.wdate = wdate;
    }
}