package projects;

import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome to Rock, Paper, Scissor");
		int win=0;
		int lose=0;
		while(true)
		{
		System.out.println("What is your move? To make a move, enter '1' for rock, '2' for paper, or '3' for scissors");
		System.out.println("To quit the game, enter '4' to quit");
		System.out.println("1:rock or 2:paper or 3:scissor or 4:quit");
		int op=sc.nextInt();
		String myMove="";
		if(op==4)
		{
			System.out.println("thanks for playing");
			System.out.println("win "+win+"    "+"lose "+lose);
			break;
		}
		switch (op) {
		case 1:
		{	
			myMove="rock";
			break;
		}
		case 2:
		{
			myMove="paper";
			break;
		}
		case 3:
		{
			myMove="scissor";
			break;
		}
		default:
			System.out.println("not valid");
			break;
		}
		double x = Math.random()*3;
		int r=(int)x;
		String oponentMove = "";
		switch (r) {
		case 0:
		{
			oponentMove="rock";
			break;
		}
		case 1:
		{
			oponentMove="paper";	
			break;
		}
		case 2:
		{
			oponentMove="scissor";
		}
			
		}
		System.out.println("your move "+myMove);
		System.out.println("opponent move "+oponentMove);
		if(myMove.equals(oponentMove))
		{
			System.out.println("draw");
			System.out.println("win "+win+"    "+"lose "+lose);
		}
		else if((myMove.equals("rock")&& oponentMove.equals("scissor") || (myMove.equals("paper") && oponentMove.equals("rock")) || (myMove.equals("scissor") && oponentMove.equals("paper"))))
		{
			
			System.out.println("you win");
			win++;
			System.out.println("win "+win+"    "+"lose "+lose);
		}
		else
		{
			
			System.out.println("you lose");
			lose++;
			System.out.println("win "+win+"    "+"lose "+lose);
		}
		System.out.println("---------------------------------------------------------------");
	}
	}

}
