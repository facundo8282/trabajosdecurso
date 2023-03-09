package clase3ejerciciob;



public class Clase3ejercicio1b
{
    public static int[] ordenNumeros(int a, int b, int c, String orden) {

       int temp, temp2;
       int numbers [] = new int [] {a, b, c};

        if (orden == "desc") {
            for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = 0; j < numbers.length - i - 1; j++) {
                    if (numbers[j] < numbers[j+1]) {
                         temp = numbers[j];
                       numbers[j] = numbers[j+1];
                        numbers[j+1] = temp;
                    }
                }
            }
             
        }

        else if (orden == "asc") {
            for(int k = 0; k < numbers.length - 1; k++) {
                for(int m = 0; m < numbers.length - k - 1; m++) {
                    if (numbers[m] > numbers[m+1]) {
                        temp2 = numbers[m];
                        numbers[m] = numbers[m+1];
                        numbers[m+1] = temp2;
        
                    }
        
                }
            }

        }

     


    
    
     
     return numbers;
       
             
    
}
    


    public static void main(String[] args) {
        int[] numbers = ordenNumeros(12, 2, 9, "asc");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
    
        }
        
    }
    
    

}
 


