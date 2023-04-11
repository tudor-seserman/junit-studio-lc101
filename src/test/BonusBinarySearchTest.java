package test;

import main.BonusBinarySearch;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class BonusBinarySearchTest {
    int[] sortedNumbs;
    int[] sortedNumbs2;
    int one;
    int ten;
    int none;

    @Before
    public void beforeRun(){
        sortedNumbs = new int[]{1, 5, 6, 7, 10};

        sortedNumbs2 = new int[]{1, 5, 6, 7, 10, 11};
        one =1;
        ten = 10;
        none = 1000;
    }

    @Test
    public void sortedString(){
        assertEquals(0, BonusBinarySearch.binarySearch(sortedNumbs, one));
    }

    @Test
    public void sortedStringLast(){
        assertEquals(4, BonusBinarySearch.binarySearch(sortedNumbs, ten));
    }

    @Test
    public void sortedEvenString(){
        assertEquals(4, BonusBinarySearch.binarySearch(sortedNumbs2, ten));
    }

    @Test
    public void numNotInString(){
        assertEquals(-1, BonusBinarySearch.binarySearch(sortedNumbs, none));
    }

}