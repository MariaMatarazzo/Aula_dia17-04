package aula_dia17;
import java.util.Scanner;
public class NumeroImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		int intervalo ;
		
		System.out.print ("Informe o numero final desejado:  ");
		intervalo = ler.nextInt();
		
		for (int i=0; i <= intervalo ; i++) {
			
	
			if ( i%2!=0) {
		
				System.out.println("Numeros impares desse numero: " +i );
		}
		ler.close();

		}
	}
}


