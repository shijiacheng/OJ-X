package com.shijc.coding.campus_recruit_2017;

import java.util.Scanner;

/**
 * 买苹果
 * 题目描述
 * 小易去附近的商店买苹果，奸诈的商贩使用了捆绑交易，只提供6个每袋和8个每袋的包装(包装不可拆分)。
 * 可是小易现在只想购买恰好n个苹果，小易想购买尽量少的袋数方便携带。如果不能购买恰好n个苹果，小易将不会购买。
 * 输入描述:
 * 输入一个整数n，表示小易想购买n(1 ≤ n ≤ 100)个苹果
 * 输出描述:
 * 输出一个整数表示最少需要购买的袋数，如果不能买恰好n个苹果则输出-1
 * 示例1
 * 输入
 * 20
 * 输出
 * 3
 *
 * @author shijiacheng
 */
public class BuyApples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 != 0 || n < 6 || n == 10) {
            System.out.println(-1);
        } else if (n % 8 == 0) {
            System.out.println(n / 8);
        } else {
            System.out.println(n / 8 + 1);
        }
    }

}
