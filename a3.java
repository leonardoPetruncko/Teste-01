
/* 3- Crie um programa que apresente na tela uma escada de tamanho n
   utilizando o caractere * e espaços. A base e altura da escada devem ser
   iguais ao valor de n. A última linha não deve conter nenhum espaço. */

import java.util.Scanner;

public class a3 {

	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in);

		System.out.println(" Qual o tamanho da Escada? ");
		int tamanhoEscada = Scan.nextInt();

		String vet[] = new String[tamanhoEscada];

		vet[0] = "*";

		System.out.print(vet[0] + "\n");
		for (int i = 1; i < tamanhoEscada; i++) {
			vet[i] = vet[i - 1] + "*";
			System.out.print(vet[i] + "\n");
		}
	}
}
