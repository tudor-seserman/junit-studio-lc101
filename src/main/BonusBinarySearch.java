package main;

import java.util.Arrays;

public class BonusBinarySearch {

    /**
     * A binary search implementation for integer arrays.
     *
     * Info about binary search: https://www.geeksforgeeks.org/binary-search/
     *
     * @param sortedNumbers - must be sorted from least to greatest
     * @param n - number to search for
     * @return index of search item if it's found, -1 if not found
     */
    public static int binarySearch(int[] sortedNumbers, int n) {
        int right = sortedNumbers.length - 1;
        int left = 0;


                while (right >= left) {
                   int  mid = left + ((right - left) / 2);
//                    System.out.println("Right:"+right+"\n"+
//                            "Left:"+left+"\nMid:"+
//                            mid);
                    if (sortedNumbers[mid] > n) {
                        right--;
                    } else if (sortedNumbers[mid] < n) {
                        left++;
                    } else {
                        return mid;

                    }
                }



        return -1;
    }

}
