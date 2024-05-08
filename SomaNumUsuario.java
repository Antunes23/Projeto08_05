package estruturaPosCondicionada;

import java.util.Scanner;

public class SomaNumUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);

		int i = 1;
		int num = 0;
		while (i <=10){
		System.out.println(i++);	
			System.out.println("Escreve um número: ");
			num += ler.nextInt();
			
			System.out.println("A soma dos números é " + num);
			

		}
	}
}
