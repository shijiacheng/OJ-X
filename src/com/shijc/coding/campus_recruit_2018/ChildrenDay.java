package com.shijc.coding.campus_recruit_2018;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 拼多多-六一儿童节
 * 六一儿童节，老师带了很多好吃的巧克力到幼儿园。每块巧克力j的重量为w[j]，
 * 对于每个小朋友i，当他分到的巧克力大小达到h[i] (即w[j]>=h[i])，他才会上去表演节目。
 * 老师的目标是将巧克力分发给孩子们，使得最多的小孩上台表演。
 * 可以保证每个w[i]> 0且不能将多块巧克力分给一个孩子或将一块分给多个孩子。
 * 输入描述:
 * 第一行：n，表示h数组元素个数
 *  第二行：n个h数组元素
 *  第三行：m，表示w数组元素个数
 *  第四行：m个w数组元素
 * 输出描述:
 * 上台表演学生人数
 * 示例1
 * 输入
 * 3
 *  2 2 3
 *  2
 *  3 1
 * 输出
 * 1
 */
public class ChildrenDay {

    /**
     * 对两个数组进行排序，使用了贪心的思想，
     * 如果巧克力的重量连孩子中期望的最小重量都不满足的话，其他的肯定也不满足。
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] w = new int[m];
        for (int i = 0; i < m; i++) {
            w[i] = scanner.nextInt();
        }

        Arrays.sort(h);
        Arrays.sort(w);

        int i = 0;
        int j = 0;
        int result = 0;
        while (i<n && j<m){

            if (w[j]<h[i]){
                j++;
            }else {
                result ++;
                i++;
                j++;
            }
        }

        System.out.println(result);
        
    }
}
