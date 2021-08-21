package com.shijc.coding.iqiyi2018_android_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 拼凑正方形
 * 牛牛有4根木棍,长度分别为a,b,c,d。羊羊家提供改变木棍长度的服务,如果牛牛支付一个硬币
 * 就可以让一根木棍的长度加一或者减一。牛牛需要用这四根木棍拼凑一个正方形出来,牛牛最少
 * 需要支付多少硬币才能让这四根木棍拼凑出正方形。
 * 输入描述:
 * 输入包括一行,四个整数a,b,c,d(1 ≤ a,b,c,d ≤ 10^6), 以空格分割
 * 输出描述:
 * 输出一个整数,表示牛牛最少需要支付的硬币
 * 输入例子1:
 * 4 1 5 4
 * 输出例子1:
 * 4
 *
 * @author shijiacheng
 * @date 2018/1/24
 */
public class PatchworkSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);

        List<Integer> results = new ArrayList<>();
        for (int i = list.get(0); i <= list.get(3) ; i++) {
            int count = 0;
            for (int j = 0; j < 4; j++) {
                if (list.get(j) >= i){
                    count += (list.get(j)-i);
                }else {
                    count += (i - list.get(j));
                }
            }
            results.add(count);
        }

        Collections.sort(results);
        System.out.println(results.get(0));
    }
}
