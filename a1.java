
/*
* 1 - A jornada de trabalho semanal de um funcion�rio � de 40 horas. O
* funcion�rio que trabalhar mais de 40 horas receber� hora extra, cujo c�lculo
* � o valor da hora regular com um acr�scimo de 50%.
* 
* Desenvolva um sistema que leia o n�mero de horas trabalhadas em um m�s, o
* sal�rio por hora e escreva o sal�rio total do funcion�rio, que dever� ser
* acrescido das horas extras, caso tenham sido trabalhadas (considere que o m�s
* possua 4 semanas exatas).
*/

import java.util.Scanner;

public class a1 {

	public static void main(String[] args) {

		String nomeFuncionario;
		int valorSalario, salarioTotal, horaExtraPergunta, horaExtra;
		double horaSalario, horaExtraConta = 0;

		Scanner Scan = new Scanner(System.in);

		System.out.println(" Qual o seu nome? ");
		nomeFuncionario = Scan.next();

		System.out.println(nomeFuncionario + ", Qual o valor do seu Sal�rio atual? ");
		valorSalario = Scan.nextInt();

		System.out.println(nomeFuncionario + ", Voc� fez hora extra? (1 = Sim / 2 = N�o) ");
		horaExtraPergunta = Scan.nextInt();

		horaSalario = valorSalario / 40;

		if (horaExtraPergunta == 1) {

			System.out.println(" Quantas horas extras foram no total desse m�s? ");
			horaExtra = Scan.nextInt();

			horaExtraConta = (horaSalario * horaExtra) * 0.5;

			salarioTotal = (int) (horaExtraConta + valorSalario);

			System.out.println(nomeFuncionario + ", \n Seu Sal�rio desse m�s ser� de: R$" + salarioTotal
					+ " \n Valor da Hora Extra: R$" + horaExtraConta);

		} else {

			System.out.println(nomeFuncionario + ", \n Seu Sal�rio desse m�s ser� de: R$" + valorSalario
					+ " \n Valor da Hora Extra: R$" + horaExtraConta);
		}
	}
}
