package animalapp;

public class Mammals extends AbstractAnimal
{
	private String name;
	private int year;

	public Mammals (String name, int year)
	{
		super(name, year);
	}

	// We can have multiple constructors as seen below that get different paramaters
	// and do different things

	// public Mammals (int year)
	// {
	// 	super("Dave", year);
	// }

	@Override
	public String move()
	{
		return "slowly";
	}

	@Override
	public String breath()
	{
		return "lungs";
	}

	@Override
	public String reproduce()
	{
		return " regularly ";
	}


}