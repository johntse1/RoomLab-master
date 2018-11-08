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
        summonersRift[8][8] = new WinningRoom(8, 8);
        //Katarina
        summonersRift[0][3] = new Katarina(0, 3);
        //Ryze
        summonersRift[3][0] = new Ryze(3, 0);
        //Jhin
        summonersRift[3][3] = new gunslinger(3, 3);
        //Soraka
        summonersRift[6][0] = new Soraka(6,0);
        //Leona
        summonersRift[0][6] = new Leona(0, 6);
        //Veigar
        summonersRift[6][6] = new Veigar(6,6 );
        //XinZhao
        summonersRift[8][8] = new XinZhao(8,8 );
        //Walls
        for (int x = 0; x <= 21; x++)
        {
            int i = (int) (Math.random() * 9);
            int j = (int) (Math.random() * 9);
            if((i == 0)&&(j == 0))
            {
                summonersRift[i][j] = new Wall(1,2);
            }
            else {
                summonersRift[i][j] = new Wall(i, j);
            }
        }
    }
}
