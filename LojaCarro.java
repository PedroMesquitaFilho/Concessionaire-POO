package carro;

import java.util.Scanner;

public class LojaCarro {

	public static void main(String[] args) {
	 Scanner scan = new Scanner (System.in);
	 Carro car = new Carro();
	 
	  System.out.println("---WELCOME TO AUTOCAR SOLI DEO GLORIA---");
		 System.out.println("Enter your name:");
		 car.name = scan.nextLine();
		
		 System.out.println("Okay " + car.name + " we have several amazing cars for your use and comfort, start by choosing the brand" );
		 System.out.println("what brand do you want?");
		 System.out.println(" -" + car.brandsOne);
		 System.out.println(" -" + car.brandsTwo);
		 System.out.println(" -" + car.brandsThree);
		 System.out.println("Choose which brand above you want:");
		 car.brands = scan.nextLine();
		 car.brandsCar();
		 System.out.println("Choose which model above you want:");
		 car.models = scan.nextLine();
		 car.modelsCar();
	    }

}