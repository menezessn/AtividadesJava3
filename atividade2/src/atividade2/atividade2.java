package atividade2;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner grava = new Scanner (System.in);
	
	System.out.println("Esse programa lê um número e exibe seu sucessor \nDigite o número:");
	
	int numero = grava.nextInt();
	
	System.out.println("O sucessor desse número é " + (numero+1));
	

	}

}
