package Aulajava4;

import java.util.Scanner;

public class exerdowhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int numero;
int soma =0;

Scanner leia = new Scanner (System.in);

System.out.println("\n Digite um numero : ");
numero=leia.nextInt();

		do  {
			soma+=numero;
			System.out.println("\n Digite um numero : ");
			numero=leia.nextInt();
			
		}
		while (numero!=0);
		System.out.println("\n A soma dos numeros digitados é : "+soma);
	}
 
 

}
