package SerializationWithMethods;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Country implements Serializable {
    String name, capital;
    int population, square;

    public Country(String name, String capital, int population, int square) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.square = square;
    }

    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
    }
}
