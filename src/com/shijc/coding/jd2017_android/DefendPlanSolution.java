package com.shijc.coding.jd2017_android;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 京东2017校招Android主观题-保卫方案
 * 战争游戏的至关重要环节就要到来了，这次的结果将决定王国的生死存亡，小B负责首都的防卫工作。
 * 首都位于一个四面环山的盆地中，周围的n个小山构成一个环，作为预警措施，小B计划在每个小山上设置一个观察哨，
 * 日夜不停的瞭望周围发生的情况。 一旦发生外地入侵事件，山顶上的岗哨将点燃烽烟，若两个岗哨所在的山峰之间
 * 没有更高的山峰遮挡且两者之间有相连通路，则岗哨可以观察到另一个山峰上的烽烟是否点燃。由于小山处于环上，
 * 任意两个小山之间存在两个不同的连接通路。满足上述不遮挡的条件下，一座山峰上岗哨点燃的烽烟至少可以通过一
 * 条通路被另一端观察到。对于任意相邻的岗哨，一端的岗哨一定可以发现一端点燃的烽烟。 小B设计的这种保卫方案
 * 的一个重要特性是能够观测到对方烽烟的岗哨对的数量，她希望你能够帮她解决这个问题。
 * 输入描述:
 * 输入中有多组测试数据，每一组测试数据的第一行为一个整数n(3<=n<=10^6),为首都周围的小山数量，
 * 第二行为n个整数，依次表示为小山的高度h（1<=h<=10^9）.
 * 输出描述:
 * 对每组测试数据，在单独的一行中输出能相互观察到的岗哨的对数。
 * 输入例子1:
 * 5
 * 1 2 4 5 3
 * 输出例子1:
 * 7
 *
 * @author shijiacheng
 */
public class DefendPlanSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n * 2];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            a[i + n] = a[i];
        }
        int maxIndex = 0, secondIndex = 0;
        for (int i = 1; i < n; i++) {
            if (a[maxIndex] < a[i]) maxIndex = i;
        }
        if (maxIndex == 0) secondIndex = 1;
        for (int i = 1; i < n; i++) {
            if (i == maxIndex) continue;
            if (a[secondIndex] < a[i]) secondIndex = i;
        }
        int start = maxIndex > secondIndex ? secondIndex : maxIndex;
        int mid = maxIndex > secondIndex ? maxIndex : secondIndex;
        int end = start + n;
        System.out.println(getCount(a, start, mid) + getCount(a, mid, end) + 1);
    }

    public static long getCount(int a[], int start, int end) {
        if (end - start == 1) return 0;
        List<Integer> list = getMaxIndexExceptStartAndEnd(a, start, end);
        long c = (int) list.size();
        int f = list.get(0);
        int l = list.get(list.size() - 1);
        long r1 = getCount(a, start, f) + c;
        long r2 = getCount(a, l, end) + c;
        long sum1 = c * (c - 1) / 2;
        for (int i = 1; i < list.size(); i++) {
            sum1 += getCount(a, list.get(i - 1), list.get(i));
        }
        return r1 + r2 + sum1;
    }

    public static List<Integer> getMaxIndexExceptStartAndEnd(int[] a, int start, int end) {
        List<Integer> list = new ArrayList<Integer>();
        int max = start + 1;
        list.add(max);
        for (int i = start + 2; i < end; i++) {
            if (a[max] < a[i]) {
                list.clear();
                list.add(i);
                max = i;
            } else if (a[max] == a[i]) {
                list.add(i);
            }
        }
        return list;
    }
}
