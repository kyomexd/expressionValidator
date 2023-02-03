package ecopersons;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PersonWriter {

    public static void writePersons(Path path, List<Person> ecoPersons) throws IOException {
        if (!ecoPersons.isEmpty()) {
            final String ECO_FILE = "eco.csv";
            Person ecoPerson;
            StringBuilder personsData = new StringBuilder();
            Path dir = path.getParent();
            String delimiter = File.separator;
            String ecoFileName = delimiter + ECO_FILE;
            Path ecoFilePath = Paths.get(dir + ecoFileName);
            for (Person person : ecoPersons) {
                ecoPerson = person;
                personsData.append(ecoPerson.toString()).append("\n");
            }
            byte[] dataBytes = personsData.toString().getBytes();
            Files.deleteIfExists(ecoFilePath);
            Files.write(ecoFilePath, dataBytes);
        }
    }
}
