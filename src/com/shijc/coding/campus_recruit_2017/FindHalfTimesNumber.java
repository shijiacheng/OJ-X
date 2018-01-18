package com.shijc.coding.campus_recruit_2017;

import java.util.Scanner;

/**
 * n个数里出现次数大于等于n/2的数
 * 题目描述
 * 输入n个整数，输出出现次数大于等于数组长度一半的数。
 * 输入描述:
 * 每个测试输入包含 n个空格分割的n个整数，n不超过100，其中有一个整数出现次数大于等于n/2。
 * 输出描述:
 * 输出出现次数大于等于n/2的数。
 * 示例1
 * 输入
 * 3 9 3 2 5 6 7 3 2 3 3 3
 * 输出
 * 3
 * @author shijiacheng
 */
public class FindHalfTimesNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String str[] = input.split(" ");
        int[] array = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            array[i] = Integer.parseInt(str[i]);
        }

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {

                if (array[i] == array[j]) {
                    count++;
                }
            }

            if (array.length % 2 == 0) {
                if (count >= array.length / 2) {
                    System.out.println(array[i]);
                    break;
                }
            } else {
                if (count > array.length / 2) {
                    System.out.println(array[i]);
                    break;
                }
            }

        }
    }
}
