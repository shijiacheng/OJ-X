package com.shijc.coding.iqiyi2018_android_3;

import java.util.Scanner;

/**
 * 缺失的括号
 * 一个完整的括号字符串定义规则如下:
 * 1、空字符串是完整的。
 * 2、如果s是完整的字符串，那么(s)也是完整的。
 * 3、如果s和t是完整的字符串，将它们连接起来形成的st也是完整的。
 * 例如，"(()())", ""和"(())()"是完整的括号字符串，"())(", "()(" 和 ")"是不完整的括号字符串。
 * 牛牛有一个括号字符串s,现在需要在其中任意位置尽量少地添加括号,将其转化为一个完整的括号字符串。
 * 请问牛牛至少需要添加多少个括号。
 * 输入描述:
 * 输入包括一行,一个括号序列s,序列长度length(1 ≤ length ≤ 50).
 * s中每个字符都是左括号或者右括号,即'('或者')'.
 * 输出描述:
 * 输出一个整数,表示最少需要添加的括号数
 * 输入例子1:
 * (()(()
 * 输出例子1:
 * 2
 *
 * @author shijiacheng
 * @date 2018/1/24
 */
public class LossBracket {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int result = 0;
        int num = 0;
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)=='('){
                num++;
            }else {
                if(num == 0){
                    result++;
                }else {
                    num--;
                }
            }
        }

        System.out.println(result+num);

    }
}
