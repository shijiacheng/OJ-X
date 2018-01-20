package com.shijc.coding.iqiyi2018_android_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 排序
 * 牛牛有一个长度为n的整数序列,牛牛想对这个序列进行重排为一个非严格升序序列。牛牛比较懒惰,他想移动尽量少的数就完成重排,请你帮他计算一下他最少需要移动多少个序列中的元素。(当一个元素不在它原来所在的位置,这个元素就是被移动了的)
 * 输入描述:
 * 输入包括两行,第一行一个整数n(1 ≤ n ≤ 50),即序列的长度
 * 第二行n个整数x[i](1 ≤ x[i] ≤ 100),即序列中的每个数
 * 输出描述:
 * 输出一个整数,即最少需要移动的元素个数
 * 输入例子1:
 * 3
 * 3 2 1
 * 输出例子1:
 * 2
 *
 * @author shijiacheng
 */
public class SortNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        List<Integer> listCopy = new ArrayList<>();
        listCopy.addAll(list);
        Collections.sort(listCopy);

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (list.get(i) != listCopy.get(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
