package com.company.Workshop;

public class TicTac {

    private static char[] element;
    private static char player;
    static char[] gameBoard = new char[10];

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game");
        Board();

    }

    public static void Board() {
        System.out.println(gameBoard[0] + " | " + gameBoard[1] + " | " + gameBoard[2]);
        System.out.println(gameBoard[3] + " | " + gameBoard[4] + " | " + gameBoard[5]);
        System.out.println(gameBoard[6] + " | " + gameBoard[7] + " | " + gameBoard[8]);
    }
}
