package Rooms;

import People.Person;
public class gunslinger extends Room
{
    public gunslinger(int x, int y)
    {
        super(x, y);
    }

    public void enterRoom(Person x)
    {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("PowPowKerChow! You see the bullets of Jhin fly past you.");

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
