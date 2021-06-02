/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai7 {

   static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int a,b,d,x,y,x1,x2,y1,y2,q,r;
        do {            
             System.out.print("Nhập a: ");
        a =input.nextInt();
        System.out.print("Nhập b: ");
        b =input.nextInt();
        } while (a<b);
      if(b==0)
      {
          d=a;
          x=1;
          y=0;
      }
      else
      {
          x2=1;
          x1=0;
          y1=1;
          y2=0;
          while (b>0) {              
              q=(int) a/b;
              r=a-q*b;
              x=x2-q*x1;
              y=y2-q*y1;
              a=b;
              b=r;
              x2=x1;
              x1=x;
              y2=y1;
              y1=y;
             // System.out.printf("%5d%5d%5d%5d%5d%5d%5d%5d%5d%5d\n",q,r,x,y,a,b,x2,x1,y2,y1);
          }
          d=a;
          x=x2;
          y=y2;
      }
        System.out.printf("d = %5d, x = %5d, y = %5d",d,x,y);
    }
    
}
