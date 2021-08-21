package com.shijiacheng.hj;

import java.util.Scanner;

public class HJ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        char[] chars = text.toCharArray();
        int lastWordLength = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' '){
                lastWordLength = 0;
            } else {
                lastWordLength ++;
            }
        }
        System.out.println(lastWordLength);

    }
}
