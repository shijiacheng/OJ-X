package com.shijc.coding;

import java.util.Scanner;

/**
 * 网易2018校园招聘编程题-游历魔法王国
 * 魔法王国一共有n个城市,编号为0~n-1号,n个城市之间的道路连接起来恰好构成一棵树。
 * 小易现在在0号城市,每次行动小易会从当前所在的城市走到与其相邻的一个城市,小易最多能行动L次。
 * 如果小易到达过某个城市就视为小易游历过这个城市了,小易现在要制定好的旅游计划使他能游历最多的城市,
 * 请你帮他计算一下他最多能游历过多少个城市(注意0号城市已经游历了,游历过的城市不重复计算)。
 * 输入描述:
 * 输入包括两行,第一行包括两个正整数n(2 ≤ n ≤ 50)和L(1 ≤ L ≤ 100),表示城市个数和小易能行动的次数。
 * 第二行包括n-1个整数parent[i](0 ≤ parent[i] ≤ i), 对于每个合法的i(0 ≤ i ≤ n - 2),
 * 在(i+1)号城市和parent[i]间有一条道路连接。
 * 输出描述:
 * 输出一个整数,表示小易最多能游历的城市数量。
 * 输入例子1:
 * 5 2
 * 0 1 2 3
 * 输出例子1:
 * 3
 *
 * @author shijiacheng
 */
public class MagicCountrySolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int L = sc.nextInt();
        int[] array = new int[n];
        for (int i = 1; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int maxLen = 0;
        int[] depth = new int[100];
        for (int i = 1; i < n; i++) {
            depth[i] = depth[array[i]] + 1;
            if (depth[i] > maxLen) {
                maxLen = depth[i];
            }
        }
        int count = 0;
        if (maxLen > L) {
            count = L;
        } else {
            count = (L - maxLen) / 2 + maxLen;
        }
        System.out.println(count + 1);

    }
}
