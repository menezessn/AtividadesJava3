package atividade5;

import java.util.Scanner;

public class atividade5 {

	public static void main(String[] args) {
		
	Scanner grava = new Scanner (System.in);
	
	System.out.println("Digite o valor depositado em R$:");
	double deposito;
	deposito = grava.nextDouble();
	
	System.out.println("Após um mês, o valor com o rendimento será de R$  " + (deposito + deposito*0.7));

	}

}
