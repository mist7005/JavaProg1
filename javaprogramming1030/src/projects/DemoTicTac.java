package projects;

import java.util.Scanner;

public class DemoTicTac {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=3;
		char board[][]=new char[n][n];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j]='-';
			}
		}
		System.out.println("enter player1 name: ");
		String p1=sc.nextLine();
		System.out.println("enter player2 name: ");
		String p2=sc.nextLine();
		boolean player1=true;
		boolean gameEnded=false;
		while(!gameEnded)
		{
			drawBoard(board);
			if(player1)
				System.out.println(p1+"'s turn (x)");
			else
				System.out.println(p2+"'s turn (o)");

			char c='-';
			if(player1)
				c='x';
			else
				c='o';
			int row=0;
			int col=0;


			while(true)
			{
				System.out.println("enter row");
				row=sc.nextInt();
				System.out.println("enter col");
				col=sc.nextInt();
				if(row<0 || col<0 || row>=n || col>2)
				{
					System.out.println("This position is off the bounds of the board! Try again.");
				}
				else if(board[row][col]!='-')
				{
					System.out.println("Someone has already made a move at this position! Try again.");
				}
				else
				{
					break;
				}
			}
			board[row][col]=c;
			if(playerHasWon(board)=='x') {
				System.out.println(p1+"has won");
				gameEnded=true;
			}
			else if(playerHasWon(board)=='o') {
				System.out.println(p2+"has won");
				gameEnded=true;
			}
			else 
			{
				if(boardFull(board))
				{
					System.out.println("tie");
					gameEnded=true;
				}
				else
				{
					player1=!player1;
				}
			}
		}
		drawBoard(board);

	}
	public static boolean boardFull(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if(board[i][j]=='-')
				{
					return false;
				}
			}
		}
		return true;
	}
	public static char playerHasWon(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			boolean inArow=true;
			char value=board[i][0];
			if(value=='-')
			{
				inArow=false;
			}
			else {
				for (int j = 1; j < board[i].length; j++) {
					if(board[i][j]!=value)
					{
						inArow=false;
						break;
					}
				}
			}
			if(inArow==true)
				return value;
		}
		for (int j = 0; j < board[0].length; j++) {
			boolean inACol=true;
			char value=board[0][j];
			if(value=='-')
			{
				inACol=false;
			}
			else
			{
				for (int i = 1; i < board.length; i++) {
					if(board[i][j]!=value)
					{
						inACol=false;
						break;
					}

				}
			}
			if(inACol)
				return value;
		}

		boolean inADiag1=true;
		char value1=board[0][0];
		if(value1=='-')
		{
			inADiag1=false;
		}
		else {
			for (int i = 1; i < board.length; i++) {
				if(board[i][i]!=value1)
				{
					inADiag1=false;
					break;
				}
			}
		}
		if(inADiag1)
		{
			return value1;
		}

		boolean inADiag2=true;
		char value2=board[0][board.length-1];
		if(value2=='-')
		{
			inADiag2=false;
		}
		else
		{
			for (int i = 0; i < board.length; i++) {
				if(board[i][board.length-1-i]!=value2)
				{
					inADiag2=false;
					break;
				}
			}
		}
		if(inADiag2)
			return value2;



		return ' ';
	}
	 
	public static void drawBoard(char board[][])
	{
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
}
