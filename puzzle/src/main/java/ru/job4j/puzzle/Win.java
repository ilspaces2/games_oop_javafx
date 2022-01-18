package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rzl = false;
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 1 && checkHorizontal(board, index)
                    || checkVertical(board, index)) {
                rzl = true;
                break;
            }
        }
        return rzl;
    }

    public static boolean checkHorizontal(int[][] board, int row) {
        boolean rzl = true;
        for (int index = 0; index < board.length; index++) {
            if (board[row][index] == 0) {
                rzl = false;
                break;
            }
        }
        return rzl;
    }

    public static boolean checkVertical(int[][] board, int column) {
        boolean rzl = true;
        for (int index = 0; index < board.length; index++) {
            if (board[index][column] == 0) {
                rzl = false;
                break;
            }
        }
        return rzl;
    }
}