package Rooms;

import People.Person;

public class Wall extends Room
{
    public Wall(int x, int y)
    {
        super(x,y);
    }
    public String toString()
    {
        return "[^}";
    }
    public void determineWall(Person x)
    {
        if(occupant!= null)
        {
            System.out.println("You cannot move here!");
        }
    }
}
