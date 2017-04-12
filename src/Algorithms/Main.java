package Algorithms;

import Algorithms.Sorting.HeapSort;
import Algorithms.WhiteboadQs.ArrayQs;
import Algorithms.WhiteboadQs.ClockAngle;

public class Main {

    public static void main(String[] args) {

        //int[] nonUnique = new int[] { 1, 2, 3, 4, 5, 1, 5 };
        //int[] a = FindUnique.doWork(nonUnique);
        //System.out.print(a);

        //int[] a = ArrayQs.MergeAndSort2Arrays(new int[] {1, 8, 7, 12}
        // ,new int[] {2, 9, 11} );
        //System.out.print(a);

        Integer[] a = ArrayQs.reverseArray(new Integer[]{1, 8, 7, 12});
        for (Integer i : a) {
            System.out.print(i + ", ");
        }

        double d = ClockAngle.doWork(3, 30);
        System.out.println("\n" + d);


        //List<Integer> ints = InsertionSort.sort2(new LinkedList<Integer>(Arrays.asList(1, 12, 4, 3, 17, 2)));

        //int[] aFromQuickSort = QuickSort.sort(new int[]{ 1, 5, 2, 7, 6, 4, 30, 24});

        int[] aFromHeapSort = HeapSort.sort(new int[]{ 1, 5, 2, 7, 6, 4, 30, 24});

        long removed = ArrayQs.removeRandom(new int[]  { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
    }
}
