package com.shijc.coding;

import java.util.Scanner;

/**
 * 搜狐畅游2018游戏开发工程师（Java）非游戏基础题部分笔试
 * 数据分页,对于指定的页数和每页的元素个数，返回该页应该显示的数据。
 * 输入描述:
 * 第一行输入数据个数，第二行全部数据，第三行输入页数，第四行输入每页最大数据个数
 * 输出描述:
 * 输出该页应该显示的数据，超出范围请输出'超过分页范围'
 * 输入例子1:
 * 6
 * 1 2 3 4 5 6
 * 1
 * 2
 * 输出例子1:
 * 3
 * 4
 *
 * @author shijiacheng
 */
public class DataPageSolution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//数据个数n
        int[] array = new int[n];//全部数据 array
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int page = sc.nextInt();//输入的页数,从0开始
        int count = sc.nextInt();//每页的最大数据数

        int totalPage = n / count;
        if (n % count > 0){
            totalPage = totalPage+1;
        }
        if (totalPage-1<page){
            System.out.println("超过分页范围");
        }else if (totalPage-1 == page){
            for (int i = page*count; i < n; i++) {
                System.out.println(array[i]);
            }

        }else {
            for (int i = page*count; i < (page+1)*count; i++) {
                System.out.println(array[i]);
            }
        }
    }
}
