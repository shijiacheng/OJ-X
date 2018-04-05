package com.shijc.coding.netease_intern_2019;

import java.util.Scanner;

/**
 * 6.矩形重叠
 * 时间限制：1秒
 * 空间限制：32768K
 * 平面内有n个矩形, 第i个矩形的左下角坐标为(x1[i], y1[i]), 右上角坐标为(x2[i], y2[i])。
 * 如果两个或者多个矩形有公共区域则认为它们是相互重叠的(不考虑边界和角落)。
 * 请你计算出平面内重叠矩形数量最多的地方,有多少个矩形相互重叠。
 * 输入描述:
 * 输入包括五行。
 * 第一行包括一个整数n(2 <= n <= 50), 表示矩形的个数。
 * 第二行包括n个整数x1[i](-10^9 <= x1[i] <= 10^9),表示左下角的横坐标。
 * 第三行包括n个整数y1[i](-10^9 <= y1[i] <= 10^9),表示左下角的纵坐标。
 * 第四行包括n个整数x2[i](-10^9 <= x2[i] <= 10^9),表示右上角的横坐标。
 * 第五行包括n个整数y2[i](-10^9 <= y2[i] <= 10^9),表示右上角的纵坐标。
 * 输出描述:
 * 输出一个正整数, 表示最多的地方有多少个矩形相互重叠,如果矩形都不互相重叠,输出1。
 * 输入例子1:
 * 2
 * 0 90
 * 0 90
 * 100 200
 * 100 200
 * 输出例子1:
 * 2
 *
 * @author shijiacheng
 * @date 2018/04/05
 */
public class RectanglesOverlap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] X = new int[n*2];
        int[] Y = new int[n*2];
        int[] X1 = new int[n];
        int[] Y1 = new int[n];
        int[] X2 = new int[n];
        int[] Y2 = new int[n];


        for (int i = 0; i < n; i++) {
            X[i] = sc.nextInt();
            X1[i] = X[i];
        }

        for (int i = 0; i < n; i++) {
            Y[i] = sc.nextInt();
            Y1[i] = Y[i];
        }

        for (int i = 0; i < n; i++) {
            X[i+n] = sc.nextInt();
            X2[i] = X[i+n];
        }

        for (int i = 0; i < n; i++) {
            Y[i+n] = sc.nextInt();
            Y2[i] = Y[i+n];
        }

        int result = 1;

        for (int i = 0; i < n*2; i++) {
            for (int j = 0; j < n*2; j++) {
                int count = 0;
                for (int k = 0; k < n; k++) {
                    if (X[i]>X1[k] && Y[j] > Y1[k] && X[i]<=X2[k] && Y[j] <= Y2[k]){
                        count++;
                    }
                }

                result = Math.max(result,count);
            }
        }

        System.out.println(result);
    }
}
