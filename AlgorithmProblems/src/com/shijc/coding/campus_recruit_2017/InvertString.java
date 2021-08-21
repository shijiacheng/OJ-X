package com.shijc.coding.campus_recruit_2017;

import java.util.Scanner;

/**
 * 题目描述
 * 将一句话的单词进行倒置，标点不倒置。比如 I like beijing. 经过函数后变为：beijing. like I
 * 输入描述:
 * 每个测试输入包含1个测试用例： I like beijing. 输入用例长度不超过100
 * 输出描述:
 * 依次输出倒置之后的字符串,以空格分割
 * 示例1
 * 输入
 * I like beijing.
 * 输出
 * beijing. like I
 *
 * @author shijiacheng
 */
public class InvertString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String str[] = input.split(" ");

        for (int i = 0; i < str.length-1; i++) {
            System.out.print(str[str.length-1-i] +" ");
        }
        System.out.print(str[0]);
    }
}
