package com.shijc.coding;

import java.util.Scanner;

/**
 * 美丽联合2018校招应用平台开发工程师笔试
 * 计算一年中的第几天
 * 今年的第几天？
 * 输入年、月、日，计算该天是本年的第几天。
 * 输入描述:
 * 包括三个整数年(1<=Y<=3000)、月(1<=M<=12)、日(1<=D<=31)。
 * 输出描述:
 * 输入可能有多组测试数据，对于每一组测试数据，
 * 输出一个整数，代表Input中的年、月、日对应本年的第几天。
 * 输入例子1:
 * 1990 9 20
 * 2000 5 1
 * 输出例子1:
 * 263
 * 122
 *
 * @author shijiacheng
 * @date 2018/2/21
 */
public class DayOfYeafSolution {
    public static void main(String[] args){
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int Y = sc.nextInt();
            int M = sc.nextInt();
            int D = sc.nextInt();

            if (isLeapYear(Y)){
                days[1] = days[1]+1;
            }

            int day = 0;
            for (int i = 1; i < M; i++) {
                day+=days[i-1];
            }
            day +=D;
            System.out.println(day);
        }
    }

    /**
     * 判断是否是闰年
     * @param year
     * @return
     */
    public static boolean isLeapYear(int year){
        if (year%4==0&&year%100!=0){
            return true;
        }else if (year%400==0){
            return true;
        }
        return false;
    }
}
