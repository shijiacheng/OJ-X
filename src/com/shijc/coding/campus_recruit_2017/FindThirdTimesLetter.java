package com.shijc.coding.campus_recruit_2017;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 题目描述
 * 给定一个英文字符串,请写一段代码找出这个字符串中首先出现三次的那个英文字符。
 * 输入描述:
 * 输入数据一个字符串，包括字母,数字等。
 * 输出描述:
 * 输出首先出现三次的那个英文字符
 * 示例1
 * 输入
 * Have you ever gone shopping and
 * 输出
 * e
 *
 * @author shijiacheng
 */
public class FindThirdTimesLetter {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] letters = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < letters.length; i++) {
            if ((letters[i]>='a'&&letters[i]<='z') || (letters[i]>='A'&&letters[i]<='Z')){
                if (map.containsKey(letters[i])){
                    int count = map.get(letters[i]);
                    count++;
                    map.put(letters[i],count);
                    if (count == 3){
                        System.out.println(letters[i]);
                        break;
                    }
                }else {
                    map.put(letters[i],1);
                }
            }
        }
    }
}
