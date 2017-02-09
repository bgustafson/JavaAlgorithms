package Algorithms.WhiteboadQs;

public final class FibonocciHelpers {

    public static int getNthNumberRecursive(int n) {

        if (n < 2) {
            return 1;
        }

        return getNthNumberRecursive(n - 1) + getNthNumberRecursive(n - 2);
    }


    public static int getNthNumberIterative(int n) {

        int a = 0, b = 1;

        if (n == 0) {
            return a;
        }

        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
