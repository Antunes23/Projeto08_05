package estruturaPosCondicionada;

import java.util.Scanner;

public class NomeUsuario {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);


		String nome;
		int i = 1;


		System.out.println("Qual é o seu nome?");
		nome = ler.nextLine();

		while(i <=10){

			System.out.println(nome);
			System.out.println(i++);
		}
	}

}
