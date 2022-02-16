import java.util.Scanner;

/* 6-Crie um programa que leia um caractere e diga se ele é uma vogal,
	consoante, número ou um símbolo (qualquer outro caractere, que não
	uma letra ou número). */

public class a6 {

	public static void main(String[] args) {

		char numero;

		Scanner Scan = new Scanner(System.in);
		
		System.out.println(" Digite algum Caractere ");
		numero = Scan.next().charAt(0);

		if (numero >= 48 && numero <= 57) {
			System.out.println(" Seu caractere é Número ");
		} else if (numero == 97 || numero == 101 || numero == 105 || numero == 111 || numero == 117) {
			System.out.println(" Seu caractere é uma Vogal ");
		} else if ((numero >= 97 && numero <= 122)
				&& (numero != 97 || numero != 101 || numero != 105 || numero != 111 || numero != 117)) {
			System.out.println(" Seu caractere é uma Consoante ");
		} else {
			System.out.println(" Seu caractere é Especial ");
		}
	}
}
