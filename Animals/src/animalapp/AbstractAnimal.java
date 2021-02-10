package animalapp;

abstract class AbstractAnimal 
{
	private static int maxId = 0;
	// protected int food;
	private int id;
	private String name;
	private int year;

	// constructors- instantiation of class
	public AbstractAnimal(String name, int year)
	{
		maxId++;
		this.id = maxId;
		this.name = name;
		this.year = year;
	}


	abstract String move();
	abstract String breath();
	abstract String reproduce();

	public String getName()
	{
		return name;
	}

	public int getYear()
	{
		return year;
	}

	public int getId()
	{
		return id;
	}

	@Override
	public String toString()
	{
		return "Our Animals {id = " + id + ", name = " + name + " , The year it was found: " + year + " }";
	}
}