package com.shijc.coding.campus_recruit_2017;

import java.util.Scanner;

/**
 * 题目描述
 * 有一个X*Y的网格，小团要在此网格上从左上角到右下角，只能走格点且只能向右或向下走。
 * 请设计一个算法，计算小团有多少种走法。
 * 给定两个正整数int x,int y，请返回小团的走法数目。
 * 输入描述:
 * 输入包括一行，逗号隔开的两个正整数x和y，取值范围[1,10]。
 * 输出描述:
 * 输出包括一行，为走法的数目。
 * 示例1
 * 输入
 * 3 2
 * 输出
 * 10
 *
 *
 * @author shijiacheng
 */
public class GetGridSteps {
    public static void main(String[] args) {

        int m;
        int n;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();

        int[][] f = new int[11][11];

        f[0][0] = 0;

        for (int i = 1; i < 11; i++) {
            f[i][0] = 1;
        }

        for (int j = 1; j < 11; j++) {
            f[0][j] = 1;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                f[i][j] = f[i-1][j] + f[i][j-1];
            }
        }

        System.out.println(f[m][n]);
    }
}
