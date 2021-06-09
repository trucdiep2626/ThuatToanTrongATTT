 
package bai10;

import java.util.Scanner;
import static javafx.scene.input.KeyCode.L;

 
public class Bai10 {
 
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
        System.out.print("Nhap n: ");
        long n= input.nextLong();
        long a=2L, b=2L,h;
        while(true)
        {
            a=(Math.abs((a*a+1)%n));
             b=Math.abs((b*b +1)%n); 
              b=Math.abs((b*b +1)%n); 
              h=gcd(a-b,n); 
              if((h>1) && ( h<n))
              {
                  System.out.printf(h+" Thanh cong");
                  break;
              }
              if(h==n)
              {
                  System.out.println("That bai");
                  break;
              }
        }
    }
    
    static long gcd(long a, long b)
    {
       long r;
          while (b>0) {      
             r=a>0?a%b:a+b;
             a=b;
             b=r;
          } 
     return a;
    }

   
    
    
}
