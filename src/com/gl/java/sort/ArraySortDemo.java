package com.gl.java.sort;

import java.util.Arrays;

public class ArraySortDemo {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 5, 4};

        for (int num : nums) {
            System.out.print("" + num + " ");
        }

        // 按从小到大排序
        Arrays.sort(nums);

        for (int num : nums) {
            System.out.print("" + num + " ");
        }

        char[] chars = {'z', 'y', 'x', 'w', 'v','u','a','b'};
        // index [1, 4] 区间排序
        Arrays.sort(chars, 1, 3);

        for (char c : chars) {
            System.out.print("" + c + "\n");
        }
    }
}
