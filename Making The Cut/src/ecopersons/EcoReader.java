package ecopersons;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public interface EcoReader {
    List<Person> readFromFile(Path path) throws IOException;
}
