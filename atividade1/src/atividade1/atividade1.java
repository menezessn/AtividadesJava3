package atividade1;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
	
	Scanner grava = new Scanner (System.in);
	
	System.out.println("O lat�o � formado por 70% de cobre e 30% de zinco");
	System.out.println ("Digite uma quantidade de lat�o em KG e veja a"
			+ "\nquantidade de cobre e zinco que comp�e esse lat�o");
	float lat�o = grava.nextFloat();
	System.out.println("Composto por "+ 0.3*lat�o + " KG de zinco e " + 0.7*lat�o + " KG de cobre");
	
	}

}
