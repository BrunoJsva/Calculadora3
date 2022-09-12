package br.com.calculadora;

import java.io.*;
import java.util.Scanner;

class Calculadora {

	public static void main(String[] args) {

		int num1;
		int num2;
		int operacao;
		float mostrar;

		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("INFORME PRIMEIRO NUMERO: ");
			num1 = ler.nextInt();

			System.out.println(
					"QUAL OPERAÇÃO DESEJA FAZER, Soma[1], Subtracão[2], Multiplicação[3], Divisão[4], Porcentagem[5] ?  ");
			operacao = ler.nextInt();

			System.out.println("INFORME SEGUNDO NUMERO: ");
			num2 = ler.nextInt();
		}

		Operacoes calcula = new Operacoes();

		switch (operacao) {
		case 1: {

			mostrar = calcula.soma(num1, num2);
			System.out.println("O resultado da soma é: " + mostrar);
			break;
		}

		case 2: {

			mostrar = calcula.subtracao(num1, num2);
			System.out.println("O resultado da subtração é: " + mostrar);
			break;

		}

		case 3: {

			mostrar = calcula.multiplicacao(num1, num2);
			System.out.println("O resultado da multiplicação é: " + mostrar);
			break;
		}

		case 4: {

			mostrar = calcula.divisao(num1, num2);
			System.out.println("O resultado da divisão é: " + mostrar);
			break;
		}

		case 5: {

			mostrar = calcula.porcentagem(num1, num2);
			System.out.println("O resultado da porcentagem é: " + mostrar);
			break;
		}

		default:
			throw new IllegalArgumentException("Você não escolheu uma operação valida!");
		}

	}
}
