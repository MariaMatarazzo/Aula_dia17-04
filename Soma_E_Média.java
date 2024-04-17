package aula_dia17;

import java.util.Scanner;

public class Soma_E_Média {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		double nota1,nota2,nota3,nota4,nota5,media;
		
		
		for (int i=0; i <= 10 ; i++) {
			System.out.println("  ");
			System.out.print("informe a primeira nota: ");
			nota1 = ler.nextInt();

			System.out.print("informe a segunda nota: ");
			nota2 = ler.nextInt();

			System.out.print("informe a terceira nota: ");
			nota3 = ler.nextInt();

			System.out.print("informe a quarta nota: ");
			nota4 = ler.nextInt();
			
			System.out.print("informe a quinta nota: ");
			nota5 = ler.nextInt();
			
			System.out.println(" ");
			media = (nota1+nota2+nota3+nota4)/4;
			System.out.println(" A media do aluno é:  " + media);
			System.out.println("  ");
			System.out.println(">>>>>>>>>>>> Calcule a proxima media <<<<<<<<<<<<<  ");
			
		}
		ler.close();


	}

}
