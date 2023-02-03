package ecopersons;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonReader implements EcoReader {

    @Override
    public List<Person> readFromFile(Path path) throws IOException {
        List<Person> persons = new ArrayList<>();
        String TEXT_LINE_REGEX = "\\D+\\|\\D+";
        Pattern textLinePattern = Pattern.compile(TEXT_LINE_REGEX);
        Matcher textLineMatcher;
        try (Scanner sc = new Scanner(path)) {
            while (sc.hasNextLine()) {
                Person person;
                String nextLine = sc.nextLine();
                textLineMatcher = textLinePattern.matcher(nextLine);
                if (textLineMatcher.find()) {
                    continue;
                }
                String[] lineValues = nextLine.split("\\|");
                person = new Person(Integer.parseInt(lineValues[0]), lineValues[1], Integer.parseInt(lineValues[2]),
                        Integer.parseInt(lineValues[3]), Integer.parseInt(lineValues[4]), Integer.parseInt(lineValues[5]),
                        Integer.parseInt(lineValues[6]));
                persons.add(person);
            }
        }
        return persons;
    }
}
