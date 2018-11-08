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
		System.out.println("What is your name summoner?");
		String Name = name.nextLine();
		Board summonersRift = new Board(9,9);
		summonersRift.makeEnemyRooms();
		summonersRift.printMap();
		//Setup player 1 and the input scanner
		Person summoner = new Person("FirstName", "FamilyName", 0,0, 100, "none");
		summonersRift.enterRoom(summoner, 0,0);
		Scanner in = new Scanner(System.in);
		while(gameOn)
		{
			System.out.println("Where would you like to move? (Choose N, S, E, W)");
			String move = in.nextLine();
			if(validMove(move, summoner, summonersRift.makeRift()))
			{

				System.out.println("Your coordinates " + Name +": row = " + summoner.getxLoc() + " col = " + summoner.getyLoc());
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
			case "n":
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
			case "e":
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

			case "w":
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
