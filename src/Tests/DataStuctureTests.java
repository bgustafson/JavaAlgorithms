package Tests;


import Algorithms.DataStructures.MyListImpl;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DataStuctureTests {


    @Test(expected = IndexOutOfBoundsException.class)
    public void testMyListImpl() {

        MyListImpl<Integer> list = new MyListImpl<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        assertTrue(5 == list.get(4));
        list.get(10);
    }


}
