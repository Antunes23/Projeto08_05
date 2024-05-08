package estruturaPosCondicionada;

import java.util.Scanner;

public class MaiorDeIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);

		int i = 1;
		int idade;
		
		
		
		while(i < 20) {
			System.out.println(i++);
			System.out.println("Digite sua idade");
			idade = ler.nextInt();
			
			if (idade >= 18) {
				System.out.println("Você é maior de idade");
			}else 
				System.out.println("Você é menor de idade");
		
	}
	

}
}
