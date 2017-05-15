package Tests;

import Algorithms.WhiteboadQs.*;
import org.junit.Assert;
import org.junit.Test;


public class WhiteboardTests {


    @Test
    public void fibonocciTest() {


        for (int i = 0; i < 10; i++) {
            System.out.println(FibonocciHelpers.fibRecursive(i));
        }

        System.out.println("-----------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.println(Fibonacci.memoizedFibonacci(i));
        }
    }

    @Test
    public void hanoiTest() {
        TowersOfHanoi.towerOfHanoi(5, "A", "B", "C");
    }

    @Test
    public void findUniqueCharTest() {


        char expected = "a".charAt(0);
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


    @Test
    public void palindromeTest() {

       boolean isPal = StringQs.isPalindrome2("alula");
       Assert.assertEquals(true, isPal);

       isPal = StringQs.isPalindrome2("Noway");
       Assert.assertEquals(false, isPal);
    }


    @Test
    public void isAnogramTest() {

        boolean isAno;

        isAno = StringQs.isAnagram("Mother In Law", "Hitler Woman");
        Assert.assertEquals(true, isAno);
        isAno = StringQs.isAnagram("keEp", "peeK");
        Assert.assertEquals(true, isAno);
        isAno = StringQs.isAnagram("SiLeNt CAT", "LisTen AcT");
        Assert.assertEquals(true, isAno);
        isAno = StringQs.isAnagram("Debit Card", "Bad Credit");
        Assert.assertEquals(true, isAno);
        isAno = StringQs.isAnagram("School MASTER", "The ClassROOM");
        Assert.assertEquals(true, isAno);
        isAno = StringQs.isAnagram("DORMITORY", "Dirty Room");
        Assert.assertEquals(true, isAno);
        isAno = StringQs.isAnagram("ASTRONOMERS", "NO MORE STARS");
        Assert.assertEquals(true, isAno);
        isAno = StringQs.isAnagram("Toss", "Shot");
        Assert.assertEquals(false, isAno);
        isAno = StringQs.isAnagram("joy", "enjoy");
        Assert.assertEquals(false, isAno);
    }
}
