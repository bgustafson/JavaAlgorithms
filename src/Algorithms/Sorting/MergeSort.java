package Algorithms.Sorting;

/*

During the Mergesort process the object in the collection are divided into two collections.
To split a collection, Mergesort will take the middle of the collection and split the collection into its left and its right part.

The resulting collections are again recursively sorted via the Mergesort algorithm.

Once the sorting process of the two collections is finished, the result of the two collections is combined.
To combine both collections Mergesort starts at each collection at the beginning. It picks the object which is smaller
and inserts this object into the new collection. For this collection it now selects the next elements and selects
the smaller element from both collections.

Once all elements from both collections have been inserted in the new collection, Mergesort has successfully sorted the collection.

To avoid the creation of too many collections, typically one new collection is created and the left and right side are treated as different collections.

*/


public final class MergeSort {//O(n log n)

    private static int[] numbers;
    private static int[] temp;

    public static int[] sort(int[] values) {

        if (values.length == 0) {
            return values;
        }

        numbers = values;
        temp = new int[values.length];

        mergeSort(0, values.length - 1);
        return numbers;
    }

    private static void mergeSort(int low, int high) {
        //check if low is smaller than high.  if not then the array is sorted.
        if (low < high) {
            //get the index of the middle element
            int middle = low + (high - low) / 2;

            //sort the left side of the array
            mergeSort(low, middle);

            //sort the right side of the array
            mergeSort(middle + 1, high);

            //combine the arrays
            merge(low, middle, high);
        }
    }

    private static void merge(int low, int middle, int high) {
        //copy into the temp array both halves
        for (int i = low; i <= high; i++) {
            temp[i] = numbers[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;

        //copy smallest values from either left or right array back to original array
        while (i <= middle && j <= high) {
            if (temp[i] <= temp[j]) {
                numbers[k] = temp[i];
                i++;
            } else {
                numbers[k] = temp[j];
                j++;
            }
            k++;
        }

        //copy the rest of the left side of the array into the target array
        while (i <= middle) {
            numbers[k] = temp[i];
            k++;
            i++;
        }
    }
}
