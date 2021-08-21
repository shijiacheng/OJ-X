package com.shijc.coding.campus_recruit_2017;

import java.util.Scanner;

/**
 * 最大的奇约数
 * 题目描述
 * 小易是一个数论爱好者，并且对于一个数的奇数约数十分感兴趣。一天小易遇到这样一个问题：
 * 定义函数f(x)为x最大的奇数约数，x为正整数。 例如:f(44) = 11.
 * 现在给出一个N，需要求出 f(1) + f(2) + f(3).......f(N)
 * 例如： N = 7
 * f(1) + f(2) + f(3) + f(4) + f(5) + f(6) + f(7) = 1 + 1 + 3 + 1 + 5 + 3 + 7 = 21
 * 小易计算这个问题遇到了困难，需要你来设计一个算法帮助他。
 * 输入描述:
 * 输入一个整数N (1 ≤ N ≤ 1000000000)
 * 输出描述:
 * 输出一个整数，即为f(1) + f(2) + f(3).......f(N)
 * 示例1
 * 输入
 * 7
 * 输出
 * 21
 *
 * @author shijiacheng
 */
public class GetLargeOddDivider {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(sumOfMaxOdd(n));
    }

    public static long sumOfMaxOdd(long n) {
        if (n == 1) {
            return 1;
        }
        if (n % 2 == 0) {
            return sumOfMaxOdd(n / 2) + n * n / 4;
        } else {
            return sumOfMaxOdd(n - 1) + n;
        }
    }
}
