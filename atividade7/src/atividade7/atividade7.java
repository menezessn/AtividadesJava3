package atividade7;

import java.util.Scanner;

public class atividade7 {

	public static void main(String[] args) {

		Scanner grava = new Scanner (System.in);
		
		System.out.println("Digite o preço de custo do produto:");
		double custo = grava.nextDouble();
		
		System.out.println("Digite o percentual de lucro desejado:");
		double percentual = grava.nextDouble();
		
		System.out.println("O valor de venda do produto será de R$ " + (custo+(percentual/100)*custo));
		

	}

}
