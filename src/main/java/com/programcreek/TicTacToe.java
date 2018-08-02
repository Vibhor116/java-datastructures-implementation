package com.programcreek;

/**
 * Design a Tic-tac-toe game that is played between two players on a n x n grid.
 */
public class TicTacToe {

    public char board[][];
    public boolean done;

    public TicTacToe(int size) {
        this.board = new char[size][size];
    }

    public enum Player{
        PLAYER1,PLAYER2,DONE,TIE;
    }

    public Enum move(int row, int cols, Player player) {

        if (done) {
            return Player.DONE;
        }
        if (Player.PLAYER1==player) {
            board[row][cols] = 'X';
        } else {
            board[row][cols] = 'O';
        }
        int boardLength = board.length;

        int countX = 0;
        int countO = 0;

        // checking rows
        for (int i = 0; i < boardLength; i++) {
            if (board[row][i] == 'X') {
                countX++;
            } else if (board[row][i] == 'O') {
                countO++;
            }
        }
        if (countX == boardLength || countO == boardLength) {
            done = true;
            return player;
        }

        //checking columns
        countX = 0;
        countO = 0;
        for (int i = 0; i < boardLength; i++) {
            if (board[i][cols] == 'X') {
                countX++;
            } else if (board[i][cols] == 'O') {
                countO++;
            }
        }
        if (countX == boardLength || countO == boardLength) {
            done = true;
            return player;
        }

        // checking diagonals
        countX = 0;
        countO = 0;
        for (int i = 0; i < boardLength; i++) {
            if (board[i][i] == 'X') {
                countX++;
            } else if (board[i][i] == 'O') {
                countO++;
            }
        }
        if (countX == boardLength || countO == boardLength) {
            done = true;
            return player;
        }

        countX = 0;
        countO = 0;
        for (int i = 0; i < boardLength; i++) {
            if (board[i][boardLength-i-1] == 'X') {
                countX++;
            } else if (board[i][boardLength-i-1] == 'O') {
                countO++;
            }
        }
        if (countX == boardLength || countO == boardLength) {
            done = true;
            return player;
        }

        return Player.TIE;
    }

    public static void main(String[] args) {
        TicTacToe ticTacToe =new TicTacToe(3);
        System.out.println(ticTacToe.move(0,0,Player.PLAYER1));
        System.out.println(ticTacToe.move(1,0,Player.PLAYER2));
        System.out.println(ticTacToe.move(0,1,Player.PLAYER1));
        System.out.println(ticTacToe.move(2,1,Player.PLAYER1));
        System.out.println(ticTacToe.move(0,2,Player.PLAYER1));




    }
}
