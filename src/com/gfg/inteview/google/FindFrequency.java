package com.gfg.inteview.google;

public class FindFrequency {

    static int findFrequency(int A[], int x) {

        int count_x = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == x) {
                count_x++;
            }
        }
        return count_x;
    }

    public static void main(String[] args) {

        int[] A = {1, 1, 1, 1, 1, 2};
        System.out.println(findFrequency(A, 1));
    }
}
