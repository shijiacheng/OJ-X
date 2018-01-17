package com.shijc.coding;

import java.util.Scanner;

/**
 * 网易2018校园招聘编程题-重排数列
 * 小易有一个长度为N的正整数数列A = {A[1], A[2], A[3]..., A[N]}。
 * 牛博士给小易出了一个难题:
 * 对数列A进行重新排列,使数列A满足所有的A[i] * A[i + 1](1 ≤ i ≤ N - 1)都是4的倍数。
 * 小易现在需要判断一个数列是否可以重排之后满足牛博士的要求。
 * 输入描述:
 * 输入的第一行为数列的个数t(1 ≤ t ≤ 10),
 * 接下来每两行描述一个数列A,第一行为数列长度n(1 ≤ n ≤ 10^5)
 * 第二行为n个正整数A[i](1 ≤ A[i] ≤ 10^9)
 * 输出描述:
 * 对于每个数列输出一行表示是否可以满足牛博士要求,如果可以输出Yes,否则输出No。
 * 输入例子1:
 * 2
 * 3
 * 1 10 100
 * 4
 * 1 2 3 4
 * 输出例子1:
 * Yes
 * No
 *
 * @author shijiacheng
 */
public class RearrangeSequenceSolution {
    /**
     * 可以正确输出的情况是如下的情况：
     * 1.有2
     * 奇数最多和4的倍数相等
     * 2.无2
     * 奇数最多比4的倍数多1个
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//数列的个数
        while (t > 0) {
            int n = sc.nextInt();
            int[] A = new int[n];
            int times2 = 0;
            int times4 = 0;
            int timesOdd = 0;//奇数的个数
            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
                if (A[i] % 4 == 0) {
                    times4++;
                } else if (A[i] % 2 == 0) {
                    times2++;
                } else {
                    timesOdd++;
                }
            }

            if (times2 > 0) {
                if (times4 >= timesOdd) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                if (times4 >= timesOdd - 1) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }

            t--;
        }
    }
}
