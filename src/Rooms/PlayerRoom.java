package Rooms;

import People.Person;

public class PlayerRoom extends Room
{
    public PlayerRoom(int x, int y)
    {
        super(x,y);
    }
    public void setRoom(Person x)
    {
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }
    public String toString()
    {
        return "[p]";
    }
}
