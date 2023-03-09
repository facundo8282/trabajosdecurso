package terceraclase;

public class Clase3ejercicio1 {
	public static void main(String args[]) {
		int cont = cantidad("Texto", 't');

         System.out.println(cont);
    }
	
	
	
	
	public static int cantidad (String texto, char letra) {
		int cont = 0;

        for (char i : texto.toCharArray()) {
            if (i == letra) 
            	cont++;
        }
		return cont;
	}

}