package com.shijc.coding.netease_intern_2019;

import java.util.Scanner;

/**
 * 4.迷路的牛牛
 * 时间限制：1秒
 * 空间限制：32768K
 * 牛牛去犇犇老师家补课，出门的时候面向北方，但是现在他迷路了。虽然他手里有一张地图，
 * 但是他需要知道自己面向哪个方向，请你帮帮他。
 * 输入描述:
 * 每个输入包含一个测试用例。
 * 每个测试用例的第一行包含一个正整数，表示转方向的次数N(N<=1000)。
 * 接下来的一行包含一个长度为N的字符串，由L和R组成，L表示向左转，R表示向右转。
 * 输出描述:
 * 输出牛牛最后面向的方向，N表示北，S表示南，E表示东，W表示西。
 * 输入例子1:
 * 3
 * LRR
 * 输出例子1:
 * E
 *
 * @author shijiacheng
 * @date 2018/04/04
 */
public class FindDirection {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        char[] chars = str.toCharArray();
        int result = 0;
        for (int i = 0; i < N; i++) {
            if (chars[i]=='L'){
                result--;
            }else if (chars[i]=='R'){
                result++;
            }
        }

        int direction = result %4;
        if (direction <0){
            direction = direction+4;
        }

        switch (direction){
            case 0:
                System.out.println("N");
                break;
            case 1:
                System.out.println("E");
                break;
            case 2:
                System.out.println("S");
                break;
            case 3:
                System.out.println("W");
                break;
        }
    }
}
