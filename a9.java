import java.util.Scanner;

	/* 9-Uma revendedora de carros usados paga a seus funcion�rios
	vendedores um sal�rio fixo por m�s, mais uma comiss�o tamb�m fixa para
	cada carro vendido e mais 5% do valor das vendas por ele efetuadas. Crie
	um programa que leia o n�mero de carros por ele vendidos, o valor total
	de suas vendas, o sal�rio fixo e o valor que ele recebe por carro vendido.
	Calcule e escreva o sal�rio final do vendedor */

public class a9 {

	public static void main(String[] args) {

		String nomeFuncionario;
		int valorSalario, comissaoFixa, carrosVendidos, valorVendas;
		double contaValorVendas, contaComissao, contaSalarioTotal;

		Scanner Scan = new Scanner(System.in);

		System.out.println(" Qual o seu nome? ");
		nomeFuncionario = Scan.next();

		System.out.println(nomeFuncionario + ", Qual o valor do seu Sal�rio atual? ");
		valorSalario = Scan.nextInt();

		System.out.println(nomeFuncionario + ", Qual o valor da Comiss�o Fixa? ");
		comissaoFixa = Scan.nextInt();

		System.out.println(nomeFuncionario + ", Quantos Carros voc� vendeu esse m�s? ");
		carrosVendidos = Scan.nextInt();

		System.out.println(" Qual foi o valor Total das Vendas? ");
		valorVendas = Scan.nextInt();

		contaComissao = comissaoFixa * carrosVendidos;

		contaValorVendas = valorVendas * 0.05;

		contaSalarioTotal = valorSalario + contaComissao + contaValorVendas;

		System.out.println(nomeFuncionario + ", \n Voc� ir� receber esse m�s: R$" + contaSalarioTotal
				+ ". \n Valor da Comiss�o: R$" + contaComissao + " \n Valor das Vendas: R$" + contaValorVendas);

	}
}