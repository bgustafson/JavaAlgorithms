package Algorithms.Search;


public class LinearSearch {

    public static int findIndex(int[] values, int find) {

        for (int i = 0; i < values.length; i++) {
            if(values[i] == find) {
                return i;
            }
        }

        return -1;
    }
}
