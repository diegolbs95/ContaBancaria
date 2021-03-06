package Aplicacao;


import java.util.Locale;
import java.util.Scanner;

import Entidades.Cliente;


public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Cliente Cliente;
		
		
		System.out.print("Digite o número da conta: ");
			int numero = sc.nextInt();
		
		System.out.print("Digite o titular da conta: ");
			sc.nextLine();
			String titular = sc.nextLine();
		
		System.out.print("Existe um depósito inicial (s/n)?");
			char resposta = sc.next().charAt(0);
		
		if (resposta == 's') {
			System.out.println("Digite o valor inicial do depósito: ");
				double DepositoInicial = sc.nextDouble();
				Cliente = new Cliente(numero,titular,DepositoInicial);	
		}
		else {
			Cliente = new Cliente(numero, titular);
		}
		 
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(Cliente);
		
		System.out.println();
		System.out.println("Digite um valor de depósito: ");
			double valorDeposito = sc.nextDouble();
			Cliente.deposito(valorDeposito);
		System.out.println("Dados atualizados da conta: ");
		System.out.println(Cliente);
		
		System.out.println("Digite um valor de retirada: ");
			double valorRetirada = sc.nextDouble();
			Cliente.retirar(valorRetirada);
		System.out.println("Dados atualizados da conta: ");
		System.out.println(Cliente);
	
		
		sc.close();	
	}


	}
