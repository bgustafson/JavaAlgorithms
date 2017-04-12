package Tests;

import Algorithms.WhiteboadQs.Fibonacci;
import Algorithms.WhiteboadQs.StringQs;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class WhiteBoardTests {


    @Test
    public void fibonocciList() {
        assertEquals(0, Fibonacci.fibonacci(0).size());
        assertEquals(Arrays.asList(0), Fibonacci.fibonacci(1));
        assertEquals(Arrays.asList(0, 1), Fibonacci.fibonacci(2));
        assertEquals(Arrays.asList(0, 1, 1), Fibonacci.fibonacci(3));
        assertEquals(Arrays.asList(0, 1, 1, 2), Fibonacci.fibonacci(4));
        assertEquals(Arrays.asList(0, 1, 1, 2, 3), Fibonacci.fibonacci(5));
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5), Fibonacci.fibonacci(6));
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8), Fibonacci.fibonacci(7));
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13), Fibonacci.fibonacci(8));
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21), Fibonacci.fibonacci(9));
    }


    @Test
    public void reverseStringTest() {
        final String expected = "diordnA";

        String actual = StringQs.reverseInPlace("Android");
        assertEquals(expected, actual);
    }


    @Test
    public void uniqueCharsTest() {

        String val = "hhgjjotttttappppl";
        String expected = "goal";


        String returned = StringQs.removeNonUnique(val);
        assertEquals(expected, returned);

    }
}
