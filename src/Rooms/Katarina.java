package Rooms;

import People.Person;

public class Katarina extends Room
{
    public Katarina(int x, int y)
    {
        super(x,y);
    }
    public void enterRoom(Person x)
    {
        System.out.println("You've been greeted by the daggers of Katarina!");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        x.setHealth(x.getHealth()-10);
        x.setAttack(x.getAttack()+10);
        x.setDrop(x.getDrop("HealthPot"));
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
