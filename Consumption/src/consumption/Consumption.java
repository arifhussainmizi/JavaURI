
package consumption;

import java.util.Scanner;

public class Consumption {

   
    public static void main(String[] args) {
       
        int x; float o, m;
        Scanner s = new Scanner (System.in);
        x = s.nextInt(); o = s.nextFloat();
        
        m = x/o;
        System.out.printf("%.3f km/l\n", m);
    }
    
}
