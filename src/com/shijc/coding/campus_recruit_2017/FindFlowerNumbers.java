package com.shijc.coding.campus_recruit_2017;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 题目描述
 * 春天是鲜花的季节，水仙花就是其中最迷人的代表，数学上有个水仙花数，
 * 他是这样定义的： “水仙花数”是指一个三位数，它的各位数字的立方和等于其本身，
 * 比如：153=1^3+5^3+3^3。
 * 现在要求输出所有在m和n范围内的水仙花数。
 * 输入描述:
 * 输入数据有多组，每组占一行，包括两个整数m和n（100 ≤ m ≤ n ≤ 999）。
 * 输出描述:
 * 对于每个测试实例，要求输出所有在给定范围内的水仙花数，就是说，
 * 输出的水仙花数必须大于等于m,并且小于等于n，
 * 如果有多个，则要求从小到大排列在一行内输出，之间用一个空格隔开;
 * 如果给定的范围内不存在水仙花数，则输出no;
 * 每个测试实例的输出占一行。
 * 示例1
 * 输入
 * <p>
 * 100 120
 * 300 380
 * 输出
 * <p>
 * no
 * 370 371
 * Created by shijiacheng on 2017/12/23.
 */
public class FindFlowerNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int m = sc.nextInt();
            int n = sc.nextInt();

            List<Integer> mList = new ArrayList<>();
            for (int i = m; i <= n; i++) {
                if (isFlowerNumber(i)){
                    mList.add(i);
                }
            }

            if (mList.size() == 0){
                System.out.println("no");
            }else {
                for (int i = 0; i < mList.size(); i++) {
                    if (i<mList.size()-1){
                        System.out.print(mList.get(i)+" ");
                    }else {
                        System.out.print(mList.get(i));
                    }
                }
            }
        }
    }

    public static boolean isFlowerNumber(int number){
        int sum = 0;
        int temp = number;
        while (temp>0){
            sum += Math.pow(temp%10,3);
            temp = temp/10;
        }
        if (sum == number){
            return true;
        }else {
            return false;
        }
    }
}
