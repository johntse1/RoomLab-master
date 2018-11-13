package Rooms;
import  People.Person;

public class XinZhao extends Room
{
    public XinZhao(int x, int y)
    {
        super(x,y);
    }
    public void enterRoom(Person x)
    {
        System.out.println("As the wind becomes lightning, you become struck.");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        x.setDrop(x.getDrop("DFG"));
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
