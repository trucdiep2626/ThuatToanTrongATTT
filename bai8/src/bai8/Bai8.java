/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai8 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a, p, d, x, y, x1, x2, u, v, q, r;
        do {
            System.out.print("Nhập p: ");
            p = input.nextInt();
            System.out.print("Nhập a: ");
            a = input.nextInt();
        } while (a < 1 || a >= (p - 1));
        x2 = 0;
        x1 = 1;
        u = a;
        v = p;
        while (u != 1) {
            //  System.out.printf("%10d %10d\n",v,u);
            q = (int) v / u;
            r = v - q * u;
            x = x2 - q * x1;
            v = u;
            u = r;
            x2 = x1;
            x1 = x;
            // System.out.printf("%10d%10d%10d%10d%10d%10d%10d\n",q,r,x,u,v,x2,x1);
        }
        System.out.printf("a^-1 mod p = %4d", x1 > 0 ? x1 % p : p + x1);
    }
}
