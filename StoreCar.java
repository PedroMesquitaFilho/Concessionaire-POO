package car;

import java.util.Scanner;

public class CarStore {

	public static void main(String[] args) {
	 Scanner scan = new Scanner (System.in);
	 Cars car = new Cars();
	 
	  System.out.println("---WELCOME TO AUTOCAR SOLI DEO GLORIA---");
		 System.out.println("Enter your name:");
		 cars.name = scan.nextLine();
		
		 System.out.println("Okay " + cars.name + " we have several amazing cars for your use and comfort, start by choosing the brand" );
		 System.out.println("what brand do you want?");
		 System.out.println(" -" + cars.brandsOne);
		 System.out.println(" -" + cars.brandsTwo);
		 System.out.println(" -" + cars.brandsThree);
		 System.out.println("Choose which brand above you want:");
		 cars.brands = scan.nextLine();
		 cars.brandsCar();
		 System.out.println("Choose which model above you want:");
		 cars.models = scan.nextLine();
		 cars.modelsCar();
	    }

}