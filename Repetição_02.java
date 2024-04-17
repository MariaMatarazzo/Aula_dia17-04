package aula_dia17;
import java.util.Scanner;
public class Repetição_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		int n, resultado;
		
		System.out.print ("Informe um numero para tabuada: ");
		n = ler.nextInt();
		
		for (int i=0; i <= 10 ; i++) {
			resultado= n*i;
			System.out.println(n+ "x" + i+ "= " + resultado);
		}
		ler.close();

	}

}
