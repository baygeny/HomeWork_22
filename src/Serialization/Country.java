package Serialization;

import java.io.Serializable;

public class Country implements Serializable {
    String name;
    String capital;
    int population;
    int square;

    public Country(String name, String capital, int population, int square) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.square = square;
    }
}

