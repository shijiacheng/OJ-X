package com.shijc.coding.iqiyi2018_android_1;

import java.util.Scanner;

/**
 * 拼凑三角形
 * 牛牛手中有三根木棍,长度分别是a,b,c。牛牛可以把任一一根木棍长度削短,牛牛的目标是让这三根木棍构成一个三角形,并且牛牛还希望这个三角形的周长越大越好。
 * 输入描述:
 * 输入包括一行,一行中有正整数a, b, c(1 ≤ a, b, c ≤ 100), 以空格分割
 * 输出描述:
 * 输出一个整数,表示能拼凑出的周长最大的三角形。
 * 输入例子1:
 * 1 2 3
 * 输出例子1:
 * 5
 *
 * @author shijiacheng
 */
public class PatchworkTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int aCopy = a;
        int bCopy = b;
        int cCopy = c;

        int sum = 0;
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            sum = a + b + c;
        } else {
            while (aCopy > 0) {
                if ((aCopy + b > c) && (aCopy + c > b) && (b + c > aCopy)) {
                    if (aCopy + b + c > sum) {
                        sum = aCopy + b + c;
                    }
                    break;
                } else {
                    aCopy--;
                }
            }
            while (bCopy > 0) {
                if ((a + bCopy > c) && (a + c > bCopy) && (bCopy + c > a)) {

                    if (a + bCopy + c > sum) {
                        sum = a + bCopy + c;
                    }
                    break;
                } else {
                    bCopy--;
                }
            }

            while(cCopy>0){
                if((a+b>cCopy) && (a+cCopy>b) && (b+cCopy>a) ){
                    if(a+b+cCopy>sum){
                        sum = a+b+cCopy;
                    }
                    break;

                }else{
                    cCopy--;
                }
            }
        }

        System.out.println(sum);
    }
}
