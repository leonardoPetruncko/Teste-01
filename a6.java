import java.util.Scanner;

/* 6-Crie um programa que leia um caractere e diga se ele � uma vogal,
	consoante, n�mero ou um s�mbolo (qualquer outro caractere, que n�o
	uma letra ou n�mero). */

public class a6 {

	public static void main(String[] args) {

		char numero;

		Scanner Scan = new Scanner(System.in);
		
		System.out.println(" Digite algum Caractere ");
		numero = Scan.next().charAt(0);

		if (numero >= 48 && numero <= 57) {
			System.out.println(" Seu caractere � N�mero ");
		} else if (numero == 97 || numero == 101 || numero == 105 || numero == 111 || numero == 117) {
			System.out.println(" Seu caractere � uma Vogal ");
		} else if ((numero >= 97 && numero <= 122)
				&& (numero != 97 || numero != 101 || numero != 105 || numero != 111 || numero != 117)) {
			System.out.println(" Seu caractere � uma Consoante ");
		} else {
			System.out.println(" Seu caractere � Especial ");
		}
	}
}
