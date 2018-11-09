package Rooms;

public class Wall extends Room
{
    public Wall(int x, int y)
    {
        super(x,y);
    }
    public String toString()
    {
        return "[^}";
    }
    public void determineWall()
    {
        if(occupant!= null)
        {
            System.out.println("You cannot move here!");
        }
    }
}
