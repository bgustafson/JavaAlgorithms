package Algorithms;

import Algorithms.WhiteboadQs.ArrayQs;

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

        //double d = new ClockAngle().doWork(3, 55);
        // System.out.print(d);
    }
}
