package adivinhanumero;

import java.util.Random;
import java.util.Scanner;

public class AdivinhaNumero {
	
	public static void dica(int palpite, int numero, int tentativas) {
		if (palpite > numero) {
			System.out.println("Seu palpite é maior que o número");
		} else {
			if (palpite < numero) {
				System.out.println("Seu palpite é menor que o número");
			} else {
				System.out.println("Você acertou! O numero era " + numero );
				System.out.println("Você tentou " + tentativas + " vezes");
			}
		}
	}

	public static void main(String[] args) {
		int palpite = 0, sorteado, tentativas = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		Random geradorDeAleatorio = new Random();
		sorteado = geradorDeAleatorio.nextInt(99) + 1;
		
		do {
			System.out.printf("\n\n----------\n");
			System.out.println("Número de tentativas: " + tentativas);
			
			System.out.print("Qual seu palpite: ");
			palpite = entrada.nextInt();
			tentativas++;
			
			dica(palpite, sorteado, tentativas);
		} while (palpite != sorteado);

	}

}
