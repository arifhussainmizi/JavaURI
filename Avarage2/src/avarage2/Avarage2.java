
package avarage2;

import java.util.Scanner;

public class Avarage2 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner x = new Scanner(System.in);
        
        float a, b, c, r;
        a = x.nextFloat();
        b = x.nextFloat();
        c = x.nextFloat();
        
        r = (float) ((a*2+b*3+c*5)/(2+3+5));
        
        System.out.printf("%.1f\n", r);
       
        
    }
    
}
