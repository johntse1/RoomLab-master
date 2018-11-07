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
        System.out.println("Hahaxd you pulled a quick one but not quick enough. You lose.");
        System.exit(0);

    }
    public void leaveRoom(Person x)
    {
        occupant = null;
    }
}
