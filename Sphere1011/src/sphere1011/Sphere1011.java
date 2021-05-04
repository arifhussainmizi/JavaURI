
package sphere1011;

import java.util.Scanner;

public class Sphere1011 {

    
    public static void main(String[] args) {
       
        Scanner x = new Scanner (System.in);
        double r, result, pi = 3.14159;
        r = x.nextDouble();
        result = Math.pow(r, 3);
        result = (double) ((4.0/3)*pi*result);
        
        System.out.printf("VOLUME = %.3f\n", result);
        
        
    }
    
}
