package Algorithms.WhiteboadQs;


import java.util.*;

public class Fibonacci {

    private static Map<Integer, Long> cache = new HashMap<>();
    static {
        cache.put(0, 0L); //fibonacci(0)
        cache.put(1, 1L); //fibonacci(1)
    }

    public static long memoizedFibonacci(int x) {
        return cache.computeIfAbsent(x, n -> memoizedFibonacci(n-1) + memoizedFibonacci(n-2));
    }


    public static List<Integer> fibonacci(int n) {

        if (n < 0) {
            throw new IllegalArgumentException(
                    "n must not be less than zero");
        }
        if (n == 0) {
            return new ArrayList<>();
        }
        if (n == 1) {
            return Arrays.asList(0);
        }
        if (n == 2) {
            return Arrays.asList(0, 1);
        }

        final List<Integer> seq = new ArrayList<>(n);
        seq.add(0);
        n = n - 1;
        seq.add(1);
        n = n - 1;
        while (n > 0) {
            int a = seq.get(seq.size() - 1);
            int b = seq.get(seq.size() - 2);
            seq.add(a + b);
            n = n - 1;
        }
        return seq;
    }
}
