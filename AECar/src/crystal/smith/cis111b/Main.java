package crystal.smith.cis111b;

import java.util.ArrayList;         //To use the ArrayList class
import java.util.Collections;       //To use the sort method.
public class Main
{
    public static void main(String[] args)
    {
	// Methods to call 3 different AECar Classes
    // Midterm Question 6
    AECars myCar = new Prius();
        System.out.println(myCar);
    AECars dreamCar = new Roadster();
        System.out.println(dreamCar);
    AECars practicalChoice = new Leaf();
        System.out.println(practicalChoice);
    AECars anotherOption = new AccordHybrid();
        System.out.println(anotherOption);

    // Method to sort 4 AECars by price
    // Midterm Question 7
    ArrayList<AECars> listOfCars = new ArrayList<AECars>();

    listOfCars.add(myCar);
    listOfCars.add(dreamCar);
    listOfCars.add(practicalChoice);
    listOfCars.add(anotherOption);

   Collections.sort(listOfCars);
   System.out.println(listOfCars.toString());
    }
}
