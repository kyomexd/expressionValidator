package ecopersons;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static ecopersons.PersonWriter.writePersons;

public class Main {
    public static void main(String[] args) throws IOException {
        Path ecoFilePath = Paths.get("E:\\papka(0)\\data.csv");
        PersonReader pReader = new PersonReader();
        List<Person> persons = pReader.readFromFile(ecoFilePath);
        List<Person> ecoPersons = PersonAnalyzer.getEcoPersons(persons, 1000);
        writePersons(ecoFilePath, ecoPersons);
    }
}
