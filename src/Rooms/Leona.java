package Rooms;

import People.Person;

public class Leona extends Room
{
    public Leona(int x, int y)
    {
        super(x,y);
    }
    public void enterRoom(Person x)
    {
        System.out.println("The sun burns with you.");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        x.setHealth(+5);
        x.setDrop(x.getDrop("UselessLargeRod"));
    }
    public void leaveRoom(Person x)
    {
        occupant = null;
    }
    public String toString()
    {
        if(occupant!= null)
        {
            return "[p]";
        }
        else {
            return "[x]";
        }
    }
}

