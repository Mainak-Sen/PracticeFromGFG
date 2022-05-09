package com.gfg.inteview.google;

import java.util.Arrays;
import java.util.Stack;

public class OverlappingIntervals {

    public static int[][] overlappedInterval(int[][] intervals) {

        Pair[] pairs = new Pair[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            pairs[i] = new Pair(intervals[i][0], intervals[i][1]);
        }

        Arrays.sort(pairs); //sorting the pairs array w.r.t start time

        Stack<Pair> stack = new Stack<>();
        for (int i = 0; i < pairs.length; i++) {
            if (i == 0) {
                stack.push(pairs[i]);
            } else {
                Pair top = stack.peek();
                if (pairs[i].startTime > top.endTime) {
                    stack.push(pairs[i]);
                } else {
                    top.endTime = Math.max(pairs[i].endTime, top.endTime);
                }
            }
        }

        //the expected order is reverse
        // as when we push into the stack and pop the elements ,they are in reverse order in which they were pushed
        //hence we will push the elements back again into a resultant stack and then access them .
        Stack<Pair> resultStack = new Stack<>();
        while (!stack.isEmpty()) {
            resultStack.push(stack.pop());
        }

        int[][] resultantArray = new int[resultStack.size()][2];
        for (int i = 0; i < resultantArray.length; i++) {
            if (!resultStack.isEmpty()) {
                Pair poppedElement = resultStack.pop();
                resultantArray[i][0] = poppedElement.startTime;
                resultantArray[i][1] = poppedElement.endTime;
            }
        }
        return resultantArray;
    }

    public static void main(String[] args) {

        int[][] intervals = {{6, 8}, {1, 9}, {2, 4}, {4, 7}};
        int[][] mergedIntervals = overlappedInterval(intervals);

        for (int[] interval : mergedIntervals) {
            System.out.print("{" + interval[0] + "," + interval[1] + "}" + " ");
        }
    }

    public static class Pair implements Comparable<Pair> {

        int startTime;
        int endTime;

        public Pair(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        @Override
        public int compareTo(Pair other) {
            if (this.startTime != other.startTime) {
                return this.startTime - other.startTime;
            } else {
                return this.endTime - other.endTime;
            }
        }
    }

}
