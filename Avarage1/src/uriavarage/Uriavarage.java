
package uriavarage;

import java.util.Scanner;


public class Uriavarage {

    
    public static void main(String[] args) {
          
        Scanner reader = new Scanner (System.in);
        float a = reader.nextFloat();
        Scanner reader2 = new Scanner (System.in);
        float b = reader2.nextFloat();
        
        float result = (float) (((a*3.5)+(b*7.5))/(3.5+7.5)); 
        
        System.out.printf("MEDIA = %.5f\n", result);
    }
    
}
