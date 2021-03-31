package SankeLadder;

import java.util.Random;

public class Test 
{
	private static int player1Position=0,player2Position=0,endPiont=100;
	private static int move1,move2;
	private static int tossPlayer1,tossPlayer2;

	public static void main(String[] args)
	{	System.out.println("\t--------------------------------------------------------------");
		System.out.println("\t\t\t\tSanke Ladder Game\n\t--------------------------------------------------------" ); 		
		System.out.println("\n\nPlayer1 Position = "+player1Position+"\tPlayer2 Position = "+player2Position+"\n");
		Random r=new Random();
		while(endPiont>=player1Position||endPiont>=player1Position)
		{			  // TOSS
			tossPlayer1=r.nextInt(2);// 0 = BackWard 		1 = Forward
			move1=r.nextInt(6)+1;
			tossPlayer2=r.nextInt(2);
			move2=r.nextInt(6)+1;
			player1();
			player2();			
		}
	}
	private static void player1()
	{	
		player1Movement();
		if(player1Position==endPiont)
		{	System.out.println("\t\t\t|----------------------------|");
			System.out.println("\t\t\t|\tWINNER is Player1    |");
			System.out.println("\t\t\t|----------------------------|");
			System.exit(0);
		}
	}
	private static void player2()
	{
		player2Movement();		
		if(player2Position==endPiont)
		{
			System.out.println("\t\t\t|----------------------------|");
			System.out.println("\t\t\t|\tWINNER is Player2    |");
			System.out.println("\t\t\t|----------------------------|");
			System.exit(0);
		}
	}
	private static void player1Movement()
	{
		int temp=player1Position;
		if(tossPlayer1==1)
		{
			System.out.println( "			Player 1 Forword");
			player1Position=player1Position+move1;			
			if (player1Position>endPiont)
				{
				player1Position=temp;
				System.out.println("Player 1 Position = "+player1Position);
				}
			else
				System.out.println("Player 1 Position = "+player1Position);	
		}
		else
		{
			player1Position=player1Position-move1;
			System.out.println( "			Player 1 Backward");
			if(player1Position<0)
			{
				player1Position=temp;
				System.out.println("Player 1 Position = "+player1Position);
			}
			else
				System.out.println("Player 1 Position = "+player1Position);
		}
	}
	private static void player2Movement()
	{
		int temp=player2Position;
		if (tossPlayer2==1)
		{			
			System.out.println( "			Player 2 Forword");
			player2Position=player2Position+move2;				
			if(player2Position>endPiont)
				{
				player2Position=temp;
				System.out.println("Player 2 Position = "+player2Position);
				}	
			else				
				System.out.println("Player 2 Position = "+player2Position);
		}
		else
		{
			System.out.println( "			Player 2 Backward");
			player2Position=player2Position-move2;
			if (player2Position<0)
			{
				player2Position=temp;
				System.out.println("Player 2 Position = "+player2Position);
			}
			else
			System.out.println("Player 2 Position = "+player2Position);
		}
	}
} //		END
