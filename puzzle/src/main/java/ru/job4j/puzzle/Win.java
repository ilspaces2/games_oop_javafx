package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        return checkHorizontal(board) || checkVertical(board);
    }

    public static boolean checkHorizontal(int[][] board) {
        boolean rzl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1) {
                rzl = true;
                for (int row = 0; row < board.length; row++) {
                    if (board[row][i] == 0) {
                        rzl = false;
                        break;
                    }
                }
            }
        }
        return rzl;
    }

    public static boolean checkVertical(int[][] board) {
        boolean rzl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1) {
                rzl = true;
                for (int cell = 0; cell < board.length; cell++) {
                    if (board[i][cell] == 0) {
                        rzl = false;
                        break;
                    }
                }
            }
        }
        return rzl;
    }
}