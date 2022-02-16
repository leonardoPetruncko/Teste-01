import java.util.Random;
import java.util.Scanner;


/* 10-Márcia se inscreveu em uma rede social para se manter em contato
	com seus amigos. A página de cadastro exigia o preenchimento dos
	campos de nome e senha, porém a senha precisa ser forte. O site
	considera uma senha forte quando ela satisfaz os seguintes critérios: */

public class a10 {

	public static void main(String[] args) {


		Scanner Scan = new Scanner(System.in);
		
		String senha = null;
		
		System.out.println(" === SENHA FORTE === ");
		System.out.println();
		System.out.println(" DIGITE UMA SENHA COM 6 DIGITOS ");
		senha = Scan.next();
		
		Random random1 = new Random();

        String setOfCharacters1 = "1234567890";

        int randomInt = random1.nextInt(setOfCharacters1.length());
        char randomChar1 = setOfCharacters1.charAt(randomInt);
        
        Random random2 = new Random();

        String setOfCharacters2 = "abcdefghijklmnopqustvwyz";

        int randomInt2 = random2.nextInt(setOfCharacters2.length());
        char randomChar2 = setOfCharacters2.charAt(randomInt);

        Random random3 = new Random();

        String setOfCharacters3 = " !@#$%¨&*()_+{`Ç^}{?:><\\| ";

        int randomInt3 = random3.nextInt(setOfCharacters3.length());
        char randomChar3 = setOfCharacters3.charAt(randomInt);
        
        Random random4 = new Random();

        String setOfCharacters4 = " ABCDEFGHIJKLMNOPQUVTSWYZ ";

        int randomInt4 = random4.nextInt(setOfCharacters4.length());
        char randomChar4 = setOfCharacters4.charAt(randomInt);
       
        System.out.println();
        System.out.println(" PARA SUA SENHA FICAR FORTE ADICIONE: \n" + randomChar1 + "\n" + randomChar2 + "\n" + randomChar3 + "\n" + randomChar4);
        System.out.println();
        
        // Poderia ter criado um método que recebe uma String, adiciona e a retorna:
        // acabou meu tempo ;-;
	  }
	}
