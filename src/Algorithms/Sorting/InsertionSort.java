package Algorithms.Sorting;

/*
    Insertion sort is a simple sorting algorithm that builds the final sorted array (or list) one item at a time. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort. However, insertion sort provides several advantages:

    Simple implementation

    Efficient for (quite) small data sets

    Adaptive (i.e., efficient) for data sets that are already substantially sorted: the time complexity is O(n + d), where d is the number of inversions

    More efficient in practice than most other simple quadratic (i.e., O(n2)) algorithms such as selection sort or bubble sort; the best case (nearly sorted input) is O(n)

    Stable; i.e., does not change the relative order of elements with equal keys

    In-place; i.e., only requires a constant amount O(1) of additional memory space

    Online; i.e., can sort a list as it receives it

    When humans manually sort something (for example, a deck of playing cards), most use a method
    that is similar to insertion sort
*/

import java.util.LinkedList;
import java.util.List;

public final class InsertionSort {//O(n^2)

    public static void sort(int[] a) {

        for (int i = 1; i < a.length; i++) {

            int temp = a[i];
            int j;

            for (j = i - 1; j >= 0 && temp <= a[j]; j--) {

                a[j + 1] = a[j];
                a[j + 1] = temp;
            }
        }
    }

    public static List<Integer> sort2(final List<Integer> numbers) {

        final List<Integer> sortedList = new LinkedList<Integer>();

        originalList:
        for (Integer number : numbers) {
            for (int i = 0; i < sortedList.size(); i++) {
                if (number < sortedList.get(i)) {
                    sortedList.add(i, number);
                    continue originalList;
                }
            }
            sortedList.add(sortedList.size(), number);
        }

        return sortedList;
    }
}
