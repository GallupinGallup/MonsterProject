package monster.controler;

import monster.modle.MarshmallowMonster;

public class MonsterController
{
	private MarshmallowMonster firstMonster;
	
	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("freddy", 1.5, 2, 2, 1, true);
	}
	
	public void start()
	{
		System.out.println("We made monsers today");
		System.out.println("Here is mine: " + firstMonster);
	}
	/*
	 * monster name is freddy
	 * has 1.5 eyebrows
	 * has 2 eyes
	 * has 2 legs
	 * has 1 nose
	 * has belly button
	 */
}
