package aula_dia17;

import java.util.Scanner;

public class Repetição03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler =  new Scanner ( System.in);
		String name;
		
		for (int i=0; i<6;i++) {
			
			System.out.print(" Digite seu nome: ");
			name = ler.next();
			System.out.println (" Seu nome é "+name );
		}
			ler.close();
		

	}

}
