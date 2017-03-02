package Tests;

import Algorithms.Search.BinarySearch;
import org.junit.Assert;
import org.junit.Test;


public class SearchTests {

    @Test
    public void BinarySearchTest() {

        final int[] numbers = {-3, -5, 1, 7, 4, -2, 8, 70, 16};
        final int key = 8;
        final int badKey = 99;

        boolean found = BinarySearch.search(numbers, key);
        Assert.assertTrue(found);

        found = BinarySearch.search(numbers, badKey);
        Assert.assertFalse(found);

    }
}
