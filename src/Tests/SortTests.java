package Tests;

import Comparators.ReverseNumericalOrder;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class SortTests {

    @Test
    public void sortInts() {

        final int[] numbers = {-3, -5, 1, 7, 4, -2};
        final int[] expected = {-5, -3, -2, 1, 4, 7};

        Arrays.sort(numbers);
        assertArrayEquals(expected, numbers);
    }

    @Test
    public void sortObjects() {

        final String[] strings = {"z", "x", "y", "abc", "zzz", "zazzy"};
        final String[] expected = {"abc", "x", "y", "z", "zazzy", "zzz"};

        Arrays.sort(strings);
        assertArrayEquals(expected, strings);
    }

    @Test
    public void customSorting() {

        final List<Integer> numbers = Arrays.asList(4, 7, 1, 6, 3, 5, 4);
        final List<Integer> expected = Arrays.asList(7, 6, 5, 4, 4, 3, 1);

        Collections.sort(numbers, new ReverseNumericalOrder());
        assertEquals(expected, numbers);
    }
}
