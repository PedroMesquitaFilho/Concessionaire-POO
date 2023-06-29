package carro;

public class Carro {

	String nome;
	String marcas;
	String modelos;
	String marcas1 = "FIAT";
	String marcas2 = "VOLKS";
	String marcas3 = "HONDA";
	String modeloFiat1 = "TORO";
	String modeloFiat2 = "FASTBACK";
	String modeloFiat3 = "FIORINO";
	String modeloVolks1 = "POLO";
	String modeloVolks2 = "GOL";
	String modeloVolks3 = "TIGUAN";
	String modeloHonda1 = "CIVIC";
	String modeloHonda2 = "HRV";
	String modeloHonda3 = "CRV";
	
	
	void marcasCar() {
		if(marcas.equalsIgnoreCase(marcas1)) {
			System.out.println("Otima escolha " + nome + " A Fiat eh uma otima marca de carro para o dia a dia e carros luxuosos.");
			System.out.println("Essas sao as opcoes de modelos que temos:");
			System.out.println(" -" + modeloFiat1);
			System.out.println(" -" + modeloFiat2);
			System.out.println(" -" + modeloFiat3);
			}
		else if(marcas.equalsIgnoreCase(marcas2)) {
			System.out.println("Otima escolha " + nome + " A Volks eh uma otima marca de carro para luxo,conforto e tecnologia alema.");
			System.out.println("Essas sao as opcoes de modelos que temos:");
			System.out.println(" -" + modeloVolks1);
			System.out.println(" -" + modeloVolks2);
			System.out.println(" -" + modeloVolks3);
		}
		else if(marcas.equalsIgnoreCase(marcas3)) {
			System.out.println("Otima escolha " + nome + " A Honda eh uma otima marca de carro para luxo,conforto e tecnologia japonesa.");
			System.out.println("Essas sao as opcoes de modelos que temos:");
			System.out.println(" -" + modeloHonda1);
			System.out.println(" -" + modeloHonda2);
			System.out.println(" -" + modeloHonda3);
		}
		else {
			System.out.println("ERRO NAS RESPOSTAS, REFACA TUDO DENOVO");
		}
}
	    
	  void modelosCar() {
		  if(modelos.equalsIgnoreCase(modeloFiat1)) {
			  System.out.println("Otima escolha " + nome + " A " + modeloFiat1 + " esta custando 180.000");
			  System.out.println("A " + modeloFiat1 + " eh um carro de luxo e de trabalho, possui conforto e ainda mais uma cacamba");
			  System.out.println("CONFIGURACOES: 4X4 , 2.0 turbo, 230cv, aro 19 ");
		  }
		  else if(modelos.equalsIgnoreCase(modeloFiat2)) {
			  System.out.println("Otima escolha " + nome + " A " + modeloFiat2 + " esta custando 160.000");
			  System.out.println("A " + modeloFiat2 + " eh um carro de luxo , possui luxo e conforto, com modelo inovador da FIAT");
			  System.out.println("CONFIGURACOES: 4X4 , 2.0 turbo, 250cv, aro 19");
		  }
		  else if(modelos.equalsIgnoreCase(modeloFiat3)) {
			  System.out.println("Otima escolha " + nome + " A " + modeloFiat3 + " esta custando 100.000");
			  System.out.println("A " + modeloFiat3 + " eh um carro exclusivo para trabalho, cabe diversas cargas ao mesmo tempo");
			  System.out.println("CONFIGURACOES: 1.4, 140cv, aro 16");
		  }
		  else if(modelos.equalsIgnoreCase(modeloVolks1)) {
			  System.out.println("Otima escolha " + nome + " O " + modeloVolks1 + " esta custando 90.000");
			  System.out.println("O " + modeloVolks1 + " eh um carro para o dia a dia e muito confortavel, com tecnologia alema");
			  System.out.println("CONFIGURACOES: 1.4 , 140cv, aro 17");
		  }
		  else if(modelos.equalsIgnoreCase(modeloVolks2)) {
			  System.out.println("Otima escolha " + nome + " O " + modeloVolks2 + " esta custando 70.000");
			  System.out.println("O " + modeloVolks2 + " eh um carro popular, otimo para o dia a dia e muito resistente");
			  System.out.println("CONFIGURACOES: 1.0 , 100cv, aro 16");
		  }
		  else if(modelos.equalsIgnoreCase(modeloVolks3)) {
			  System.out.println("Otima escolha " + nome + " A " + modeloVolks3 + " esta custando 150.000");
			  System.out.println("A " + modeloVolks3 + " eh um carro de luxo, confortavel e muito tecnologico");
			  System.out.println("CONFIGURACOES: 2.0, 180cv, aro 18");
		  }
		  else if(modelos.equalsIgnoreCase(modeloHonda1)) {
			  System.out.println("Otima escolha " + nome + " O " + modeloHonda1 + " esta custando 200.000");
			  System.out.println("O " + modeloHonda1 + " eh um carro de luxo, confortavel,tecnologico e muito veloz");
			  System.out.println("CONFIGURACOES: 2.0 TURBO, 220cv, aro 18");
		  }
		  else if(modelos.equalsIgnoreCase(modeloHonda2)) {
			  System.out.println("Otima escolha " + nome + " O " + modeloHonda2 + " esta custando 150.000");
			  System.out.println("O " + modeloHonda2 + " eh um carro de luxo, confortavel, proprio para quem tem familia e quer conforto de tecnologia japonesa");
			  System.out.println("CONFIGURACOES: 2.0, 170cv, aro 17");
		  }
		  else if(modelos.equalsIgnoreCase(modeloHonda3)) {
			  System.out.println("Otima escolha " + nome + " O " + modeloHonda3 + " esta custando 130.000");
			  System.out.println("O " + modeloHonda3 + " eh um carro de luxo, confortavel, proprio para quem tem familia e quer conforto de tecnologia japonesa");
			  System.out.println("CONFIGURACOES: 2.0, 160cv, aro 17");
		  }
		  else {
			  System.out.println("ERRO EM ALGUMA RESPOSTA...");
		  }
      }
}