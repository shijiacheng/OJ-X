package com.shijiacheng.hj;

import java.util.Scanner;

/**
 * HJ6 质数因子
 * 描述
 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质因子（重复的也要列举）（如180的质因子为2 2 3 3 5 ）
 * <p>
 * 最后一个数后面也要有空格
 * <p>
 * 输入描述：
 * 输入一个long型整数
 * <p>
 * 输出描述：
 * 按照从小到大的顺序输出它的所有质数的因子，以空格隔开。最后一个数后面也要有空格。
 * <p>
 * 示例1
 * 输入：
 * 180
 * 输出：
 * 2 2 3 3 5
 */
public class HJ6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        long half = (long) (Math.sqrt(number) + 1); // 4
        int i = 2;
        while (/*number != 1 &&*/ i <= half) {
            if (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            } else {
                i++;
            }
        }
        if (i > half) {// 在2-->sqrt(n)中,无因数,输出自身
            System.out.print(number + " ");
        }
    }
}
