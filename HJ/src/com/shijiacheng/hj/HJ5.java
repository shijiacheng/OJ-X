package com.shijiacheng.hj;

import java.util.Scanner;

/**
 * HJ5 进制转换
 * 描述
 * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。
 * <p>
 * 输入描述：
 * 输入一个十六进制的数值字符串。注意：一个用例会同时有多组输入数据，请参考帖子https://www.nowcoder.com/discuss/276处理多组输入的问题。
 * <p>
 * 输出描述：
 * 输出该数值的十进制字符串。不同组的测试用例用\n隔开。
 * <p>
 * 示例1
 * 输入：
 * 0xA
 * 0xAA
 * 输出：
 * 10
 * 170
 */
public class HJ5 {
    public static void main(String[] args) {
        char[] numbers = new char[16];
        for (int i = 0; i < 10; i++) {
            numbers[i] = (char) ('0' + i);
        }
        for (int i = 10; i < 16; i++) {
            numbers[i] = (char) ('A' + (i - 10));
        }
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String text = scanner.nextLine();
            int number = Integer.valueOf(text.substring(2), 16);

            StringBuilder sb = new StringBuilder();
            while (number != 0) {
                sb.append(numbers[number % 10]);
                number /= 10;
            }

            System.out.println(sb.reverse());
        }
    }
}
