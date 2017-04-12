package Tests;

import Algorithms.WhiteboadQs.FibonocciHelpers;
import Algorithms.WhiteboadQs.FindUnique;
import Algorithms.WhiteboadQs.StringQs;
import Algorithms.WhiteboadQs.TowersOfHanoi;
import org.junit.Assert;
import org.junit.Test;


public class WhiteboardTests {


    @Test
    public void fibonocciTest() {


        for (int i = 0; i< 10; i++) {
            System.out.println(FibonocciHelpers.fibRecursive(i));
        }
    }

    @Test
    public void hanoiTest() {
        TowersOfHanoi.towerOfHanoi(5, "A", "B", "C");
    }

    @Test
    public void findUniqueCharTest() {


        char expected =  "a".charAt(0);
        char c = FindUnique.findFirstUniqueCharacter("yeeyssa");
        Assert.assertEquals(c, expected);
        char c2 = FindUnique.findFirstUniqueCharacter("nnnnn");
        Assert.assertEquals(c2, Character.MIN_VALUE);
    }


    @Test
    public void removeNonUniqueCharTest() {


        String input = "ccccgqqqqoeeeeattttlffff";
        String expected = "goal";

        String returned = StringQs.removeNonUnique(input);
        Assert.assertEquals(expected, returned);
    }
}
