
package distance.two.points;

import java.util.Scanner;

public class DistanceTwoPoints {

    
    public static void main(String[] args) {
        
        float x1, x2, y1, y2, d;
        Scanner s = new Scanner(System.in);
        
        x1 = s.nextFloat(); y1 = s.nextFloat();
        x2 = s.nextFloat(); y2 = s.nextFloat();
        
        d = (float)((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        d = (float) Math.sqrt(d);
        
        System.out.printf("%.4f\n", d);
        
    }
    
}
