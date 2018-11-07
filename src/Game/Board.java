package Game;
import Rooms.Room;
import People.Person;
import Rooms.*;
public class Board
{
    private Room[][] summonersRift;
    public Board(Room[][] summonersRift1)
    {
        this.summonersRift = summonersRift1;
    }
    public Board(int length, int width)
    {
        summonersRift = new Room[length][width];
        for(int i = 0; i < summonersRift.length; i++)
        {
            for(int k = 0; k < summonersRift[i].length ; k++)
            {
                summonersRift[i][k] = new Room(i,k);
            }
        }
    }
    public Room[][] makeRift() {
        return summonersRift;
    }
    public String toString()
    {
        String str = "";
        for(int i=0; i< summonersRift.length; i++)
        {
            for(int j =0; j < summonersRift[i].length; j++)
            {
                str += summonersRift[i][j];
            }
            str += '\n';
        }
        return str;
    }
    public void printMap()
    {
        for(int i=0; i<summonersRift.length;i++)
        {
            for(int k=0;k<summonersRift[i].length;k++)
            {
                System.out.print(summonersRift[i][k]);
            }
            System.out.println();
        }
    }
    Person occupant;
    int xLoc,yLoc;

    public void enterRoom(Person x)
    {
        System.out.println("You enter the ruins of Summoners Rift");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }

    public void leaveRoom(Person x)
    {
        occupant = null;
    }
    public void makeEnemyRooms()
    {
        int a = (int)(Math.random()*summonersRift.length);
        int b = (int)(Math.random()*summonersRift.length);
        summonersRift[a][b] = new WinningRoom(a, b);
        //Katarina
        int c = (int)(Math.random()*summonersRift.length);
        int d = (int)(Math.random()*summonersRift.length);
        summonersRift[c][d] = new Katarina(c, d);
        //Ryze
        int e = (int)(Math.random()*summonersRift.length);
        int f = (int)(Math.random()*summonersRift.length);
        summonersRift[e][f] = new Ryze(e, f);
        //Jhin
        int g = (int)(Math.random()*summonersRift.length);
        int h = (int)(Math.random()*summonersRift.length);
        summonersRift[g][h] = new gunslinger(g, h);
    }
}
