package carro;

import java.util.Scanner;

public class LojaCarro {

	public static void main(String[] args) {
	 Scanner scan = new Scanner (System.in);
	 Carro car = new Carro();
	 
	 System.out.println("---BEM VINDO AO AUTOCAR SOLI DEO GLORIA---");
	 System.out.println("Digite o seu nome:");
	 car.nome = scan.nextLine();
	
	 System.out.println("Okay " + car.nome + " temos varios carros incriveis para o seu uso e conforto, comece escolhendo pela marca" );
	 System.out.println("qual Marca voce deseja?");
	 System.out.println(" -" + car.marcas1);
	 System.out.println(" -" + car.marcas2);
	 System.out.println(" -" + car.marcas3);
	 System.out.println("Escolha qual marca acima voce vai querer:");
	 car.marcas = scan.nextLine();
	 car.marcasCar();
	 System.out.println("Escolha qual modelo acima voce vai querer:");
	 car.modelos = scan.nextLine();
	 car.modelosCar();
    }
}