package Algorithms.Sorting;

/*
    If the array contains only one element or zero elements then the array is sorted.

    If the array contains more then one element then:

    Select an element from the array. This element is called the "pivot element".
    For example select the element in the middle of the array.

    All elements which are smaller then the pivot element are placed in one array and all elements which are larger are placed in another array.

    Sort both arrays by recursively applying Quicksort to them.

    Combine the arrays

    Quicksort can be implemented to sort "in-place". This means that the sorting takes place in the array and that no additional array needs to be created.

*/

public final class QuickSort {//O(n log n)

    private static int[] numbers;

    public static void sort(int[] values) {

        //If the array is null or only has one item return because the array is already sorted.
        if (values == null || values.length < 0) {
            return;
        }

        //Set the numbers class variable to the argument and call the quickSort method.
        numbers = values;
        quickSort(0, numbers.length - 1);
    }

    private static void quickSort(int low, int high) {

        int i = low, j = high;

        //Get the pivot point which is close to the middle of the array.
        int pivot = numbers[low + (high - low) / 2];

        //Divide into two lists
        while (i <= j) {

            //If the current value from the left list is smaller than the pivot
            //element then get the next element from the left list
            while (numbers[i] < pivot) {
                i++;
            }

            //if the current element from the right list is larger than the pivot
            //element then the next element from the right list
            while (numbers[j] > pivot) {
                j--;
            }

            //If we have found a value in the left list which is larger than the pivot
            //element and if we have found a a value in the right list which is smaller
            //than the pivot element then we exchange the values and increment i and j.
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }

        //Recursively call the sort method
        if (low < j)
            quickSort(low, j);
        if (i < high)
            quickSort(i, high);
    }

    private static void exchange(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}
