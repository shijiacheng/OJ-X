package com.shijc.coding.campus_recruit_2017;

import java.util.Scanner;

/**
 * 优雅的点
 * 题目描述
 * 小易有一个圆心在坐标原点的圆，小易知道圆的半径的平方。小易认为在圆上的点而且横纵坐标都是
 * 整数的点是优雅的，小易现在想寻找一个算法计算出优雅的点的个数，请你来帮帮他。
 * 例如：半径的平方如果为25
 * 优雅的点就有：(+/-3, +/-4), (+/-4, +/-3), (0, +/-5) (+/-5, 0)，一共12个点。
 * 输入描述:
 * 输入为一个整数，即为圆半径的平方,范围在32位int范围内。
 * 输出描述:
 * 输出为一个整数，即为优雅的点的个数
 * 示例1
 * 输入
 * 25
 * 输出
 * 12
 *
 * @author shijiacheng
 */
public class ElegantPoint {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        double r = Math.pow(n, 0.5);
        for (int i = 1; i <= (int) r; i++) {
            int H = n - i * i;

            double h = Math.pow(H, 0.5);
            int temp = (int) h;

            if (temp * temp == H) {
                count++;
            }
        }
        System.out.println(count * 4);
    }
}
