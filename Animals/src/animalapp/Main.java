package animalapp;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Everything ok in there?");

		Mammals panda = new Mammals ("Panda", 1869);
		Birds parrot = new Birds("Parrot", 1854);
		Fish salmon = new Fish("Salmon", 1758);
		System.out.println(panda.getName());
	
		System.out.println();

		System.out.println(parrot.move());
		System.out.println(parrot);

		System.out.println();
		System.out.println(salmon);
		System.out.println(salmon.breath());




	}
}