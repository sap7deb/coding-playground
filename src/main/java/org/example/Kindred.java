package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Kindred {

    public static void main(String[] args) {
        String[] games = new String[]{"Some Game", "Kind Game", "New Game", "Same Game", "Kiny Game", "Last Game"};
        Set<String> listStarts= Arrays.asList(games).stream().map(x->x.charAt(0)+"").collect(Collectors.toSet());
        System.out.println(listStarts);
        for(int i=0;i<games.length;i++){
            listStarts.add(games[i].charAt(0)+"");
        }

        for (String s: listStarts){
            List<String> group = Arrays.asList(games).stream().filter(x->x.startsWith(s)).collect(Collectors.toList());
            System.out.println(group);
        }

        Map<String, Integer> m= new HashMap<>();
        m.put("LocA",20);
        m.put("LocB",40);
        m.put("LocC",100);
        m.put("LocD",50);

        List<Integer> getTimes = m.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
        Collections.sort(getTimes);
       m.entrySet().stream().filter(x->x.getValue().equals(getTimes.get(0))).map(Map.Entry::getKey).forEach(System.out::println);



    }
}
