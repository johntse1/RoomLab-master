package Rooms;

import People.Person;

public class youngThug extends Room
{
    public youngThug(int x, int y)
    {
        super(x,y);
    }
    public void enterRoom(Person x)
    {
        System.out.println("These kids out here are vicious! Gotta be careful you just got mugged!");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        x.setHealth(-5);
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
        return "[x]";
    }
}
