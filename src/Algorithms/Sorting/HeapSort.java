package Algorithms.Sorting;

/*
    The heapsort algorithm can be divided into two parts.

    In the first step, a heap is built out of the data. The heap is often placed in an array with the layout
    of a complete binary tree. The complete binary tree maps the binary tree structure into the array indices;
    each array index represents a node; the index of the node's parent, left child branch, or right child branch
    are simple expressions. For a zero-based array, the root node is stored at index 0;
    if i is the index of the current node, then

    iParent     = floor((i-1) / 2)
    iLeftChild  = 2*i + 1
    iRightChild = 2*i + 2

    In the second step, a sorted array is created by repeatedly removing the largest element from the heap (the root of the heap),
    and inserting it into the array. The heap is updated after each removal to maintain the heap.
    Once all objects have been removed from the heap, the result is a sorted array.

    Heapsort can be performed in place. The array can be split into two parts, the sorted array and the heap.
    The storage of heaps as arrays is diagrammed here. The heap's invariant is preserved after each extraction,
    so the only cost is that of extraction.
*/

public final class HeapSort {//O(n log n)

    public static void sort(int[] data) {

        int count = data.length;

        Heapify(data, count);

        int end = count - 1;
        while (count > 0) {

            //Swap the largest element (data[0]) with the final element of unsorted part
            int temp = data[end];
            data[end] = data[0];
            data[0] = temp;

            siftDown(data, 0, end - 1);
            end--;
        }
    }

    private static void Heapify(int[] data, int count) {
        int start = (count - 2) / 2;

        while (start >= 0) {
            siftDown(data, start, count - 1);
            start--;
        }
    }

    private static void siftDown(int[] data, int start, int end) {

        int root = start;

        while ((root * 2 + 1) <= end) {
            int child = root * 2 + 1;

            if (child + 1 <= end && data[child] < data[child + 1]) {
                child = child + 1;
            }

            if (data[root] < data[child]) {
                int temp = data[root];
                data[root] = data[child];
                data[child] = temp;
                root = child;
            } else {
                return;
            }
        }
    }
}
