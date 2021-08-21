package com.shijc.coding.campus_recruit_2017;

import java.util.Arrays;
import java.util.Scanner;

/**
 * n个数里最小的k个
 * 题目描述：
 * 找出n个数里最小的k个
 * 输入描述:
 * 每个测试输入包含空格分割的n+1个整数，最后一个整数为k值,n
 * 不超过100。
 * 输出描述:
 * 输出n个整数里最小的k个数。升序输出
 * 示例1
 * 输入
 * 3 9 6 8 -10 7 -11 19 30 12 23 5
 * 输出
 * -11 -10 3 6 7
 *
 * @author shijiacheng
 */
public class FindSmallestNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] strs = input.split(" ");
        int[] array = new int[strs.length - 1];
        int k = Integer.parseInt(strs[strs.length - 1]);

        for (int i = 0; i < strs.length - 1; i++) {
            array[i] = Integer.parseInt(strs[i]);
        }
        Arrays.sort(array);

        if (k <= array.length && k >= 1)
            for (int i = 0; i < k - 1; i++) {
                System.out.print(array[i] + " ");
            }
        System.out.println(array[k - 1]);
    }
}
