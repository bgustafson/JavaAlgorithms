package Tests;

import Algorithms.Search.BinarySearch;
import Algorithms.Search.LinearSearch;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class SearchTests {

    @Test
    public void BinarySearchTest() {

        final int[] numbers = {-5, -3, -2, 1, 4, 7, 8, 16, 18, 25};
        Arrays.sort(numbers);
        final int key = 8;
        final int badKey = 99;

        boolean found = BinarySearch.search(numbers, key);
        assertTrue(found);

        found = BinarySearch.search(numbers, badKey);
        assertFalse(found);

    }


    @Test
    public void linearSearchTest() {
        final int[] numbers = {-3, -5, 1, 7, 4, -2, 8, 70, 16};
        final int find = 16;
        final int expected = 8;
        final int shouldntBeThere = 155;

        int index = LinearSearch.findIndex(numbers, find);
        assertEquals(expected, index);


        index = LinearSearch.findIndex(numbers, shouldntBeThere);
        assertEquals(-1, index);
    }
}
