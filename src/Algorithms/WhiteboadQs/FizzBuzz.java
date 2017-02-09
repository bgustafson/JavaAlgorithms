package Algorithms.WhiteboadQs;

public final class FizzBuzz {

    public void doWork(int num) {

        for (int i = 1; i <= num; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz");
            }

            if (i % 3 == 0) {
                System.out.print("Fizz");
            }

            if (i % 5 == 0) {
                System.out.print("Buz");
            }

            System.out.print(i);
        }
    }
}
