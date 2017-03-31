package com.cunxin.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    /**
     * Given an array S of n integers, are there elements a, b, c,
     * and d in S such that a + b + c + d = target? Find all unique quadruplets
     * in the array which gives the sum of target.
     */
    public static void fourSum(int[] a, int target) {

    }

    /**
     * 先对数列进行一下预处理，也就是排序，然后用两个变量，一个从前往后遍历，一个从后往前遍历
     *
     * @param a
     * @param target
     */
    public static void twoSum(int[] a, int target) {
        List<String> result = new ArrayList<String>();
        int i = 0;
        int j = a.length - 1;
        Arrays.sort(a);
        while (i < j) {
            int sum = a[i] + a[j];
            if (sum == target) {
                result.add("{" + String.valueOf(a[i]) + "," + String.valueOf(a[j]) + "}");
                ++i;
                --j;
            } else if (sum < target) {
                ++i;
            } else {
                --j;
            }
        }
        System.out.println(result.toString());
    }

    public static void threeSum(int[] a, int target) {
        Arrays.sort(a);
        List<String> result = new ArrayList<String>();
        int k = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            int j = i + 1;
            while (j < k) {
                int o = target - a[i];
                int sum = a[j] + a[k];
                if (sum == o) {
                    result.add("{" + String.valueOf(a[i]) + "," + String.valueOf(a[j])
                            + "," + String.valueOf(a[k]) + "}");
                    --k;
                    ++j;
                } else if (sum < o) {
                    ++j;
                } else {
                    --k;
                }
            }
        }
        System.out.println(result.toString());
    }


    public static void main(String[] args) {
        int[] a = new int[]{1, 0, 2, 3, -1, 0, -2};
        twoSum(a, 0);
        threeSum(a, 0);
    }
}
