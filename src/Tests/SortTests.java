package Tests;

import Algorithms.Sorting.*;
import Comparators.ReverseNumericalOrder;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

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

    @Test
    public void BubbleSortAscendingTest() {

        final int[] numbers =  { 4, 7, 1, 6, 3, 5, 2 };
        final int[] expected = { 1, 2, 3, 4, 5, 6, 7 };

        int[] sorted = BubbleSort.sortAscending(numbers);
        assertArrayEquals(expected, sorted);
    }

    @Test
    public void BubbleSortDescendingTest() {

        final int[] numbers =  { 4, 7, 1, 6, 3, 5, 2 };
        final int[] expected = { 7, 6, 5, 4, 3, 2, 1 };

        int[] sorted = BubbleSort.sortDescending(numbers);
        assertArrayEquals(expected, sorted);
    }

    @Test
    public void HeapSortTest() {

        final int[] numbers =  { 4, 7, 1, 6, 3, 5, 2 };
        final int[] expected = { 1, 2, 3, 4, 5, 6, 7 };

        int[] sorted = HeapSort.sort(numbers);
        assertArrayEquals(expected, sorted);
    }

    @Test
    public void InsertionSortTest() {

        final List<Integer> numbers = Arrays.asList(4, 7, 1, 6, 3, 5, 2);
        final List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        final List<Integer>  sorted = InsertionSort.sort(numbers);
        assertEquals(expected, sorted);
    }

    @Test
    public void MergeSortTest() {

        final int[] numbers =  { 10, 4, 7, 1, 6, 3, 5, 2 };
        final int[] expected = { 1, 2, 3, 4, 5, 6, 7, 10 };

        int[] sorted = MergeSort.sort(numbers);
        assertArrayEquals(expected, sorted);
    }

    @Test
    public void QuickSortTest() {

        final int[] numbers =  { 4, 7, 1, 6, 3, 5, 2 };
        final int[] expected = { 1, 2, 3, 4, 5, 6, 7 };

        int[] sorted = QuickSort.sort(numbers);
        assertArrayEquals(expected, sorted);
    }
}
