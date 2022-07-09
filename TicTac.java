package com.company.Workshop;
import java.util.Scanner;

public class TicTac {

    private static char[] element;
    private static char player;
    private static char computer;

    private static int flag=0;
    private static int moves=0;
    static char[] gameBoard = new char[10];



    private static int flag=0;

    static char[] gameBoard = new char[10];


    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game");
        Board();
        userinfo();

        toss();
        gamePlay();


        toss();

    }

    public static void Board() {
        System.out.println(gameBoard[0] + " | " + gameBoard[1] + " | " + gameBoard[2]);
        System.out.println(gameBoard[3] + " | " + gameBoard[4] + " | " + gameBoard[5]);
        System.out.println(gameBoard[6] + " | " + gameBoard[7] + " | " + gameBoard[8]);
    }

    public static void userinfo() {
        Scanner in = new Scanner(System.in);
        System.out.println(" Select Your Marker (O or X): ");
        player = in.next().charAt(0);
        if (player == 'x') {
            computer = 'o';
            System.out.println("User mark is :" + player);
        } else{
            computer='x';
            player='o';
            System.out.println("Computer mark is:"+computer);
        }
    }





    public  static void toss(){
        int result=(int)Math.floor(Math.random() * 10) % 2;
        if (result==1){
            flag=0;
            System.out.println("Player will play first");
        }
        else{
            flag=1;
            System.out.println("Computer will play first");
        }
    }


    public static void gamePlay(){
        while(moves < 9){
            Scanner sc=new Scanner(System.in);
            System.out.println("Please enter the position between 0-8");
            int position=sc.nextInt();
            if(element[position]=='+'){
                element[position]=player;
                Board();
                moves++;
                gamePlay();
            }
            else {
                System.out.println("Invalid move");
            }
        }
    }


}
