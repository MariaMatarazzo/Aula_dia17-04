package aula_dia17;
import java.util.Scanner;
public class Repetição01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler =  new Scanner ( System.in);
		int n;
		
		System.out.print(" Digite um numero maior que zero: ");
		n = ler.nextInt();
		
		for (int i = 0; i <= n; i++){
			System.out.println (" O numero "+ i);
			ler.close();
		}

	}

}
