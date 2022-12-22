package com.example;

import java.util.*;

class Guesser
{
	int guessNum;
	static int low=0;
	static int high=100;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser, kindly guess the number within range of "+low+" to "+high);
		guessNum=scan.nextInt();
		while(guessNum <low || guessNum>high) {
			System.out.println("Please enter a number within the range!");
			guessNum=scan.nextInt();	
		}
		return guessNum;
	}	
}

class Player
{
	int guessNum;
	static int low=0;
	static int high=100;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player kindly guess the number within range of "+low+" to "+high);
		guessNum=scan.nextInt();
		while(guessNum <low || guessNum>high) {
			System.out.println("Please enter a number within the range!");
			guessNum=scan.nextInt();	
		}
		return guessNum;
	}
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	void collectNumFromPlayers()
	{	
		//System.out.println("How many players are involved");
		
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.guessNum();
		numFromPlayer2=p2.guessNum();
		numFromPlayer3=p3.guessNum();
	}
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("All players won the game");
			}
			else if(numFromGuesser==numFromPlayer2 )
			{
				System.out.println("Player 1 & Player 2 won");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 & Player 3 won");
			}
			else
			{
			System.out.println("Player 1 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 2 & Player 3 won");
			}
			else
			{
			System.out.println("Player 2 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game lost Try Again!");
		}
		
		
	}
	
}


public class LaunchGame {

	public static void main(String[] args) {
			System.out.println("----- Guesser Game -----");
			boolean flag=true;
			while (flag) {
				Umpire u = new Umpire();
				u.collectNumFromGuesser();
				u.collectNumFromPlayers();
				u.compare();
				
				System.out.println("--------------------");
				Scanner sc = new Scanner(System.in);
				System.out.println("Want to play again?(Y/N)");
				String play = sc.next();
				if(play.strip().toLowerCase().equals("y")||play.strip().toLowerCase().equals("yes"))
					flag=true;
				else 
					flag=false;
			}
			
	}

}

