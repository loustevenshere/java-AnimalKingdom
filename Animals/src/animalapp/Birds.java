package animalapp;

public class Birds extends AbstractAnimal
{
	private String name;
	private int year;

	public Birds(String name, int year)
	{
		super(name, year);
	}

	@Override
	public String move()
	{
		return "flying";
	}

	@Override
	public String breath()
	{
		return "lungs";
	}

	@Override
	public String reproduce()
	{
		return " in nest ";
	}

}