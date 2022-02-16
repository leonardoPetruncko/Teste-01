import java.util.Scanner;

 /* 8-Crie um programa que receba um número inteiro de 1 a 100 e mostre
	na tela o número por extenso. */

public class a8 {

	public static void main(String[] args) {

		int num;

		Scanner Scan = new Scanner(System.in);

		System.out.println(" Digite um numero de 0 a 100. ");
		num = Scan.nextInt();

		for (num = num; num <= 100; num++) {

			System.out.println(num);
		}
	}
}
