package com.shijc.coding.campus_recruit_2017;

import java.util.Scanner;

/**
 * 数字翻转
 * 题目描述
 * 对于一个整数X，定义操作rev(X)为将X按数位翻转过来，并且去除掉前导0。例如:
 * 如果 X = 123，则rev(X) = 321;
 * 如果 X = 100，则rev(X) = 1.
 * 现在给出整数x和y,要求rev(rev(x) + rev(y))为多少？
 * 输入描述:
 * 输入为一行，x、y(1 ≤ x、y ≤ 1000)，以空格隔开。
 * 输出描述:
 * 输出rev(rev(x) + rev(y))的值
 * 示例1
 * 输入
 * 123 100
 * 输出
 * 223
 *
 * @author shijiacheng
 */
public class InvertNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int temp = reverse(x) + reverse(y);
        System.out.println(reverse(temp));
    }

    public static int reverse(int number){
        StringBuilder sb = new StringBuilder();
        while (number>0){
            int temp = number % 10;
            sb.append(temp);
            number =number/10;
        }
        return Integer.parseInt(sb.toString());
    }
}
