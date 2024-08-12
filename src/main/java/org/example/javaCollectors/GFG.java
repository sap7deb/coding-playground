package org.example.javaCollectors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class GFG {
    public static void main(String[] args) {
        System.out.println(prepareTemperature().stream()
                .filter(f -> f.getTemperature() > 10)
                .map(f -> f.getName())
                .collect(Collectors.toList()));

        System.out.println(prepareTemperature()
                .stream()
                .filter(f -> f.getTemperature() > 10)
                .map(f -> f.getName())
                .collect(Collectors.toSet()));


        System.out.println(String.valueOf(prepareTemperature()
                .stream()
                .map(f -> f.getName())
                .collect(Collectors.toCollection(ArrayList::new))));

        System.out.println(prepareTemperature()
                .stream()
                .filter(city -> city.getTemperature() > 10)
                .collect(Collectors.toMap(
                        City::getName,
                        City::getTemperature,
                        (key, identicalKey) -> key)));

        System.out.println(prepareTemperature()
                .stream()
                .collect(Collectors.groupingBy(
                        City::getName,
                        Collectors.collectingAndThen(
                                Collectors.counting(),
                                f -> f.intValue()))));

        System.out.println(prepareTemperature()
                .stream()
                .collect(Collectors.groupingBy(City::getName)));

        System.out.println(prepareTemperature()
                .stream()
                .filter(city -> city.getTemperature() > 10)
                .map(f -> f.getName())
                .collect(Collectors.joining(", ")));

        HashMap<String, Integer> map
                = new HashMap<>();
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);

        ArrayList<String> listOfKeys
                = map.keySet().stream().collect(
                Collectors.toCollection(ArrayList::new));

        ArrayList<Integer> listOfValues
                = map.values().stream().collect(
                Collectors.toCollection(ArrayList::new));

        System.out.println("The Keys of the Map are "
                + listOfKeys);

        System.out.println("The Values of the Map are "
                + listOfValues);


    }

    private static List<City> prepareTemperature()
    {
        List<City> cities = new ArrayList<>();
        cities.add(new City("New Delhi", 33.5));
        cities.add(new City("Mexico", 14));
        cities.add(new City("New York", 13));
        cities.add(new City("Dubai", 43));
        cities.add(new City("London", 15));
        cities.add(new City("Alaska", 1));
        cities.add(new City("Kolkata", 30));
        cities.add(new City("Sydney", 11));
        cities.add(new City("Mexico", 14));
        cities.add(new City("Dubai", 43));
        return cities;
    }
}
