package Rooms;

import People.Person;

public class Ryze extends Room
{
    public Ryze(int x, int y)
    {
        super(x,y);
    }
    public void enterRoom(Person x)
    {
        System.out.println("The rune mage contains you within his rune prison..");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        x.setHealth(x.getHealth()-10);
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
