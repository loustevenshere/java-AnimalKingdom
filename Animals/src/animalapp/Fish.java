package animalapp;

public class Fish extends AbstractAnimal
{
	private String name;
	private int year;

	public Fish(String name, int year)
	{
		super(name, year);
	}

	@Override
	public String move()
	{
		return "swimming";
	}

	@Override
	public String breath()
	{
		return "with gills";
	}

	@Override
	public String reproduce()
	{
		return " eggs ";
	}

}