package clase3ejercicio1c;

public class App 
{
    public static int sumarNumerosMayoresQueX(int[] numeros, int x) {
        int suma = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > x) {
                suma += numeros[i];
            }
        }
        
        return suma;
    }
    
    public static void main(String[] args) {
        int[] numeros = {3, 7, 1, 8, 4, 2};
        int x = 4;
        
        int suma = sumarNumerosMayoresQueX(numeros, x);
        
        System.out.println("La suma de los números mayores que " + x + " es " + suma);
    }
}
