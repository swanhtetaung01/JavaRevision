package org.javarevision.multidimensionalArrays;

import java.util.Scanner;

public class MultiDimensionalUseCases {
    /*public static void main(String[] args) {
        int[][] pixelGrid = new int[10][10];

// Let's initialize it with some values
        for (int i = 0; i < pixelGrid.length; i++) {
            for (int j = 0; j < pixelGrid[i].length; j++) {
                pixelGrid[i][j] = (i + j) * 10; // just some value
            }
        }

// Now let's print it
        for (int i = 0; i < pixelGrid.length; i++) {
            for (int j = 0; j < pixelGrid[i].length; j++) {
                System.out.print(pixelGrid[i][j] + " ");
            }
            System.out.println();
        }

    }*/

     // TICTACTOE EXAMPLE
    private static final char[][] board = new char[3][3];
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeBoard();
        printBoard();
        playGame();
        scanner.close();
    }

    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    private static void printBoard() {
        System.out.println("Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    private static void playGame() {
        char currentPlayer = 'X';
        boolean gameEnded = false;
        while (!gameEnded) {
            System.out.println("Player " + currentPlayer + "'s turn (enter row and column): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (row < 0 || col < 0 || row >= 3 || col >= 3 || board[row][col] != '-') {
                System.out.println("This move is not valid. Try again.");
            } else {
                board[row][col] = currentPlayer;
                printBoard();
                gameEnded = checkWinner(currentPlayer);

                if (!gameEnded) {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            }
        }
        System.out.println("Player " + currentPlayer + " wins!");
    }

    private static boolean checkWinner(char player) {
        for (int i = 0; i < 3; i++) {
            // Check rows
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
            // Check columns
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }
        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        // Check for a tie
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        System.out.println("It's a tie!");
        return true;
    }
}
