package People;

/**
 * Person represents the player as they move through the game.
 */
public class Person
{
	private String firstName;
	private String familyName;
	private int xLoc, yLoc;
	private int Health;
	private String Drop;

	public int getxLoc() {
		return xLoc;
	}

	public void setxLoc(int xLoc) {
		this.xLoc = xLoc;
	}

	public int getyLoc() {
		return yLoc;
	}

	public void setyLoc(int yLoc) {
		this.yLoc = yLoc;
	}

	public Person (String firstName, String familyName, int xLoc, int yLoc, int Health, String Drop)
	{
		this.firstName = firstName;
		this.familyName = familyName;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
		this.Health = Health;
		this.Drop = Drop;
	}
	public String toString()
	{
		return "[p]";
	}
	public int getHealth()
	{
		return Health;
	}
	public void setHealth(int num)
	{
		 this.Health = num;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getFamilyName()
	{
		return familyName;
	}
	public String getDrop()
	{
		return Drop;
	}
}
