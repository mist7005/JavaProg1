package projects;

public class TicPrac {

	public static void main(String[] args) {
		int n=3;
		char [][] board=new char[n][n];
				board[0][0]='o';
				board[0][1]='x';
				board[0][2]='x';
				board[1][0]='-';
				board[1][1]='x';
				board[1][2]='o';
				board[2][0]='x';
				board[2][1]='o';
				board[2][2]='o';
		drawBoard(board);
//		System.out.println(checkRow(board));
//		System.out.println(checkCol(board));
//		System.out.println(checkdiag1(board));
//		System.out.println(checkdiag2(board));
		System.out.println(boardFull(board));
		
	}
	public static char checkRow(char board[][])
	{
		for (int i = 0; i < board.length; i++) {
			boolean isrow=true;
			char value=board[i][0];
			if(value=='-')
				isrow=false;
			else
			{
				for (int j = 1; j < board.length; j++) {
					if(board[i][j]!=value)
					{
						isrow=false;
						break;
					}
				}
			}
			if(isrow)
			{
				return value;
			}
		}
		return ' ';
	}
	
	public static char checkCol(char board[][])
	{
		for (int i = 0; i < board[0].length; i++) {
			boolean isCol=true;
			char value=board[0][i];
			if(value=='-')
			{
				isCol=false;
			}
			else
			{
				for (int j = 1; j < board.length; j++) {
					if(board[j][i]!=value)
					{
						isCol=false;
						break;
					}
				}
			}
			if(isCol)
				return value;
		}
		return ' ';
	}
	
	public static char checkdiag1(char board[][])
	{
		boolean isDiag=true;
		char value=board[0][0];
		for (int i = 1; i < board.length; i++) {
			if(board[i][i]!=value)
			{
				isDiag=false;
				break;
				
			}
		}
		if(isDiag)
		{
			return value;
		}
		return ' ';
	}
	
	public static char checkdiag2(char board[][])
	{
		boolean isdiag=true;
		char value=board[0][board.length-1];
		for (int i = 1; i < board.length; i++) {
			if(board[i][board.length-1-i]!=value)
			{
				isdiag=false;
				break;
			}
		}
		if(isdiag)
		{
			return value;
		}
		return ' ';
	}
	public static void drawBoard(char b[][])
	{
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static boolean boardFull(char board[][])
	{
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if(board[i][j]=='-')
					return false;
			}
		}
		return true;
	}

}
