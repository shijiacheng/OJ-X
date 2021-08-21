package com.shijc.coding;

import java.util.Scanner;

/**
 * 网易2018校园招聘编程题-射击游戏
 * 小易正在玩一款新出的射击游戏,这个射击游戏在一个二维平面进行,小易在坐标原点(0,0),
 * 平面上有n只怪物,每个怪物有所在的坐标(x[i], y[i])。小易进行一次射击会把x轴和y轴上
 * (包含坐标原点)的怪物一次性消灭。
 * 小易是这个游戏的VIP玩家,他拥有两项特权操作:
 * 1、让平面内的所有怪物同时向任意同一方向移动任意同一距离
 * 2、让平面内的所有怪物同时对于小易(0,0)旋转任意同一角度
 * 小易要进行一次射击。小易在进行射击前,可以使用这两项特权操作任意次。
 * 小易想知道在他射击的时候最多可以同时消灭多少只怪物,请你帮帮小易。
 * 如样例所示:
 * 所有点对于坐标原点(0,0)顺时针或者逆时针旋转45°,可以让所有点都在坐标轴上,所以5个怪物都可以消灭。
 * 输入描述:
 * 输入包括三行。
 * 第一行中有一个正整数n(1 ≤ n ≤ 50),表示平面内的怪物数量。
 * 第二行包括n个整数x[i](-1,000,000 ≤ x[i] ≤ 1,000,000),表示每只怪物所在坐标的横坐标,以空格分割。
 * 第二行包括n个整数y[i](-1,000,000 ≤ y[i] ≤ 1,000,000),表示每只怪物所在坐标的纵坐标,以空格分割。
 * 输出描述:
 * 输出一个整数表示小易最多能消灭多少只怪物。
 * 输入例子1:
 * 5
 * 0 -1 1 1 -1
 * 0 -1 -1 1 1
 * 输出例子1:
 * 5
 *
 * @author shijiacheng
 */
public class ShootingGameSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x[] = new int[n];
        int y[] = new int[n];
        for (int i = 0; i < n; i++)
            x[i] = scan.nextInt();
        for (int i = 0; i < n; i++)
            y[i] = scan.nextInt();
        scan.close();
        int maxShoot = 0;//åœ¨åæ ‡è½´ä¸Šçš„ç‚¹
        if (n < 4)
            maxShoot = n;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int X1 = x[j] - x[i];
                int Y1 = y[j] - y[i];
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j)
                        continue;
                    int count = 3;
                    for (int l = 0; l < n; l++) {
                        if (l == i || l == j || l == k)
                            continue;
                        int X2 = x[l] - x[k];
                        int Y2 = y[l] - y[k];
                        int X3 = x[l] - x[i];
                        int Y3 = y[l] - y[i];
                        if (X1 * X2 + Y1 * Y2 == 0 || X1 * Y3 == X3 * Y1)
                            count++;
                    }
                    if (count > maxShoot)
                        maxShoot = count;
                }
            }
        }
        System.out.println(maxShoot);
    }

}
