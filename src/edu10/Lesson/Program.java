package edu10.Lesson;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("second", "third", "fourth", "first", "first");
        System.out.println("Origin = " + list);
        //
        Collections.reverse(list);
        System.out.println("reverse = " + list);

        //reverse sort order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("sort.reverseOrder = " + list);

        // sorting
        Collections.sort(list);
        System.out.println("sort = " + list);

        // uses a binary search algorithm to find a specific element;
        // returns the element number or a negative number
        System.out.println("binarySearch second = " + Collections.binarySearch(list, "second"));

        //randomly reorders elements
        Collections.shuffle(list);
        System.out.println("shuffle = " + list);

         // max value, min value,
        System.out.println("max = " + Collections.max(list));
        System.out.println("min = " + Collections.min(list));

        // cyclically shifts the elements passed to it by distance
        // positions forward (+) or backward (-)
        Collections.rotate(list, -1);
        System.out.println("rotate -1 = " + list);
       
        // copy collection
        List<String> listDestination = Arrays.asList("green", "black");
        Collections.copy(list, listDestination);
        System.out.println("copy = " + list);

        // returns the total number of occurrences of the
        // specified element in the list
        System.out.println("frequency first = " + Collections.frequency(list, "first"));
    }
}
