package clase3ejercicio2;



public class Clase3ejercicio2
{
    
    
    public static String theLetter(int a) {
        char myVar;
        String texto = "theLastOfUs";
        String myNewArray = "";
        

        for (int i = 0; i < texto.length(); i++) {
           myVar = (char)(texto.charAt(i) + a );
          myNewArray += myVar;
            
        }

        return myNewArray;

    }
    
    
    
    
    
      public static void main( String[] args )  {
        String myNewArray = theLetter(3);
        System.out.println(myNewArray);
        
      
       
     

}

}