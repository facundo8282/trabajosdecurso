package clase3ejercicio2;

public class App 
{
    public static void main( String[] args )
    {
        public static String codificar(String cadena, int desplazamiento) {
            String resultado = "";
            
            for (int i = 0; i < cadena.length(); i++) {
                char caracter = cadena.charAt(i);
                
                if (Character.isUpperCase(caracter)) {
                    caracter = (char) (((int) caracter + desplazamiento - 65) % 26 + 65);
                } else if (Character.isLowerCase(caracter)) {
                    caracter = (char) (((int) caracter + desplazamiento - 97) % 26 + 97);
                }
                
                resultado += caracter;
            }
            
            return resultado;
        }
        
        public static String decodificar(String cadena, int desplazamiento) {
            return codificar(cadena, 26 - desplazamiento);
        }
        
        public static void main(String[] args) {
            String cadena = "Hola, mundo!";
            int desplazamiento = 3;
            
            String codificada = codificar(cadena, desplazamiento);
            String decodificada = decodificar(codificada, desplazamiento);
            
            System.out.println("Cadena original: " + cadena);
            System.out.println("Cadena codificada: " + codificada);
            System.out.println("Cadena decodificada: " + decodificada);
        }
    }
}
