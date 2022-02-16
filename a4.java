
/*  4 - Crie um programa que leia 2 valores (x e y), que devem representar as
 	coordenadas de um ponto em um plano. A seguir, determine qual o
 	quadrante ao qual pertence o ponto, ou se está sobre um dos eixos
 	cartesianos ou na origem (x=y=0). */


import java.util.Scanner;

public class a4 {

	public static void main(String[] args) {

		Scanner Scan = new Scanner(System.in);
		double x, y;
		
		x = Scan.nextDouble();
		y = Scan.nextDouble();

		if ((x == 0) & (y == 0)) {
			System.out.println("Origem");
		}
		else if (y == 0) {
			System.out.println("Eixo X");
		}
		else if (x == 0) {
			System.out.println("Eixo Y");
		}
		else if ((x > 0) & (y > 0)) {
			System.out.println("A1");
		}
		else if ((x < 0) & (y > 0)) {
			System.out.println("A2");
		}
		else if ((x < 0) & (y < 0)) {
			System.out.println("A3");
		}
		else if ((x > 0) & (y < 0)) {
			System.out.println("A4");
		}

    }
}
		