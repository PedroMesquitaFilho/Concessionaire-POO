package car;

public class Cars {

	String name;
	String brands;
	String models;
	String brandsOne = "FIAT";
	String brandsTwo = "VOLKS";
	String brandsThree = "HONDA";
	String modelsFiatOne = "TORO";
	String modelsFiatTwo = "FASTBACK";
	String modelsFiatThree = "FIORINO";
	String modelsVolksOne = "POLO";
	String modelsVolksTwo = "GOL";
	String modelsVolksThree = "TIGUAN";
	String modelsHondaOne = "CIVIC";
	String modelsHondaTwo = "HRV";
	String modelsHondaThree = "CRV";
	
	
	void brandsCar() {
		if(brands.equalsIgnoreCase(brandsOne)) {
			System.out.println("Good choice " + name + " Fiat is a great car brand for everyday and luxury cars.");
			System.out.println("These are the model options we have:");
			System.out.println(" - " + modelsFiatOne);
			System.out.println(" - " + modelsFiatTwo);
			System.out.println(" - " + modelsFiatThree);
			}
		else if(brands.equalsIgnoreCase(brandsTwo)) {
			System.out.println("Good choice " + name + " Volks is a great car brand for luxury, comfort and German technology.");
			System.out.println("These are the model options we have:");
			System.out.println(" - " + modelsVolksOne);
			System.out.println(" - " + modelsVolksTwo);
			System.out.println(" - " + modelsVolksThree);
		}
		else if(brands.equalsIgnoreCase(brandsThree)) {
			System.out.println("Good choice " + name + " Honda is a great car brand for luxury, comfort and Japanese technology.");
			System.out.println("These are the model options we have:");
			System.out.println(" - " + modelsHondaOne);
			System.out.println(" - " + modelsHondaTwo);
			System.out.println(" - " + modelsHondaThree);
		}
		else {
			System.out.println("WE DON'T HAVE THIS BRAND...");
		}
}
	    
	  void modelsCar() {
		  if(models.equalsIgnoreCase(modelsFiatOne)) {
			  System.out.println("Good choice " + name +" The " + modelsFiatOne + " is costing 180.000");
			  System.out.println("The " + modelsFiatOne + " it is a luxury and work car, it has comfort and even more a bucket");
			  System.out.println("CONFIGURATIONS: 4X4, 2.0 turbo, 230hp, rim 19 ");
		  }
		  else if(models.equalsIgnoreCase(modelsFiatTwo)) {
			  System.out.println("Good choice " + name + " The " + modelsFiatTwo + " it's costing 160.000");
			  System.out.println("The " + modelsFiatTwo + " It is a luxury car, it has luxury and comfort, with an innovative model by FIAT");
			  System.out.println("CONFIGURATIONS: 4X4, 2.0 turbo, 250hp, rim 19");
		  }
		  else if(models.equalsIgnoreCase(modelsFiatThree)) {
			  System.out.println("Good choice " + name + " The " + modelsFiatThree + " it's costing 100.000");
			  System.out.println("The " + modelsFiatThree + " It is an exclusive car for work, it fits several loads at the same time");
			  System.out.println("CONFIGURATIONS: 1.4, 140hp, rim 16");
		  }
		  else if(models.equalsIgnoreCase(modelsVolksOne)) {
			  System.out.println("Good choice " + name + " The " + modelsVolksOne + " it's costing 90.000");
			  System.out.println("The " + modelsVolksOne + " it's a car for everyday life and very comfortable, with german technology");
			  System.out.println("CONFIGURATIONS: 1.4 , 140hp, rim 17");
		  }
		  else if(models.equalsIgnoreCase(modelsVolksTwo)) {
			  System.out.println("Good choice " + name + " The " + modelsVolksTwo + " it's costing 70.000");
			  System.out.println("The " + modelsVolksTwo + " It's a popular car, great for everyday use and very resistant.");
			  System.out.println("CONFIGURATIONS: 1.0 , 100hp, rim 16");
		  }
		  else if(models.equalsIgnoreCase(modelsVolksThree)) {
			  System.out.println("Good choice " + name + " The " + modelsVolksThree + " it's costing 150.000");
			  System.out.println("The " + modelsVolksThree + " it is a luxury car, comfortable and very technological");
			  System.out.println("CONFIGURATIONS: 2.0, 180hp, rim 18");
		  }
		  else if(models.equalsIgnoreCase(modelsHondaOne)) {
			  System.out.println("Good choice " + name + " The " + modelsHondaOne + " it's costing 200.000");
			  System.out.println("The " + modelsHondaOne + " It is a luxury car, comfortable, technological and very fast");
			  System.out.println("CONFIGURATIONS: 2.0 TURBO, 220hp, rim 18");
		  }
		  else if(models.equalsIgnoreCase(modelsHondaTwo)) {
			  System.out.println("Good choice " + name + " The " + modelsHondaTwo + " it's costing 150.000");
			  System.out.println("The " + modelsHondaTwo + " It is a luxury car, comfortable, suitable for those with families who want the comfort of Japanese technology.");
			  System.out.println("CONFIGURATIONS: 2.0, 170hp, rim 17");
		  }
		  else if(models.equalsIgnoreCase(modelsHondaThree)) {
			  System.out.println("Good choice " + name + " The " + modelsHondaThree + " it's costing 130.000");
			  System.out.println("The " + modelsHondaThree + " It is a luxury car, comfortable, suitable for those with families who want the comfort of Japanese technology");
			  System.out.println("CONFIGURATIONS: 2.0, 160hp, rim 17");
		  }
		  else {
			  System.out.println("WE DON'T HAVE THIS MODEL...");
		  }
      }
}