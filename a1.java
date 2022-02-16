
/*
* 1 - A jornada de trabalho semanal de um funcionário é de 40 horas. O
* funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo
* é o valor da hora regular com um acréscimo de 50%.
* 
* Desenvolva um sistema que leia o número de horas trabalhadas em um mês, o
* salário por hora e escreva o salário total do funcionário, que deverá ser
* acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês
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

		System.out.println(nomeFuncionario + ", Qual o valor do seu Salário atual? ");
		valorSalario = Scan.nextInt();

		System.out.println(nomeFuncionario + ", Você fez hora extra? (1 = Sim / 2 = Não) ");
		horaExtraPergunta = Scan.nextInt();

		horaSalario = valorSalario / 40;

		if (horaExtraPergunta == 1) {

			System.out.println(" Quantas horas extras foram no total desse mês? ");
			horaExtra = Scan.nextInt();

			horaExtraConta = (horaSalario * horaExtra) * 0.5;

			salarioTotal = (int) (horaExtraConta + valorSalario);

			System.out.println(nomeFuncionario + ", \n Seu Salário desse mês será de: R$" + salarioTotal
					+ " \n Valor da Hora Extra: R$" + horaExtraConta);

		} else {

			System.out.println(nomeFuncionario + ", \n Seu Salário desse mês será de: R$" + valorSalario
					+ " \n Valor da Hora Extra: R$" + horaExtraConta);
		}
	}
}
