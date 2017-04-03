package Algorithms.WhiteboadQs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class FindUnique {

    public static int[] doWork(int[] a) {

        List<Integer> values = new ArrayList<Integer>();

        for (int i : a) {
            if (!values.contains(i))
                values.add(i);
        }

        int[] unique = new int[values.size() - 1];

        for (int i = 0; i < unique.length; i++) {
            unique[i] = values.get(i);
        }

        return unique;
    }

    public static int[] doWorkHashSet(int[] a) {

        List<Integer> nonUnique = new ArrayList<Integer>();

        for (int index = 0; index < a.length; index++) {
            nonUnique.add(a[index]);
        }

        Set<Integer> unique = new HashSet<Integer>(nonUnique);

        int[] toReturn = new int[unique.size()];

        int count = 0;
        for (int i : unique) {
            toReturn[count] = i;
            count++;
        }

        return toReturn;
    }

    public static char findFirstUniqueCharacter(String input) {

        boolean containsUnique = false;

        for(char c : input.toCharArray()){
            if(input.indexOf(c) == input.lastIndexOf(c)){
                containsUnique = true;
                return c;
            } else {
                containsUnique = false;
            }
        }

        return Character.MIN_VALUE;
    }
}
