
package area;

import java.util.Scanner;

public class Area {

   
    public static void main(String[] args) {
        
        double a, b, c, t, ce, tr, sq, re;
        Scanner s = new Scanner(System.in);
        
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        
        t = 0.5*a*c;
        ce = 3.14159*c*c;
        tr = 0.5*(a+b)*c;
        sq = b*b;
        re = a*b;
        
        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n", t, ce, tr, sq, re);
        
        
    }
    
}
