package Rooms;

import People.Person;

public class Soraka extends Room
{
    public Soraka(int x, int y)
    {
        super(x,y);
    }
    public void enterRoom(Person x)
    {
        System.out.println("The healing words of Soraka have blessed you.");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        x.setHealth(x.getHealth()+10);
    }
    public void leaveRoom(Person x)
    {
        occupant = null;
    }
    public String toString()
    {
        return "[x]";
    }
}
