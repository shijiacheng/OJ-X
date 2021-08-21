package com.shijc.coding.campus_recruit_2017;

import java.util.Scanner;

/**
 * 题目描述
 * 有 n 个学生站成一排，每个学生有一个能力值，牛牛想从这 n 个学生中按照顺序选取 k 名学生，
 * 要求相邻两个学生的位置编号的差不超过 d，使得这 k 个学生的能力值的乘积最大，你能返回最大的乘积吗？
 * 输入描述:
 * 每个输入包含 1 个测试用例。
 * 每个测试数据的第一行包含一个整数 n (1 <= n <= 50)，表示学生的个数，
 * 接下来的一行，包含 n 个整数，按顺序表示每个学生的能力值 ai（-50 <= ai <= 50）。
 * 接下来的一行包含两个整数，k 和 d (1 <= k <= 10, 1 <= d <= 50)。
 * 输出描述:
 * 输出一行表示最大的乘积。
 * 示例1
 * 输入
 * 3
 * 7 4 7
 * 2 50
 * 输出
 * 49
 *
 * @author shijiacheng
 */
public class ChoirSolution {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n+1];
        for (int i = 1; i <= n; i++) {
            array[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int d = sc.nextInt();

        long[][] dxMax = new long[k+1][n+1];
        //dxMax[k][i]表示已第i个学生结尾的k个学生产生的最大能力值
        long[][] dxMin = new long[k+1][n+1];

        long product = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {

            dxMax[1][i] = array[i];
            dxMin[1][i] = array[i];

            for (int a = 2; a <= k; a++) {
                for (int b = i-1; b >0&&Math.abs(i-b)<=d ; b--) {
                    dxMax[a][i] = Math.max(dxMax[a][i],Math.max(dxMax[a-1][b] * array[i], dxMin[a-1][b] * array[i]));
                    dxMin[a][i] = Math.min(dxMin[a][i],Math.max(dxMax[a-1][b] * array[i], dxMin[a-1][b] * array[i]));
                }
            }

            product = Math.max(product,dxMax[k][i]);
        }

        System.out.println(product);
    }
}
