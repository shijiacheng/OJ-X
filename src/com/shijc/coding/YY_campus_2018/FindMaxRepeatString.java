package com.shijc.coding.YY_campus_2018;

import java.util.Scanner;

/**
 * 请从字符串中找出至少重复一次的子字符串的最大长度
 * 输入描述:
 * 字符串，长度不超过1000
 * 输出描述:
 * 重复子串的长度，不存在输出0
 * 输入例子1:
 * ababcdabcefsgg
 * 输出例子1:
 * 3
 */
public class FindMaxRepeatString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = findLongestRepeatStr(sc.nextLine());
        System.out.println(count + "");
    }


    public static int findLongestRepeatStr(String str) {
        int len = str.length();

        int array[][] = new int[len + 1][len + 1];
        for (int m = 0; m < len; m++) {

            for (int n = 0; n < len; n++) {
                if (str.charAt(m) == str.charAt(n))
                    array[m + 1][n + 1] = array[m][n] + 1;

            }

        }

        int max = 0;
        for (int m = 0; m < len + 1; m++) {

            for (int n = 0; n < len + 1; n++) {
                if ((m != n) && (array[m][n] > max))
                    max = array[m][n];
            }

        }

        return max;

    }
}



