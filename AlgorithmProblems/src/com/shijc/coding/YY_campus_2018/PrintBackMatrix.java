package com.shijc.coding.YY_campus_2018;

import java.util.Scanner;

/**
 * 欢聚时代2018校招笔试题-Android B卷 打印回形数
 * 回形数是一个矩阵输出，从矩阵的左上角往右开始打印数字0，遇到矩阵边界时，顺时针90方向
 * 继续打印，并数字增长1，如此类推直到把矩阵填满，输入一个整形宽和高单位，每输出一个数
 * 字，占用1单位宽高空间，根据入参打印出对应的回形数
 * 输入描述:
 * 矩阵的宽高
 * 输出描述:
 * 回字形的矩阵
 * 输入例子1:
 * 8 3
 * 输出例子1:
 * 00000000
 * 34444441
 * 22222221
 */
public class PrintBackMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt();
        int row = sc.nextInt();
        printMatrix(col, row);
    }


    public static void printMatrix(int columns, int rows) {
        int[][] matrix = new int[rows][columns];
        int start = 0;
        while (columns > start * 2 && rows > start * 2) {
            printMatrixInCircle(matrix, columns, rows, start);
            start++;
        }

        int m = matrix.length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void printMatrixInCircle(int[][] matrix, int columns, int rows,
                                           int start) {
        int endX = columns - 1 - start;
        int endY = rows - 1 - start;

        int num = 0;

        //第一步：从左到右打印一行
        for (int i = start; i <= endX; i++) {
            matrix[start][i] = start * 4 + num;
        }

        num++;
        //第二步：从上到下打印一列
        if (start < endY) {
            for (int i = start + 1; i <= endY; i++) {
                matrix[i][endX] = start * 4 + num;
            }
        }
        num++;
        //第三步：从右到左打印一行
        if (start < endX && start < endY) {
            for (int i = endX - 1; i >= start; i--) {
                matrix[endY][i] = start * 4 + num;
            }
        }
        num++;
        //第四步：从下到上打印一列
        if (start < endX && start < endY - 1) {
            for (int i = endY - 1; i >= start + 1; i--) {
                matrix[i][start] = start * 4 + num;
            }
        }
        num = 0;
    }
}


