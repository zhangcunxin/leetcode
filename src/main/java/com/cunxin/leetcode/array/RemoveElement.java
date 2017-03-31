package com.cunxin.leetcode.array;


import java.util.Arrays;

/**
 * Given an array and a value, remove all instances of that > value in place and return the new length.
 * <p>
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * 在一个数组里面移除指定value，并且返回新的数组长度。这题唯一需要注意的地方在于in place，不能新建另一个数组
 */
public class RemoveElement {

    public static int removeElement(int[] array, int ele) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ele) {
                continue;
            }
            array[j] = array[i];
            j++;
        }
        return j;
    }


    /**
     * 给你一个整数n. 从 1 到 n 按照下面的规则打印每个数：
     * <p>
     * 如果这个数被3整除，打印fizz.
     * 如果这个数被5整除，打印buzz.
     * 如果这个数能同时被3和5整除，打印fizz buzz.
     *
     * @param n
     */
    public static void judge(int n) {
        String[] array = new String[n - 1];
        for (int i = 1; i < n; i++) {
            if (i % 15 == 0) {
                array[i - 1] = "fizz buzz";
            } else if (i % 3 == 0) {
                array[i - 1] = "fizz";
            } else if (i % 5 == 0) {
                array[i - 1] = "buzz";
            } else {
                array[i - 1] = Integer.toString(i);
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 2, 3, 2, 4};
        System.out.println(removeElement(a, 2));
        judge(15);
    }
}
