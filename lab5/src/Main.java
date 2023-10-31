import Exceptions.EmptyCollectionException;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> list1 = List.of(4, 5, 6);
        System.out.println("Average of " + list1 + " is " + StreamMethods.getAverageValue(list1));
        List<String> listStr = List.of("some", "list", "of", "strings");
        System.out.println("Transformed " + listStr + " is " + StreamMethods.transformStrings(listStr));
        List<Double> list2 = List.of(3.0, 3.0, 5.0, 7.0);
        System.out.println("Unique squares of " + list2 + " are " + StreamMethods.getUniqueSquares(list2));
        System.out.println("Words starting with letter s in " + listStr + " are " + StreamMethods.getStringsStartingWithLetter(listStr, 's'));
        try {
            List<Integer> emptyList = List.of();
            System.out.println("Last elem in collection " + listStr + " is " + StreamMethods.getLastElement(listStr));
            System.out.println("Last elem in collection " + emptyList + " is " + StreamMethods.getLastElement(emptyList));
        } catch (EmptyCollectionException e) {
            System.out.println(e.getMessage());
        }

        int [] arr1 = {1, 3, 5, 6, 10};
        System.out.println("Sum of evens in " + Arrays.toString(arr1) + " is " + StreamMethods.getSumOFEvens(arr1));
        System.out.println("List " + listStr + " to map " + StreamMethods.convertListToMap(listStr));
    }
}
