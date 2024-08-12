package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaSteamsAndLambda {

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2,3,8,5,3);
        List<Integer> square = number.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(square);

        List<String> names = Arrays.asList("Reflection","Collection","Stream", "StreamTest");
        List result = names.stream().filter(s->s.startsWith("S")).filter(s->s.endsWith("t")).collect(Collectors.toList());
        System.out.println(result);

        List result2 = number.stream().sorted().collect(Collectors.toList());
        number.stream().sorted().forEach(System.out::println);
        System.out.println(result2);
        int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
        System.out.println(even);

        int product = IntStream.range(2, 8)
                .reduce((num1, num2) -> num1 * num2)
                .orElse(-1);

        // Displaying the product
        System.out.println("The product is : " + product);

        Map<String, Double> m= new HashMap<>();
        m.put("Loy",91.6);
        m.put("Soy",91.2);
        m.put("Roy",89.8);
        m.put("Toy",90.4);
        System.out.println("Map down");
        System.out.println("Line 29--->"+m.entrySet().stream().filter(x->x.getValue()>91).map(Map.Entry::getKey).collect(Collectors.toList()));
        List<String> name= m.entrySet().stream().filter(x->x.getValue()>91).map(Map.Entry::getKey).collect(Collectors.toList());
        m.entrySet().stream().map(Map.Entry::getKey).forEach(System.out::print);
        for (String s: name){
            System.out.println(s);
        }

        Integer[] empIds = { 1, 2, 3 };

        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);

        // Using lambda expression to print all elements
        // of arrL
        arrL.forEach(n -> System.out.println(n));

        // Using lambda expression to print even elements
        // of arrL
        arrL.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(n);
        });
    }
}
