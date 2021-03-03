package atividade4;

import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner grava = new Scanner (System.in);
		
		int a,b,memoria; 
		
		System.out.println("Digite o valor de A:");
		a = grava.nextInt();
		
		System.out.println("Digite o valor de b:");
		b = grava.nextInt();
		
		memoria = a;
		a=b;
		b = memoria;
		
		System.out.println(a + " " + b );
		
	}

}
