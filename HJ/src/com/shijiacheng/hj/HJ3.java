package com.shijiacheng.hj;

import java.util.Scanner;

/**
 * HJ3 明明的随机数
 * 描述
 * 明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数（N≤1000），对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。然后再把这些数从小到大排序，按照排好的顺序去找同学做调查。请你协助明明完成“去重”与“排序”的工作(同一个测试用例里可能会有多组数据(用于不同的调查)，希望大家能正确处理)。
 * <p>
 * <p>
 * 注：测试用例保证输入参数的正确性，答题者无需验证。测试用例不止一组。
 * <p>
 * 当没有新的输入时，说明输入结束。
 * <p>
 * 输入描述：
 * 注意：输入可能有多组数据(用于不同的调查)。每组数据都包括多行，第一行先输入随机整数的个数N，接下来的N行再输入相应个数的整数。具体格式请看下面的"示例"。
 * <p>
 * 输出描述：
 * 返回多行，处理后的结果
 * <p>
 * 示例1
 * 输入：
 * 3
 * 2
 * 2
 * 1
 * 11
 * 10
 * 20
 * 40
 * 32
 * 67
 * 40
 * 20
 * 89
 * 300
 * 400
 * 15
 * 复制
 * 输出：
 * 1
 * 2
 * 10
 * 15
 * 20
 * 32
 * 40
 * 67
 * 89
 * 300
 * 400
 * 说明：
 * 输入解释：
 * 第一个数字是3，也即这个小样例的N=3，说明用计算机生成了3个1到1000之间的随机整数，接下来每行一个随机数字，共3行，也即这3个随机数字为：
 * 2
 * 1
 * 1
 * 所以第一个小样例的输出为：
 * 1
 * 2
 * 第二个小样例的第一个数字为11，也即...(类似上面的解释)...
 * 所以第二个小样例的输出为：
 * 10
 * 15
 * 20
 * 32
 * 40
 * 67
 * 89
 * 300
 * 400
 * 所以示例1包含了两个小样例！！
 */
public class HJ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] numbers = new int[1000];
            while (n-- > 0) {
                int num = scanner.nextInt();
                numbers[num - 1] = num;
            }
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > 0) {
                    System.out.println(numbers[i]);
                }
            }
        }
    }
}
