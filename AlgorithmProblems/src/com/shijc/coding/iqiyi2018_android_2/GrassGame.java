package com.shijc.coding.iqiyi2018_android_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 青草游戏
 * 牛牛和羊羊都很喜欢青草。今天他们决定玩青草游戏。
 * 最初有一个装有n份青草的箱子,牛牛和羊羊依次进行,牛牛先开始。在每个回合中,每个玩家必须吃一些箱子中的青草,
 * 所吃的青草份数必须是4的x次幂,比如1,4,16,64等等。不能在箱子中吃到有效份数青草的玩家落败。假定牛牛和羊
 * 羊都是按照最佳方法进行游戏,请输出胜利者的名字。
 * 输入描述:
 * 输入包括t+1行。
 * 第一行包括一个整数t(1 ≤ t ≤ 100),表示情况数.
 * 接下来t行每行一个n(1 ≤ n ≤ 10^9),表示青草份数
 * 输出描述:
 * 对于每一个n,如果牛牛胜利输出"niu",如果羊羊胜利输出"yang"。
 * 输入例子1:
 * 3
 * 1
 * 2
 * 3
 * 输出例子1:
 * niu
 * yang
 * niu
 *
 * @author shijiacheng
 */
public class GrassGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < t; i++) {
            switch (list.get(i) % 5) {
                case 0:
                case 2:
                    System.out.println("yang");
                    break;
                case 1:
                case 3:
                case 4:
                    System.out.println("niu");
                    break;
            }
        }

    }
}
