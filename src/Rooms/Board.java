package Rooms;
import Rooms.Room;
import People.Person;
import Rooms.*;

public class Board {
    private Room[][] summonersRift;

    public Room[][] makeRift() {
        return summonersRift;
    }

    /*
     * Makes the code
     */
    public String toString() {
        String str = "";
        for (int i = 0; i < summonersRift.length; i++) {
            for (int j = 0; j < summonersRift[i].length; j++) {
                str += summonersRift[i][j];
            }
            str += '\n';
        }
        return str;
    }

    public void printMap() {
        for (int i = 0; i < summonersRift.length; i++) {
            for (int k = 0; k < summonersRift[i].length; k++) {
                System.out.print(summonersRift[i][k]);
            }
            System.out.print("\n");
        }
    }

    Person occupant;
    int xLoc, yLoc;

    public void enterRoom(Person x, int i, int i1) {
        System.out.println("You enter the ruins of Summoners Rift");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
    }

    public Board(int length, int width) {
        summonersRift = new Room[length][width];
        for (int i = 0; i < summonersRift.length; i++) {
            for (int k = 0; k < summonersRift[i].length; k++) {
                summonersRift[i][k] = new Room(i, k);
            }
        }
    }

    public void makeEnemyRooms() {
        //WinningRoom
        summonersRift[8][8] = new WinningRoom(8, 8);
        //Katarina
        summonersRift[0][2] = new Katarina(0, 2);

        //Ryze
        summonersRift[0][5] = new Ryze(0, 5);

        //Jhin
        summonersRift[0][8] = new gunslinger(0, 8);
        //Soraka
        summonersRift[2][0] = new Soraka(2, 0);
        //Leona
        summonersRift[5][0] = new Leona(5, 0);
        //Veigar
        summonersRift[8][0] = new Veigar(8, 0);
        //XinZhao
        summonersRift[7][7] = new XinZhao(7, 7);
        //unoBoss
        summonersRift[7][8] = new unoBoss(7, 8);
        //bosBoss
        summonersRift[8][7] = new bosBoss(8, 7);
        //littleThugs
        /*
         * Makes the random kids who mug you
         */
        for (int i = 0; i < 30; i++) {
            double a = Math.random() * 9;
            double b = Math.random() * 9;
            int c = (int) a;
            int d = (int) b;
            summonersRift[c][d] = new youngThug(c, d);
        }
    }
}