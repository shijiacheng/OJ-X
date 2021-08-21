package com.shijiacheng.hj;

import java.util.Scanner;

public class HJ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text1 = scanner.nextLine().toUpperCase();
        String text2 = scanner.nextLine().toUpperCase();

        char[] words = text1.toCharArray();
        char letter = text2.charAt(0);
        int count = 0;
        for(int i = 0; i< words.length; i++){
            if (words[i] == letter){
                count ++;
            }
        }
        System.out.println(count);
    }
}
