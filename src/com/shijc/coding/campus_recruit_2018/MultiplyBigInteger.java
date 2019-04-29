package com.shijc.coding.campus_recruit_2018;

import java.util.Scanner;

/**
 * 拼多多-大整数相乘
 * 有两个用字符串表示的非常大的大整数,算出他们的乘积，也是用字符串表示。
 * 不能用系统自带的大整数类型。
 * 输入描述:
 * 空格分隔的两个字符串，代表输入的两个大整数
 * 输出描述:
 * 输入的乘积，用字符串表示
 * 示例1
 * 输入
 * 72106547548473106236 982161082972751393
 * 输出
 * 70820244829634538040848656466105986748
 */
public class MultiplyBigInteger {

    /**
     * 模拟乘法的过程
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();

        int len1 = str1.length();
        int len2 = str2.length();

        int[] num = new int[len1+len2];
        for (int i = len1-1; i >=0 ; i--) {
            int x = str1.charAt(i) - '0';

            for (int j = len2-1; j >=0; j--) {

                int y = str2.charAt(j) - '0';
                num[i+j] += (num[i+j+1]+x*y)/10;
                num[i+j+1] = (num[i+j+1]+x*y)%10;
            }

        }

        String result = "";
        for (int i = 0; i < num.length; i++) {
            if (i == 0 && num[i] == 0){

            }else {
                result += num[i];
            }
        }
        System.out.println(result);

    }
}
