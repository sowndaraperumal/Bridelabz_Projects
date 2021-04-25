/**
 * 
 * Purpose :Design the TicTacToe game
 * 
 * @author sowndara perumal
 * @version 1.2
 * @Since  20-10-2018
 *
 ********************************************************************/
package com.functionalprogram;
/*
 *Here we using Scanner class properties 
 *also usingInputmismatchEception for check that number is valid or not
 * 
 */
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class TicTacTio {
	
	static String player1;//initialize the player 1
	static String turn; //initialize the turn ( this is your turn )
	static String board[];//initialize the board for design
	static String winner=null;//initialize the winner
	/**
	 * Printboard display the board to player
	 */
	
	static public void printBoard() {
		System.out.println("/---|---|---\\");
		System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("/---|---|---\\");

	}
	/**
	 * before start the game we want to clean the board
	 */
	static void populateEmptyBoard() {
		for (int a = 0; a < 9; a++) {
			board[a] = String.valueOf(a+1);
		}
}
	/**
	 * 
	 * @ its return who is winner
	 * its check's any one player reach his goal or not
	 * otherwise it return draw
	 */
	 


	static String check() {
		/*
		 * this loop iterate helps to sequence of winner possibility 
		 */
		for (int a = 0; a < 8; a++) {
			String line = null;
			/*switch used to check the possibility
			 * 
			 */
			switch (a) {
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
			/*
			 * this condition check's filled line match either xxx nor ooo
			 */
			if (line.equals("XXX")) {
				return "X";
			} else if (line.equals("OOO")) {
				return "O";
			}
		}
		
		
		
		
		
		return null;
	}
	public static void main(String[] args) {
		/*
		 * main method used for create  tic tac toe game
		 */
		Scanner s=new Scanner(System.in);
		board=new String[9];//initialize the size of the board
		
		System.out.println("start the game ");
		
		//ensure the board is empty
	 
		populateEmptyBoard(); 
		
		
		System.out.println("enter the name of the player1 name");
		player1=s.nextLine();
	//start the game 
		System.out.println("Welcome to 2 Player Tic Tac Toe.");
        System.out.println("--------------------------------");
   //
      printBoard();
		int number; //initialize number 
		turn="X";
		int count=0;
		/*
		 * this loop execute whether win any one
		 */
		while(winner==null) {
			/*
			 * try for check a valid number
			 */
			try{
				/*
				 * turn is which one it check
				 */
			    if(turn.equalsIgnoreCase("x")) {
			    	number=s.nextInt();// take a input for player one
			    }else {
			    	Random r=new Random();
			    	number=r.nextInt(10); // take input form randomly for computer
			    }
				if(!(number>0&&number<=9)) {
					System.out.println("invalid number");
					continue;
				}
				}catch(InputMismatchException e) {
					System.out.println("enter valid number");
					continue;
				}
			/*
			 * condition help to place index where to you or based on input 
			 */if(count<9)
			 {
			if(board[number-1].equals(String.valueOf(number)))
			{
				board[number-1]=turn;
				if(turn.equals("X")) {
					turn="O";
				}
				else {
					System.out.println(number);
					turn="X";
				}
				count++;
				printBoard();
				winner=check();
				 //count for count how anytime its run
		/*
		 * if its count go to greater than 9 
		 * match is draw
		 */
						
			}
			  else 
			  {
				System.out.println(number+"Slot already taken; re-enter slot number:");
				continue;
			  }   
			 }
			else {
				System.out.println("match draw");
			}
		}

	/*
	 * verify who is win
	 */
		if(winner.equals("X")) {
			System.out.println(player1+"  is win");
		}
		else {
			System.out.println("computer is win");
		}
		s.close();
	}
}
