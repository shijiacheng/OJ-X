package com.shijc.coding.campus_recruit_2017;

import java.util.Scanner;

/**
 * 题目描述
 * 输入一个正整数n,求n!(即阶乘)末尾有多少个0？ 比如: n = 10; n! = 3628800,所以答案为2
 * 输入描述:
 * 输入为一行，n(1 ≤ n ≤ 1000)
 * 输出描述:
 * 输出一个整数,即题目所求
 * 示例1
 * 输入
 * 10
 * 输出
 * 2
 *
 * @author shijiacheng
 */
public class EndZeroCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n>0){
            count+=n/5;
            n/=5;
        }
        System.out.println(count);
    }

}
