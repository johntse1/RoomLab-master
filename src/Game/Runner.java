package Game;
import People.*;
import Rooms.*;
import java.util.Scanner;

public class Runner
{
	private static boolean gameOn = true;
	public static void main(String[] args)
	{
		Scanner name = new Scanner(System.in);
		System.out.println("The summoners rift has been overtaken by a series of rogue champions! Please help retake the rift by reaching the opposite end of the board!");
		System.out.println("Your job today is to see if you can make it to the enemy nexus(def not copyrighted), seeing if you can survive and perhaps unlock the secret trait!");
		System.out.println("What is your name summoner?");
		String Name = name.nextLine();
		Board summonersRift = new Board(9,9);
		summonersRift.makeEnemyRooms();
		summonersRift.printMap();
		//Setup player 1 and the input scanner
		Person summoner = new Person("FirstName", "FamilyName", 0,0, 100, 100, "none");
		summonersRift.enterRoom(summoner, 0,0);
		Scanner in = new Scanner(System.in);
		while(gameOn)
		{
			if(summoner.getAttack() <= 0)
			{
				System.out.println("The rift is only for the strongest. You are clearly not ready to save us.");
				System.exit(0);
			}
			if(summoner.getAttack() >= 500)
			{
				System.out.println("Dangit you're too overpowered and you scared everyone off! But I guess you won the game cause you have no one to fight!");
				System.exit(0);
			}
			if(summoner.getHealth() == 0)
			{
				gameOn = false;
			}
			summonersRift.printMap();
			System.out.println("Where wil you tread today summoner? (Choose W, A, S, D)");
			String move = in.nextLine();
			if(validMove(move, summoner, summonersRift.makeRift()))
			{
				System.out.println("Your coordinates " + Name +": row = " + summoner.getxLoc() + " col = " + summoner.getyLoc());
				System.out.println("Your health is " + summoner.getHealth() + " and your attack is " + summoner.getAttack());
			}
			else
			{
				System.out.println("Please choose a valid move.");
			}
		}
		in.close();
	}
	/**
	 * Checks that the movement chosen is within the valid game map.
	 * @param move the move chosen
	 * @param person person moving
	 * @param map the 2D array of rooms
	 * @return
	 */
	public static boolean validMove(String move, Person person, Room[][] map)
	{
		move = move.toLowerCase().trim();
		switch (move) {
			case "w":
				if (person.getxLoc() > 0)
				{
					map[person.getxLoc()][person.getyLoc()].leaveRoom(person);
					map[person.getxLoc()-1][person.getyLoc()].enterRoom(person);
					return true;
				}
				else
				{
					return false;
				}
			case "d":
				if (person.getyLoc()< map[person.getyLoc()].length -1)
				{
					map[person.getxLoc()][person.getyLoc()].leaveRoom(person);
					map[person.getxLoc()][person.getyLoc() + 1].enterRoom(person);
					return true;
				}
				else
				{
					return false;
				}

			case "s":
				if (person.getxLoc() < map.length - 1)
				{
					map[person.getxLoc()][person.getyLoc()].leaveRoom(person);
					map[person.getxLoc()+1][person.getyLoc()].enterRoom(person);
					return true;
				}
				else
				{
					return false;
				}

			case "a":
				if (person.getyLoc() > 0)
				{
					map[person.getxLoc()][person.getyLoc()].leaveRoom(person);
					map[person.getxLoc()][person.getyLoc()-1].enterRoom(person);
					return true;
				}
				else
				{
					return false;
				}
			default:
				break;
		}
		return true;
	}
	public static void gameOff()
	{
		gameOn = false;
	}
}
