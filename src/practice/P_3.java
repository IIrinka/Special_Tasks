package practice;

import javax.xml.crypto.Data;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;


public class P_3 {
    public static void main(String[] args) {

        List<String> listWithDuplicates = Arrays.asList("a", "bb", "c", "d", "bb");
        Set<String> result = listWithDuplicates.stream().collect(toSet());
        System.out.println(result.size());

    }

    public List<String> no9(List<String> strings) {
/**

 Given a list of non-negative integers, return a list of those numbers except omitting
 any that end with 9.
 no9([1, 2, 19]) → [1, 2]
 no9([9, 19, 29, 3]) → [3]
 no9([1, 2, 3]) → [1, 2, 3]
 */

        return strings.stream()
                .map(n -> n + "y").filter(n -> !n.contains("yy"))
                .collect(Collectors.toList());
    }
}
