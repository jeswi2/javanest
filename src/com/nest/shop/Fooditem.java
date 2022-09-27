package com.nest.shop;

public class Fooditem {
    public static void main(String[] args) {

    }
    Integer BlackCoffee,BlackTea,Tea,Cake,Coffee,Vada;
    public Fooditem(Integer BlackCoffee, Integer blackTea, Integer tea, Integer cake, Integer coffee, Integer vada) {
        this.BlackCoffee = BlackCoffee;
        BlackTea = blackTea;
        Tea = tea;
        Cake = cake;
        Coffee = coffee;
        Vada = vada;
    }

    public Integer getBlackCoffee() {
        return BlackCoffee;
    }

    public void setBlackCoffee(Integer blackCoffee) {
        BlackCoffee = blackCoffee;
    }

    public Integer getBlackTea() {
        return BlackTea;
    }

    public Integer getTea() {
        return Tea;
    }

    public Integer getCake() {
        return Cake;
    }

    public Integer getCoffee() {
        return Coffee;
    }

    public Integer getVada() {
        return Vada;
    }


    public void setBlackTea(Integer blackTea) {
        BlackTea = blackTea;
    }

    public void setTea(Integer tea) {
        Tea = tea;
    }

    public void setCake(Integer cake) {
        Cake = cake;
    }

    public void setCoffee(Integer coffee) {
        Coffee = coffee;
    }

    public void setVada(Integer vada) {
        Vada = vada;
    }
}