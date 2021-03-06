package monster.modle;

public class MarshmallowMonster
{
	private String name;
	private double eyebrowCount;
	private int eyeCount;
	private int legCount;
	private int noseCount;
	private boolean hasBellyButton;
	
	public MarshmallowMonster()
	{
		this.name = "no name";
		this.noseCount = -1;
		this.eyeCount = -2;
		this.legCount = -2;
		this.eyebrowCount = -1.5;
		this.hasBellyButton = true;
	}
	public MarshmallowMonster(String name,
								double eyebrowCount, 
								int eyeCount, 
								int legCount, 
								int noseCount, 
								boolean hasBellyButton)
	{
		this.name = name;
		this.noseCount= noseCount;
		this.eyeCount = eyeCount;
		this.legCount = legCount;
		this.eyebrowCount = eyebrowCount;
		this.hasBellyButton = hasBellyButton;
	}
	public String toString()
	{
		String discription = "Monster says: Name is " + name;
		
		return discription;
	}
	public String getName()
	{
		return name;
	}
	public boolean getHasbellyButton()
	{
		return hasBellyButton;
	}
	public double geteyebrowCount()
	{
		return eyebrowCount;
	}
	public int getlegCount()
	{
		return legCount;
	}
	public int geteyeCount()
	{
		return eyeCount;
	}
	public int getnoseCount()
	{
		return noseCount;
	}
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setHasbellyButton(boolean hasBellyButton)
	{
		this.hasBellyButton = hasBellyButton;
	}
	public void seteyebrowCount(double eyebrowCount)
	{
		this.eyebrowCount = eyebrowCount;
	}
	public void setlegCount(int legCount)
	{
		this.legCount = legCount;
	}
	public void seteyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}
	public void setnoseCount(int noseCount)
	{
		this.noseCount = noseCount;
	}
}
