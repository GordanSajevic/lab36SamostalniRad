package lab36SamostalniRad;

public class Truck {
	
	private char letter;
	private Truck nextTruck;
	
	public Truck(char character)
	{
		this.letter = character;
	}
	
	public char getLetter()
	{
		return letter;
	}
	
	public void attach(Truck nextTruck)
	{
		this.nextTruck = nextTruck;
	}
	
	public Truck getNext()
	{
		return nextTruck;
	}
	
	public void setLetter(char letter)
	{
		if ((int)letter < 65 || (int)letter > 90)
		{
			throw new IllegalArgumentException("Character must be uppercase letter (A-Z)");
		}
		else
		{
			this.letter = letter;
		}
	}

}
