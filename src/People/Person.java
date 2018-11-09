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
	private int Attack;
	public int getxLoc()
	{
		return xLoc;
	}

	public void setxLoc(int xLoc)
	{
		this.xLoc = xLoc;
	}

	public int getyLoc()
	{
		return yLoc;
	}

	public void setyLoc(int yLoc)
	{
		this.yLoc = yLoc;
	}

	public Person (String firstName, String familyName, int xLoc, int yLoc, int Health, int Attack, String Drop)
	{
		this.firstName = firstName;
		this.familyName = familyName;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
		this.Health = Health;
		this.Attack = Attack;
		this.Drop = Drop;
	}

	public int getHealth()
	{
		return Health;
	}
	public void setHealth(int num)
	{
		 this.Health = num;
	}
	public int getAttack()
	{
		return Attack;
	}
	public void setAttack(int att)
	{
		this.Attack = att;
	}
	public String getDrop(String item)
	{
		if(item.equals("DFG"))
		{
			setAttack(getAttack()+10);
		}
		if(item.equals("GuardianAngel"))
		{
			setHealth(getHealth()+100);
		}
		if(item.equals("HealthPot"))
		{
			setHealth(getHealth()+10);
			setAttack(getAttack()-10);
		}
		if(item.equals("UselessLargeRod"))
		{
			System.out.println("Haha you got nothing!!");
		}
		return Drop;
	}
	public void setDrop(String drop)
	{
		this.Drop = drop;
	}
}
