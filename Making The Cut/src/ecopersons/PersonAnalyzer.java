package ecopersons;

import java.util.ArrayList;
import java.util.List;

public class PersonAnalyzer {

    public static List<Person> getEcoPersons(List<Person> persons, int maxValue) {
        List<Person> ecoPersons = new ArrayList<>();
        if (!persons.isEmpty()) {
            Person person;
            for (Person value : persons) {
                person = value;
                if (PersonAnalyzer.isEco(maxValue, person)) {
                    ecoPersons.add(person);
                }
            }
        }
        return ecoPersons;
    }

    public static boolean isEco(int maxValue, Person person) {
        List<Integer> comparableData = getComparableValues(person);
        boolean isEco = true;
        int firstDataValue;
        int secondDataValue;
        for (int i = 0; i < comparableData.size(); i++) {
            firstDataValue = comparableData.get(i);
            if (firstDataValue > maxValue) {
                isEco = false;
                break;
            }
            if (i == 1 || i == 3) {
                i++;
                secondDataValue = comparableData.get(i);
                if (firstDataValue + secondDataValue > maxValue) {
                    isEco = false;
                    break;
                }
            }
        }
        return isEco;
    }

    private static List<Integer> getComparableValues(Person person) {
        List<Integer> comparableValues = new ArrayList<>();
        comparableValues.add(person.getWaterCount());
        comparableValues.add(person.getGasCount1());
        comparableValues.add(person.getGasCount2());
        comparableValues.add(person.getElectroCount1());
        comparableValues.add(person.getElectroCount2());
        return comparableValues;
    }
}
