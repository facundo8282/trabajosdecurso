
//ejercicio1

package holamundo;

import java.util.Scanner;


public class Holamundo {
	public static void main(String args[]) {
		int numeroInicio = 5;
		int numeroFin = 14;
		Scanner entrada = new Scanner(System.in);
		int decision;
		System.out.println("ingrese 1 si desea impar, 2 si desea par");
		decision = entrada.nextInt();
		while (numeroInicio <= numeroFin) {
			if (decision == 2) { 
				if (numeroFin % 2 == 0) {
					for (numeroFin = 14; numeroFin >= numeroInicio; numeroFin--) {
					System.out.println(numeroFin);
					numeroFin--;
					
					
					}
				}
				
			}
			if (decision == 1) {
				System.out.println(numeroInicio);
				numeroInicio+=2;
			}
				
				
				

		}
	}
}


					
	
			
		

	



			
			
			
	
		 
	

		

	


