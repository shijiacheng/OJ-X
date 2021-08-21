package com.shijiacheng.hj;

import java.util.Scanner;

/**
 * HJ7 取近似值
 * 描述
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 * <p>
 * 输入描述：
 * 输入一个正浮点数值
 * <p>
 * 输出描述：
 * 输出该数值的近似整数值
 * <p>
 * 示例1
 * 输入：
 * 5.5
 * 输出：
 * 6
 */
public class HJ7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i = 0; i < text.length(); i++){
            char number = text.charAt(i);
            if (number == '.'){
                char nextNumber = text.charAt(i + 1);
                if (nextNumber >= '5'){
                    carry = 1;
                }
                break;
            } else {
                sb.append(number);
            }
        }
        int result = Integer.parseInt(sb.toString()) + carry;
        System.out.println(result);

    }
}
