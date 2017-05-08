package Algorithms.Search;

/*
    For binary search, the array should be arranged in ascending or descending order.
    In each step, the algorithm compares the search key value with the key value of the middle element of the array.
    If the keys match, then a matching element has been found and its index, or position, is returned.
    Otherwise, if the search key is less than the middle element's key, then the algorithm repeats
    its action on the sub-array to the left of the middle element or, if the search key is greater,
    on the sub-array to the right. If the remaining array to be searched is empty, then the key cannot
    be found in the array and a special "not found" indication is returned.
*/

public class BinarySearch {//O(log n)

    public static boolean search(int[] values, int key) {

        //test to see if the array is empty, this means the key is not found in the collection
        if (values.length == 0) {
            return false;
        }

        int low = 0;
        int high = values.length - 1;

        while (low <= high) {

            //Get midpoint of array
            int middle = (low + high) / 2;

            if (key > values[middle]) {
                low = middle + 1;
            } else if (key < values[middle]) {
                high = middle - 1;
            } else {
                return true;
            }
        }

        return false;
    }
}
