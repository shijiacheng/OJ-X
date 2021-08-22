package com.shijiacheng.hj;

import java.util.Scanner;

/**
 * HJ4 字符串分隔
 * 描述
 * •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 * <p>
 * 输入描述：
 * 连续输入字符串(输入多次,每个字符串长度小于100)
 * <p>
 * 输出描述：
 * 输出到长度为8的新字符串数组
 * <p>
 * 示例1
 * 输入：
 * abc
 * 123456789
 * 输出：
 * abc00000
 * 12345678
 * 90000000
 */
public class HJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String text = sc.nextLine();
            if (text.length() % 8 != 0)
                text += "00000000";

            while (text.length() >= 8) {
                System.out.println(text.substring(0, 8));
                text = text.substring(8);
            }
        }
    }
}
