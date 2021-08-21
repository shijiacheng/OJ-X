package com.shijc.coding.campus_recruit_2018;

import java.util.Scanner;

/**
 * 拼多多-最大乘积
 * 题目描述
 * 给定一个无序数组，包含正数、负数和0，要求从中找出3个数的乘积，使得乘积最大，
 * 要求时间复杂度：O(n)，空间复杂度：O(1)
 * 输入描述:
 * 无序整数数组A[n]
 * 输出描述:
 * 满足条件的最大乘积
 * 示例1
 * 输入
 * 复制
 * 3 4 1 2
 * 输出
 * 复制
 * 24
 */
public class MaxProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        // 最大、第二大、第三大
        long max1 = Integer.MIN_VALUE,max2 = Integer.MIN_VALUE,max3 = Integer.MIN_VALUE;
        // 最小、倒数第二小
        long min1 = Integer.MAX_VALUE,min2 = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i]>max1){
                max3 = max2;
                max2 = max1;
                max1 = array[i];
            }else if (array[i]>max2){
                max3 = max2;
                max2 = array[i];
            }else if (array[i]>max3){
                max3 = array[i];
            }

            if (array[i] < min1 && array[i]<0){
                min2 = min1;
                min1 = array[i];

            }else if (array[i] < min2 && array[i]<0 ){
                min2 = array[i];
            }
        }


        if (min1*min2*max1 > max1*max2*max3){
            System.out.println(min1*min2*max1);
        }else {
            System.out.println(max1*max2*max3);
        }
    }
}
