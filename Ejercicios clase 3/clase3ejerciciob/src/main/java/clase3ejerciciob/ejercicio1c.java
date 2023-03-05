package clase3ejerciciob;

public class App 
{
    public static int[] ordenarNumeros(int num1, int num2, int num3, String orden) {
        int[] numeros = {num1, num2, num3};
        
        if (orden.equalsIgnoreCase("ascendente")) {
            Arrays.sort(numeros);
        } else if (orden.equalsIgnoreCase("descendente")) {
            Arrays.sort(numeros);
            int temp = numeros[0];
            numeros[0] = numeros[2];
            numeros[2] = temp;
        }
        
        return numeros;
    }
    
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 1;
        int num3 = 2;
        String orden = "ascendente";
        
        int[] numerosOrdenados = ordenarNumeros(num1, num2, num3, orden);
        
        System.out.println(Arrays.toString(numerosOrdenados));
    }

	}


