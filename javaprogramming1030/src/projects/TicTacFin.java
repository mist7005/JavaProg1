package projects;

import java.util.Scanner;

public class TicTacFin {

	public static void drawBoard(char [][]board)
	{
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=3;
		char [][] board=new char[n][n];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				board[i][j]='-';
			}
		}
		System.out.println("enter player 1 name");
		String p1=sc.nextLine();
		System.out.println("enter player 2 name");
		String p2=sc.nextLine();
		boolean player1=true;
		boolean gameEnded=false;
		while(!gameEnded)
		{
			drawBoard(board);
			if(player1)
			{
				System.out.println(p1+"'s turn (x)");
			}
			else
			{
				System.out.println(p2+"'s turn (o)");
			}
			
			char c='-';
			if(player1)
			{
				c='x';
			}
			else
				c='o';
			int row=0;
			int col=0;
			
			while(true)
			{
				System.out.println("enter row no");
				row=sc.nextInt();
				System.out.println("enter col no");
				col=sc.nextInt(); 
				if(row<0 || col<0 || row>=n || row>=n)
					System.out.println("row or col out of bound");
				else if(board[row][col]!='-')
					System.out.println("position already taken");
				else
					break;
				
			}
			board[row][col]=c;
			
			if(playerwon(board)=='x')
			{
				System.out.println(p1+" won the game");
				gameEnded=true;
			}
			else if(playerwon(board)=='o')
			{
				System.out.println(p2+" won the game");
				gameEnded=true;
			}
			else if(boardFull(board))
			{
				System.out.println("game is draw");
				gameEnded=true;
			}
			else
			{
			player1=!player1;
			}
		}

	}
	private static boolean boardFull(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if(board[i][j]=='-')
					return false;
			}
		}
	return true;
	}
	private static char playerwon(char[][] board) {
		
		//check for row
		for (int i = 0; i < board.length; i++) {
			boolean inArow=true;
			char value=board[i][0];
			if (value=='-') {
				inArow=false;
			}
			else
			{
				for (int j = 1; j < board[0].length; j++) {
					if(board[i][j]!=value)
					{
						inArow=false;
						break;
					}
				}
			}
			if(inArow)
			{
				return value;
			}
		}
		
		//check for column
		for (int j = 0; j < board[0].length; j++) {
			boolean inAcol=true;
			char value=board[0][j];
			if(value=='-')
			{
				inAcol=false;
			}
			else
			{
				for (int i = 1; i < board.length; i++) {
					if(board[i][j]!=value)
					{
						inAcol=false;
						break;
					}
				}
			}
			if(inAcol)
			{
				return value;
			}
		}
		
		//check for diagonal1
		boolean inAdiag1=true;
		char value = board[0][0];
		if(value=='-')
		{
			inAdiag1=false;
		}
		else
		{
		for (int i = 1; i < board.length; i++) {
			if(board[i][i]!=value)
			{
				inAdiag1=false;
				break;
			}
		}
		if(inAdiag1)
		{
			return value;
		}
		}
		
		//check for diag2
		boolean inAdiag2=true;
		char value1=board[0][board[0].length-1];
		if(value1=='-')
		{
			inAdiag2=false;
		}
		else
		{
			for (int i = 1; i < board[0].length; i++) {
				if(board[i][board[i].length-1-i]!=value1)
				{
					inAdiag2=false;
					break;
				}
			}
		}
		if(inAdiag2)
		{
			return value1;
		}
		
		return ' ';
	}

}
