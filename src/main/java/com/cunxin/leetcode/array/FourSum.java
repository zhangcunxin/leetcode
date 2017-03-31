package com.cunxin.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    /**
     * K-SUM 问题
     * 给定一个整数数列，从其中找k个数字，使得他们的和等于一个给定的值,并列出所有的组合
     */

    /**
     * Given an array S of n integers, are there elements a, b, c,
     * and d in S such that a + b + c + d = target? Find all unique quadruplets
     * in the array which gives the sum of target.
     */

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
        int j = a.length - 1;
        for (int n = 0; n < a.length; n++) {
            int i = n + 1;
            int o = target - a[n];

            while (i < j) {
                int sum = a[i] + a[j];
                if (sum == o) {
                    result.add("{" + String.valueOf(a[n]) + "," + String.valueOf(a[i])
                            + "," + String.valueOf(a[j]) + "}");
                    --j;
                    ++i;
                } else if (sum < o) {
                    ++i;
                } else {
                    --j;
                }
            }
        }
        System.out.println(result.toString());
    }

    /**
     * K-SUM 递归解
     *
     * @param a
     * @param target
     * @param k
     */
    public static void kSum(int[] a, int target, int k) {
        Arrays.sort(a);
        for (int m = 2; m < k; m++) {

        }
    }


    public static void main(String[] args) {
        int[] a = new int[]{1, 0, 2, 3, -1, 0, -2};
        twoSum(a, 0);
        threeSum(a, 0);
        print(4);
    }

    /**
     * 水仙花数 水仙花数是指一个 n 位正整数 ( n≥3 )，
     * 它的每个位上的数字的 n 次幂之和等于它本身。（例如：1^3 + 5^3+ 3^3 = 153）
     */

    public static void print(int n) {
        int start = (int) Math.pow(10, n - 1);
        int end = (int) Math.pow(10, n) - 1;
        for (int i = start; i < end; i++) {
            String s = Integer.toString(i);
            int sum = 0;
            for (int j = 0; j < s.length(); j++) {
                sum += Math.pow(Integer.parseInt(s.charAt(j) + ""), n);
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
