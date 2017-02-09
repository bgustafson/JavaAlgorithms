package Algorithms.Sorting;

/*
    Bubble sort, sometimes referred to as sinking sort, is a simple sorting algorithm that works by repeatedly
    stepping through the list to be sorted, comparing each pair of adjacent items and swapping them if they
    are in the wrong order. The pass through the list is repeated until no swaps are needed, which indicates
    that the list is sorted. The algorithm gets its name from the way smaller elements "bubble" to the
    top of the list. Because it only uses comparisons to operate on elements, it is a comparison sort.
    Although the algorithm is simple, most of the other sorting algorithms are more efficient for large lists.
*/

public final class BubbleSort { //O(n^2)

    public static void sort(int[] a) {

        int temp;

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {

                if (a[i] > a[j]) {
                    temp = a[j + 1];
                    a[j + 1] = a[i];
                    a[i] = temp;
                }
            }
        }
    }

    public static void sort2(int[] a) {

        boolean switched;
        do {

            switched = false;

            for (int i = 0; i < a.length - 1; i++) {

                if (a[i + 1] < a[i]) {
                    int temp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                    switched = true;
                }
            }

        } while (switched);
    }
}
