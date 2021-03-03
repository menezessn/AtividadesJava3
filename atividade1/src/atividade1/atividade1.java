package atividade1;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
	
	Scanner grava = new Scanner (System.in);
	
	System.out.println("O latão é formado por 70% de cobre e 30% de zinco");
	System.out.println ("Digite uma quantidade de latão em KG e veja a"
			+ "\nquantidade de cobre e zinco que compõe esse latão");
	float latão = grava.nextFloat();
	System.out.println("Composto por "+ 0.3*latão + " KG de zinco e " + 0.7*latão + " KG de cobre");
	
	}

}
