package com.shijiacheng.hj;

import java.util.Scanner;

/**
 * HJ13 句子逆序
 * 描述
 * 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
 * 所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 * <p>
 * 输入描述：
 * 输入一个英文语句，每个单词用空格隔开。保证输入只包含空格和字母。
 * <p>
 * 输出描述：
 * 得到逆序的句子
 * <p>
 * 示例1
 * 输入：
 * I am a boy
 * 输出：
 * boy a am I
 */
public class HJ13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] words = text.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = words.length - 1; i >= 0; i --){
            sb.append(words[i]);
            if (i != 0){
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}
