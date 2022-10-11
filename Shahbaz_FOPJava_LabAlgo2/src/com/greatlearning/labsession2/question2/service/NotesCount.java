package com.greatlearning.labsession2.question2.service;
public class NotesCount 
{
	public void notesCountImplementation(int [] notes, int amount)
	{
		int [] noteCounter = new int [notes.length];

		try {
			for (int i = 0; i < notes.length; i++)
			{
				if (amount >= notes[i])
				{
					noteCounter[i] = amount / notes [i];
					amount = amount - noteCounter[i] * notes[i];
				}
			}
			if (amount > 0)
			{
				System.out.println("exact amount cannot be given with higher value");
			}
			else
			{
				System.out.println("Your payment approach in order to give min no of notes will be");
				for (int i = 0; i < notes.length; i++)
				{
					if (noteCounter[i] != 0)
					{
						System.out.println(notes[i] + ":" +noteCounter[i]);
					}
				}
			}
		}
		catch (ArithmeticException e)
		{
			System.out.println(e+ "notes denomination 0  is invalid");
		}
	}
}
