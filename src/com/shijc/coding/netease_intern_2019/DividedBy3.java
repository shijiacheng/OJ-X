package com.shijc.coding.netease_intern_2019;

import java.util.Scanner;

/**
 * 2.被3整除
 * 小Q得到一个神奇的数列: 1, 12, 123,...12345678910,1234567891011...。
 * 并且小Q对于能否被3整除这个性质很感兴趣。
 * 小Q现在希望你能帮他计算一下从数列的第l个到第r个(包含端点)有多少个数可以被3整除。
 * 输入描述:
 * 输入包括两个整数l和r(1 <= l <= r <= 1e9), 表示要求解的区间两端。
 * 输出描述:
 * 输出一个整数, 表示区间内能被3整除的数字个数。
 * 输入例子1:
 * 2 5
 * 输出例子1:
 * 3
 *
 * @author shijiacheng
 * @date 2018/04/05
 */
public class DividedBy3 {
    /**
     * 思路
     * 序号： 1   2    3     4      5       6        7
     * 数列： 1  12  123  1234  12345  123456  1234567
     * 和    1   3    6    10     15      21       28
     * 模3   1   0    0     1      0       0        1
     *
     * 我们可以发现，序号为3n+1的位置（n>=0）的位置不能被3整除，其余都可以
     */
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int l  = sc.nextInt();
        int r = sc.nextInt();
        int result = 0;
        for (int i = l; i <= r; i++) {
            if (i%3!=1){
                result++;
            }
        }
        System.out.println(result);
    }
}
