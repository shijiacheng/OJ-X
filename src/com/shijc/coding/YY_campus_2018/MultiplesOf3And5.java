package com.shijc.coding.YY_campus_2018;

import java.util.Scanner;

/**
 * 欢聚时代2018校招笔试题-Android B卷 输出3和5的倍数的和
 * 如果我们列出10以内所有3或5的倍数，我们将得到3、5、6和9，这些数的和是23。
 * 求n以内所有3或5的倍数的和。
 * 输入描述:
 * 输入n，n不超过2000
 * 输出描述:
 * 输出n以内3或5倍数的和
 * 输入例子1:
 * 10
 * 输出例子1:
 * 23
 */
public class MultiplesOf3And5 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = getSum(n,3)+getSum(n,5)-getSum(n,15);
        System.out.println(sum);

    }

    /**
     * @param n 输入的n
     * @param a a的倍数
     */
    public static int getSum(int n,int a){
        if (a>=n){
            return 0;
        }
        int sum = (a + ((n-1)/a)*a)*((n-1)/a)/2;
        return sum;
    }
}
