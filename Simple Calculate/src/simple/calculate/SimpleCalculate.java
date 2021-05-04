
package simple.calculate;

import java.util.Scanner;

public class SimpleCalculate {

   
    public static void main(String[] args) {
       
        int c1, c2, u1, u2;
        float p1, p2, total;
        
        Scanner x = new Scanner (System.in);
        
        c1 = x.nextInt(); 
        u1 = x.nextInt();
        p1 = x.nextFloat();
        
        c2 = x.nextInt(); 
        u2 = x.nextInt();
        p2 = x.nextFloat();
        
        total = u1*p1 + u2*p2;
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
        
        
    }
    
}
