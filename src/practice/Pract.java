package practice;

import java.util.*;
import java.util.stream.Collectors;

public class Pract {

    public static void main(String[] args) {

        List<String> strList = Arrays.asList("a", "b", "c", "b", "a");

// toCollection()
        Collection<String> strCollection = strList.parallelStream().collect(Collectors.toCollection(HashSet::new));
        System.out.println(strCollection); // [a, b, c]

        Set<String> strSet = strList.parallelStream().collect(Collectors.toCollection(HashSet::new));
        System.out.println(strSet); // [a, b, c]

        List<String> strList1 = strList.parallelStream().sorted(String::compareToIgnoreCase)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(strList1); // [a, a, b, b, c]

    }

}