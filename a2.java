
/* 	Crie um programa para ler o n�mero total de eleitores de um
	munic�pio, o n�mero de votos brancos, nulos e v�lidos. Calcular e escrever
	o percentual que cada um representa em rela��o ao total de eleitores.  */

import java.util.Scanner;

public class a2 {

	public static void main(String[] args) {

		double votosBrancos, votosNulos, votosValidos, porcenVotosBrancos, porcenVotosNulos, porcenVotosValidos;
		int totalVotos;

		Scanner Scan = new Scanner(System.in);

		System.out.println("====== Vota��o Eleitoral De S�o Paulo ======");

		System.out.println(" Quantos foram o n�mero de votos Brancos?");
		votosBrancos = Scan.nextDouble();

		System.out.println(" Quantos foram o n�mero de votos Nulos? ");
		votosNulos = Scan.nextDouble();

		System.out.println(" Quantos foram o n�mero de votos V�lidos? ");
		votosValidos = Scan.nextDouble();

		totalVotos = (int) (votosBrancos + votosNulos + votosValidos);
		System.out.println(" Total de Votos: " + totalVotos);
		System.out.println();
		
		// Porcentagem

		porcenVotosBrancos = 100 * (votosBrancos / totalVotos);

		porcenVotosNulos = 100 * (votosNulos / totalVotos);

		porcenVotosValidos = 100 * (votosValidos / totalVotos);

		System.out.println(" Porcentagem de Votos Brancos: " + porcenVotosBrancos);
		System.out.println(" Porcentagem de Votos Nulos: " + porcenVotosNulos);
		System.out.println(" Porcentagem de Votos Validos: " + porcenVotosValidos);

	}

}
