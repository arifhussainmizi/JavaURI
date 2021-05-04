
package salarywithbonus;

import java.util.Scanner;

public class SalaryWithBonus {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner x = new Scanner(System.in);
        
        String n;
        double s, sl, t;
        
        n = x.nextLine();
        s = x.nextDouble();
        sl = x.nextDouble();
        
        t = (double) (s + (sl*0.15));
        
       
        System.out.printf("TOTAL = R$ %.2f\n", t);
        
    }
    
}
