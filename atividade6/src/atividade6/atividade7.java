package atividade6;

import java.util.Scanner;

public class atividade7 {

	public static void main(String[] args) {

		Scanner grava = new Scanner (System.in);
		
		System.out.println("Digite o valor total da compra em R$:");
		double compra = grava.nextDouble();
		
		System.out.println("O valor das 5 parcelas será de R$ " + (compra/5));

	}

}
