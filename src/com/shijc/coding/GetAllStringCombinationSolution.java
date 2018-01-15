package com.shijc.coding;

import java.util.*;

/**
 * 输入一个字符串，输出该字符串中相邻字符的所有组合。
 * 举个例子，如果输入abc，它的组合有a、b、c、ab、bc、abc。（注意：输出的组合需要去重）
 *
 * @author shijiacheng
 */
public class GetAllStringCombinationSolution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        List<String> result = getSubStr(str);

        if (result != null) {
            MyComparator com = new MyComparator();
            Collections.sort(result, com);
            for (int i = 0;i< result.size();i++) {
//                System.out.println(s);
                if (i<result.size()-1){
                    System.out.print(result.get(i) + " ");
                }else {
                    System.out.println(result.get(i));
                }

            }
        }

    }


    public static List<String> getSubStr(String str) {
        if (str == null || "".equals(str)) {
            return null;
        }
        List<String> result = new ArrayList<>();
        int length = str.length();
        //2的length次方
        int count = 1 << length;
        for (int i = 1; i < count; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < length; j++) {
                if ((i >> j & 1) == 0x1) {
                    sb.append(str.charAt(j));
                }
            }
            result.add(sb.toString());
        }
        return result;
    }

}

/*
* 定义一个用来比较字符串的比较器
*/
class MyComparator implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {
/*
* 字符多的大
*/
        return o1.length() - o2.length();
    }
}
