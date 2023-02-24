package Serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File f = new File("C:\\Users\\bavad\\IdeaProjects\\HomeWork_22\\src\\Serialization\\ser.txt");
        Country country = new Country("Ukraine", "Kiev", 43790000, 603700);
        ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(f));
        ous.writeObject(country);
        ous.flush();
        ous.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
        Country country1 = (Country) ois.readObject();
        ois.close();
        System.out.println("Country - " + country1.name + "\nCapital - " + country1.capital + "\nPopulation - " + country1.population + "\nSquare - " + country1.square);
    }
}
