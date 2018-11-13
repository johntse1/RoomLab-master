package Rooms;

import People.Person;

public class unoBoss extends Room
{
    public unoBoss(int x, int y)
    {
        super(x,y);
    }
    public void enterRoom(Person x)
    {
        System.out.println("We're bouncers and you best bounce out the way!");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        x.setHealth(-80);
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