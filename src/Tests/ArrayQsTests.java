package Tests;

import Algorithms.WhiteboadQs.ArrayQs;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class ArrayQsTests {

    @Test
    public void primeNumberTest() {
        final int[] numbers =  { 4, 7, 1, 6, 3, 5, 2 };
        final int[] primes = { 7, 3, 5, 2};


        int[] primesReturned = ArrayQs.findPrimes(numbers);
        assertArrayEquals(primes, primesReturned);
    }


    @Test
    public void removeRandomNumberTest() {
        final int[] numbers =  { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        long removed = ArrayQs.removeRandom(numbers);

        //MOCK Random

    }
}
