package SerializationWithMethods;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File f = new File("C:\\Users\\bavad\\IdeaProjects\\HomeWork_22\\src\\SerializationWithMethods\\ser.txt");
        Country country = new Country("Spain", "Madrid", 46456140, 505990);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
        oos.writeObject(country);
        oos.flush();
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
        Country country1 = (Country) ois.readObject();
        ois.close();
        System.out.println("Country - " + country1.name + "\nCapital - " + country1.capital + "\nPopulation - " + country1.population + "\nSquare - " + country1.square);
    }
}
