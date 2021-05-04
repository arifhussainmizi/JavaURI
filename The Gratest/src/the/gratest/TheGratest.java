
package the.gratest;

import java.util.Scanner;

public class TheGratest {

    
    public static void main(String[] args) {
        
        int a, b, c, g = 0;
        Scanner x = new Scanner(System.in);
        
        a = x.nextInt(); b= x.nextInt(); c = x.nextInt();
        
        if(a<b || a<c){
            if(b<c)
            g = c;
            else
                g=b;
        }else{
            g = a;
        }
        System.out.printf("%d eh o maior\n", g);
    }
    
}
