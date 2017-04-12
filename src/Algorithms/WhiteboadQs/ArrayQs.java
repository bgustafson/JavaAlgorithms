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


    public static int[] findPrimes(int[] array) {

        List<Integer> primes = new ArrayList<Integer>();

        for (int a : array) {

            boolean prime = isPrime(a);

            if (prime) {
                primes.add(a);
            }
        }

        int[] finalArray = new int[primes.size()];
        for(int i = 0; i < primes.size(); i++) array[i] = primes.get(i);
        return finalArray;
    }

    private static boolean isPrime(long n) {

        boolean isPrime = true;

        if(n < 2) {
            isPrime = false;
        }

        for(int j = 2; j < n; j++) {
            if(n % j == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }


    public static long removeRandom(int[] a) {

        //This for an array that is already sequentially ordered

        int randomIndex = getRandom(a[a.length -1 ] , 0);

        int numRemoved = a[randomIndex];

        int[] newAbove = new int[randomIndex];
        int[] newBelow = new int[(a.length - randomIndex) - 1];

        //Add the items above the index to new array
        for (int i = 0; i < randomIndex; i++) {
            newAbove[i] = a[i];
        }

        //Add the items below the index to new array
        int helper = 0;
        for (int i = randomIndex + 1; i < a.length; i++) {
            newBelow[helper] = a[i];
            helper++;
        }

        int maxAbove = 0, minBelow = 0;
        //figure out what was removed based on the two arrays
        if(newAbove.length > 0) {
            maxAbove = newAbove[newAbove.length - 1];
        }
        if(newBelow.length > 0) {
            minBelow = newBelow[0];
        }

        return maxAbove + 1;
    }

    private static int getRandom(int max, int min) {
        int random = 0;

        Random r = new Random();
        random = r.nextInt((max - min) + 1) + min;

        return random;
    }
}
