package com.shijc.coding.jd_autumn_recruit_android_2018;

import java.util.Scanner;
import java.util.Stack;

/**
 * 京东2018秋招Android
 * 括号匹配方案
 * 合法的括号匹配序列被定义为:
 * 1. 空串""是合法的括号序列
 * 2. 如果"X"和"Y"是合法的序列,那么"XY"也是一个合法的括号序列
 * 3. 如果"X"是一个合法的序列,那么"(X)"也是一个合法的括号序列
 * 4. 每个合法的括号序列都可以由上面的规则生成
 * 例如"", "()", "()()()", "(()())", "(((())))"都是合法的。 东东现在有一个合法的括号序列s,
 * 一次移除操作分为两步:
 * 1. 移除序列s中第一个左括号
 * 2. 移除序列s中任意一个右括号.保证操作之后s还是一个合法的括号序列
 * 东东现在想知道使用上述的移除操作有多少种方案可以把序列s变为空
 * 如果两个方案中有一次移除操作移除的是不同的右括号就认为是不同的方案。
 * 例如: s = "()()()()()",输出1, 因为每次都只能选择被移除的左括号所相邻的右括号.
 * s = "(((())))",输出24, 第一次有4种情况, 第二次有3种情况, ... ,依次类推, 4 * 3 * 2 * 1 = 24
 * 输入描述:
 * 输入包括一行,一个合法的括号序列s,序列长度length(2 ≤ length ≤ 20).
 * 输出描述:
 * 输出一个整数,表示方案数
 * 输入例子1:
 * (((())))
 * 输出例子1:
 * 24
 *
 * 思路：遍历字符串，每次把左括号都压入栈，每次遇到右括号，先统计栈中有几个左括号，统计数与上次统计数相乘
 * 接着弹出栈中的一个左括号
 * 直到遍历结束，结果即为方案数
 */
public class BracketMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Stack<Character> stack = new Stack<>();
        int result = 1;
        char c;

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == '(') {
                stack.push(c);

            }
            if (c == ')') {
                int size = stack.size();
                result *= size;
                stack.pop();
            }
        }

        System.out.println(result);
    }
}
