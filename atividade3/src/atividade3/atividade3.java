package atividade3;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
	
	Scanner grava = new Scanner (System.in);
	
	System.out.println("Digite o seu nome:");
	String nome = grava.next();
	
	System.out.println("Digite o seu sal�rio fixo em reais:");
	double salario = grava.nextDouble();
	
	System.out.println("Digite o seu total de vendas no m�s em R$:");
	double vendas = grava.nextDouble();
	
	double comissao = vendas*0.15;
	
	System.out.println("O vendedor " + nome + 
			"\ntem o sal�rio fixo de R$ " + salario + 
			"\nE seu sal�rio fixo com a comiss�o � de " +
			(salario+comissao));	
	
	
	
	

	}

}
