package com.shijc.coding;

import java.util.Scanner;

/**
 * 数独是一个非常有名的游戏。整个是一个9X9的大宫格，其中又被划分成9个3X3的小宫格。
 * 要求在每个小格中放入1-9中的某个数字。要求是：每行、每列、每个小宫格中数字不能重复。
 * 现要求用计算机求解数独。
 *
 * @author shijiacheng
 */
public class SudokuSolution {

    private int[][] sudoku;
    public SudokuSolution(int[][] sudoku){
        this.sudoku = sudoku;
    }

    public static void main(String[] args){
        // 号称世界上最难数独
        int[][] suduku = new int[9][9];
        /*int[][] suduku = {
                {8, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 3, 6, 0, 0, 0, 0, 0},
                {0, 7, 0, 0, 9, 0, 2, 0, 0},
                {0, 5, 0, 0, 0, 7, 0, 0, 0},
                {0, 0, 0, 0, 4, 5, 7, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 3, 0},
                {0, 0, 1, 0, 0, 0, 0, 6, 8},
                {0, 0, 8, 5, 0, 0, 0, 1, 0},
                {0, 9, 0, 0, 0, 0, 4, 0, 0}};*/
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                suduku[i][j] = sc.nextInt();
            }
        }
        sc.close();

        SudokuSolution solution = new SudokuSolution(suduku);
        solution.findNumber(0,0);

    }

    private void findNumber(int i, int j){
        if (i == 8 && j==9){
            //success find
            printResult();
            return;
        }

        if (j == 9){
            i++;
            j = 0;
        }

        if (sudoku[i][j] == 0){
            for (int k = 1; k <=9 ; k++) {
                if (canUse(i,j,k)){
                    sudoku[i][j] = k;
                    findNumber(i,j+1);
                }else {
                    sudoku[i][j] = 0;
                }
            }

        }else {
            findNumber(i,j+1);
        }
    }


    private boolean canUse(int row,int line,int number){
        for (int i = 0; i < 9; i++) {
            if (sudoku[row][i] == number || sudoku[i][line] == number){
                return false;
            }
        }

        //判断小九宫格是否有重复
        int eachRow = row / 3;
        int eachLine = line / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (sudoku[eachRow * 3 + i][eachLine * 3 + j] == number) {
                    return false;
                }
            }
        }

        return true;
    }

    private void printResult(){

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (j<8){
                    System.out.print(sudoku[i][j] + " ");
                }else {
                    System.out.print(sudoku[i][j]);
                }

            }
            System.out.println();
        }
        System.out.println();
    }
}
