package com.shijc.coding.YY_campus_2018;

import java.util.Scanner;

/**
 * 请从字符串中提取以最后一个[img]开头、以最后一个[\img]结尾的字符串，
 * 未找到匹配的字符串返回"null"
 * 输入描述:
 * 可能包含[img][\img]的字符串
 * 输出描述:
 * 截取后的字符串
 * 输入例子1:
 * bbb[img]ccc[img]ddd[\img]eee[\img]
 * 输出例子1:
 * [img]ddd[\img]eee[\img]
 */
public class FindImgString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(findImageStr(str));

    }


    public static String findImageStr(String str) {
        if (str == null) {
            return "null";
        }
        int start = str.lastIndexOf("[img]");
        int end = str.lastIndexOf("[\\img]");

        if (start > -1 && end > -1 && start < end) {
            return str.substring(start, end+6);
        } else {
            return "null";
        }
    }
}
