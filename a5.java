import java.util.Scanner;

/* 5-Crie um programa que leia um n�mero inteiro de 1 a 7 e informe o dia
	da semana correspondente, sendo domingo o dia de n�mero 1. Se o
	n�mero n�o corresponder a um dia da semana, mostre uma mensagem
	de erro. */

public class a5 {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);
	
		int dia = 0;
		System.out.println(" Digite um N�mero de 1 a 7. ");
		dia = Scan.nextInt();
		
		switch(dia) {
		
		case 1: 
			System.out.println(" DIA 1 = Domingo");
			break;
		case 2:
			System.out.println(" DIA 2 = Segunda-feira");
			break;
		case 3:
			System.out.println(" DIA 3 = Ter�a-feira");
			break;
		case 4:
			System.out.println(" DIA 4 = Quarta-feira");
			break;
		case 5:
			System.out.println(" DIA 5 = Quinta-feira");
			break;
		case 6:
			System.out.println(" DIA 6 = Sexta-feira");
			break;
		case 7:
			System.out.println(" DIA 7 = S�bado");
			break;
			default:
				System.out.println(" ERROR 404 - N�mero Semanal errado. ");
		}
		
	}

}
