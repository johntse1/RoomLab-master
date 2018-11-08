package Rooms;

import People.Person;

public class Veigar extends Room
{
    public Veigar(int x, int y)
    {
        super(x,y);
    }
    public void enterRoom(Person x)
    {
        System.out.println("The mighty Veigar will make everyone bow.");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
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

