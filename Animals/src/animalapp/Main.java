package animalapp;

import java.util.List;
import java.util.ArrayList;

public class Main
{

	public static List<AbstractAnimal> filteredAnimals(List<AbstractAnimal> theList, 
		CheckAnimal tester)
	{
		List<AbstractAnimal> tempList = new ArrayList<>();

		for (AbstractAnimal v: theList)
		{
			if (tester.test(v))
			{
				tempList.add(v);
			}
		}

		return tempList;
	}

	// easier for printing out- instead or returing a list like above just print out whatever passes the filter

	// public static void filteredAnimals(List<AbstractAnimal> theList, 
	// 	CheckAnimal tester)
	// {
	//

	// 	for (AbstractAnimal v: theList)
	// 	{
	// 		if (tester.test(v))
	// 		{
	// 			System.out.println(v.getName() + " " + v.reproduce() + " " + v.move() + " " + v.breath() + " " + v.getYear());
	// 		}
	// 	}
	// 	
	// }

	public static void main(String[] args)
	{
		System.out.println("Everything ok in there?");

		List<AbstractAnimal> animalList = new ArrayList<>();
		animalList.add(new Mammals("Panda", 1869));

		// Mammals
		Mammals panda = new Mammals ("Panda", 1869);
		Mammals zebra = new Mammals("Zebra", 1778);
		Mammals koala = new Mammals("Koala", 1816);
		Mammals sloth = new Mammals("Sloth", 1804);
		Mammals armadillo = new Mammals("Armadillo", 1758);
		Mammals raccoon = new Mammals("Raccoon", 1758);
		Mammals bigFoot = new Mammals("Bigfoot", 2021);

		// System.out.println(bigFoot);
		// System.out.println(sloth);

		// Birds
		Birds parrot = new Birds("Parrot", 1854);
		Birds pigeon = new Birds("Pigeon", 1837);
		Birds toucan = new Birds("Toucan", 1758);
		Birds swan = new Birds("Swan", 1758);

		// System.out.println(parrot);


		// Fish
		Fish salmon = new Fish("Salmon", 1758);
		Fish catfish = new Fish("Catfish", 1817);
		Fish perch = new Fish("Perch", 1758);

		// System.out.println(perch);


		// System.out.println(panda.getName());
	
		// System.out.println();

		// System.out.println(parrot.move());
		// System.out.println(parrot);

		// System.out.println();
		// System.out.println(salmon);
		// System.out.println(salmon.breath());

		// Making a list
		List<AbstractAnimal> animalList = new ArrayList<>();
		animalList.add(panda);
		animalList.add(zebra);
		animalList.add(koala);
		animalList.add(sloth);
		animalList.add(armadillo);
		animalList.add(raccoon);
		animalList.add(bigFoot);

		animalList.add(parrot);
		animalList.add(pigeon);
		animalList.add(toucan);
		animalList.add(swan);

		animalList.add(salmon);
		animalList.add(catfish);
		animalList.add(perch);

		// System.out.println(animalList.toString());


		animalList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
		System.out.println(animalList.toString());

		System.out.println();
		animalList.sort((v1, v2) -> v1.getYear()-(v2.getYear()));
		System.out.println(animalList.toString());

		animalList.sort((v1, v2) -> v1.move().compareToIgnoreCase(v2.move()));
		System.out.println(animalList.toString());

		List<AbstractAnimal> lungsList = filteredAnimals(animalList, (v) -> v.breath() == "lungs");
		lungs1758List.forEach((v) -> System.out.print(v));


		List<AbstractAnimal> lungs1758List = filteredAnimals(animalList, (v) -> v.breath() == "lungs" && v.getYear() == 1758);
		lungs1758List.forEach((v) -> System.out.print(v));

		List<AbstractAnimal> eggsAndBreatheList = filteredAnimals(animalList, (v) -> v.reproduce().equalsIgnoreCase("eggs") && v.breath().equalsIgnoreCase("lungs"));
		eggsAndBreatheList.forEach((v) -> System.out.println(v));

		// If using filter print out method from above
		animalList.sort((a1,a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		filteredAnimals(animalList, a -> (a.getYear() == 1758));

		// Using filter print out method above
		// Thise one is cool because it list alphabetically, if you want descending switch a2 and a1
		// Also lists all members of the array that are part of Mammals class
		animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		filteredAnimals(animalList, a -> (a instanceof Mammals));


	}

}