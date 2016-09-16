package monster.controler;

import monster.modle.MarshmallowMonster;

import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster firstMonster;
	private Scanner keyboardInput;
	
	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("freddy", 1.5, 2, 2, 1, true);
		keyboardInput = new Scanner(System.in);
	}
	
	public void start()
	{
		{
		System.out.println("We made monsers today");
		System.out.println("Here is mine: " + firstMonster);
		System.out.println("What would you like to know about my monster?");
		String userInput = keyboardInput.nextLine();
		if(userInput.equalsIgnoreCase("Eyes"))
		{
			System.out.println("My monster has " + firstMonster.geteyeCount() + " eyes!");
			System.out.println("Do you want to change how many eyes he has?");
			userInput = keyboardInput.nextLine();
			if(userInput.equalsIgnoreCase("Yes"))
			{
				System.out.println("How many eyes?.");
				String newEyes = keyboardInput.nextLine();
				firstMonster.seteyeCount(Integer.parseInt(newEyes));
				System.out.println("ok now my monster has " + newEyes + " eyes");
				try
				{
					Thread.sleep(3000);
				} catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			else
			{
				System.out.println("Ok look at the monster more!");
			}
			
		}
		else if(userInput.equalsIgnoreCase("Eyebrows"))
		{
			System.out.println("My monster has " + firstMonster.geteyebrowCount() + " eyebrows!");
			System.out.println("Do you want to change how many eyebrows he has?");
			String newEyebrow = keyboardInput.nextLine();
			if(userInput.equalsIgnoreCase("Yes"))
			{
				firstMonster.seteyebrowCount(Integer.parseInt(newEyebrow));
			}
			else
			{
				System.out.println("Ok look at the monster more!");
				start();
			}
			
		}
		else if(userInput.equalsIgnoreCase("Legs"))
		{
			System.out.println("My monster has " + firstMonster.getlegCount() + " legs!");
			System.out.println("Do you want to change how many legs he has?");
			String newLegs = keyboardInput.nextLine();
			if(userInput.equalsIgnoreCase("Yes"))
			{
				firstMonster.setlegCount(Integer.parseInt(newLegs));
			}
			else
			{
				System.out.println("Ok look at the monster more!");
			}
		}
		else if(userInput.equalsIgnoreCase("Nose"))
		{
			System.out.println("My monster has " + firstMonster.getnoseCount() + " nose!");
			System.out.println("Do you want to change how many noses he has?");
			String newNose = keyboardInput.nextLine();
			if(userInput.equalsIgnoreCase("Yes"))
			{
				firstMonster.setnoseCount(Integer.parseInt(newNose));
			}
			else
			{
				System.out.println("Ok look at the monster more!");
			}
		}
		else
		{
			System.out.println("Sorry " + userInput + " is not an option. You can type: Eyes, Eyebrows, Legs, or Nose!");
			
		}
	}
	}
}

		
	/*
	 * monster name is freddy
	 * has 1.5 eyebrows
	 * has 2 eyes
	 * has 2 legs
	 * has 1 nose
	 * has belly button
	 */
