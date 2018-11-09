package Rooms;
import Rooms.Room;
import People.Person;
import Rooms.*;

public class Board
{
    private Room[][] summonersRift;
    //Makes the map
    public Room[][] makeRift()
    {
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
            System.out.print("\n");
        }
    }
    Person occupant;
    int xLoc,yLoc;
    public void enterRoom(Person x, int i, int i1)
    {
        System.out.println("You enter the ruins of Summoners Rift");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
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
    public void makeEnemyRooms()
    {
        //WinningRoom
        for(int y = 0; y <5; y++) {
            int a = (int) Math.random() * 8;
            int b = (int) Math.random() * 8;
            summonersRift[a][b] = new WinningRoom(a, b);
        }
        //Katarina
        for(int y = 0; y <5; y++) {
            int c = (int) Math.random() * 8;
            int d = (int) Math.random() * 8;
            summonersRift[c][d] = new Katarina(c, d);
        }
        //Ryze
        for(int y = 0; y <5; y++) {
            int a = (int) Math.random() * 8;
            int b = (int) Math.random() * 8;
            summonersRift[a][b] = new Ryze(a, b);
        }
        //Jhin
        for(int y = 0; y <5; y++) {
            int a = (int) Math.random() * 8;
            int b = (int) Math.random() * 8;
            summonersRift[a][b] = new gunslinger(a, b);
        }
        //Soraka
        for(int y = 0; y <5; y++) {
            int a = (int) Math.random() * 8;
            int b = (int) Math.random() * 8;
            summonersRift[a][b] = new Soraka(a, b);
        }
        //Leona
        for(int y = 0; y <5; y++) {
            int a = (int) Math.random() * 8;
            int b = (int) Math.random() * 8;
            summonersRift[a][b] = new Leona(a, b);
        }
        //Veigar
        for(int y = 0; y <5; y++) {
            int a = (int) Math.random() * 8;
            int b = (int) Math.random() * 8;
            summonersRift[a][b] = new Veigar(a, b);
        }
        //XinZhao
        for(int y = 0; y <5; y++) {
            int a = (int) Math.random() * 8;
            int b = (int) Math.random() * 8;
            summonersRift[a][b] = new XinZhao(a, b);
        }
        //Walls
        for (int x = 0; x <= 21; x++)
        {
            int i = (int) (Math.random() * 9);
            int j = (int) (Math.random() * 9);
            if((i == 0)&&(j == 0))
            {
                summonersRift[i][j] = new Wall(1,2);
            }
            else
            {
                summonersRift[i][j] = new Wall(i, j);
            }
        }
    }
}
