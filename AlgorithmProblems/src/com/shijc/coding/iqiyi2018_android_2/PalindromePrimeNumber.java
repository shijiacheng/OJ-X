package com.shijc.coding.iqiyi2018_android_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 回文素数
 * 如果一个整数只能被1和自己整除,就称这个数是素数。
 * 如果一个数正着反着都是一样,就称为这个数是回文数。例如:6, 66, 606, 6666
 * 如果一个数字既是素数也是回文数,就称这个数是回文素数
 * 牛牛现在给定一个区间[L, R],希望你能求出在这个区间内有多少个回文素数。
 * 输入描述:
 * 输入包括一行,一行中有两个整数(1 ≤ L ≤ R ≤ 1000)
 * 输出描述:
 * 输出一个整数,表示区间内回文素数个数。
 * 输入例子1:
 * 100 150
 * 输出例子1:
 * 2
 *
 * @author shijiacheng
 */
public class PalindromePrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        List<Integer> primeNums = new ArrayList<>();
        // 找出所有素数
        for (int i = L; i <= R; i++) {
            boolean temp = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    temp = true;
                }
            }
            if (i == 1){
                temp = true;
            }
            if (!temp) {
                primeNums.add(i);
            }
        }

        int count = 0;
        for (int i = 0; i < primeNums.size(); i++) {
            if (isPalindrome(primeNums.get(i))) {
                count++;
            }
        }
        System.out.println(count);
    }

    /**
     * 是否是回文数
     *
     * @param num
     * @return
     */
    public static boolean isPalindrome(int num) {
        if (num < 10) {
            return true;
        }
        int temp = num;
        StringBuilder sb = new StringBuilder();
        while (temp > 0) {
            sb.append(temp % 10);
            temp = temp / 10;
        }

        if (Integer.parseInt(sb.toString()) == num) {
            return true;
        }
        return false;
    }

}
