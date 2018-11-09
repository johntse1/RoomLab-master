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
        x.setHealth(x.getHealth()-10);
        x.setAttack(x.getAttack()+10);
        x.setDrop(x.getDrop("GuardianAngel"));
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
