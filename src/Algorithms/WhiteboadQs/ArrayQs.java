package Algorithms.WhiteboadQs;

import Algorithms.Sorting.MergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class ArrayQs {

    public static int getFirstUniqueValue(int[] a) {

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < a.length; i++) {
            if (list.contains(a[i])) {
                list.remove(a[i]);
                continue;
            }
            list.add(a[i]);
        }

        if (list.size() == 0) {
            return -1;
        }

        return list.get(0);
    }

    public static <T> T[] reverseArray(T[] a) {

        for (int i = 0; i < a.length / 2; i++) {
            T temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }

        return a;
    }

    public static int[] suffle(int[] a) {

        Random rgen = new Random();  // Random number generator
        rgen.nextInt();

        for (int i = 0; i < a.length; i++) {
            int randomPosition = i + rgen.nextInt(a.length - i);

            int temp = a[i];
            a[i] = a[randomPosition];
            a[randomPosition] = temp;
        }

        return a;
    }

    public static int[] MergeAndSort2Arrays(int[] a, int[] b) {

        int[] array = new int[a.length + b.length];

        System.arraycopy(a, 0, array, 0, a.length);
        System.arraycopy(b, 0, array, a.length, b.length);

        int[] sortedArray = MergeSort.sort(array);

        return sortedArray;
    }
}
