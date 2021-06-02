/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai6 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập p: ");
        int p = input.nextInt();
        System.out.print("Nhập w: ");
        int w = input.nextInt();
        int m = (int) (Math.log((double) p) / Math.log((double) 2)) + 1;
        int t = m / w + 1;
        System.out.print("Nhập a: ");
        int[] a = chuyenSoThanhMang(w, t, input.nextInt());
        System.out.print("Nhập b: ");
        int[] b = chuyenSoThanhMang(w, t, input.nextInt());
        int[] c = new int[2 * t];
        for (int i = 0; i < c.length; i++) {
            c[i] = 0;
        }
        int u=0,v=0;
        for (int i = 0; i < t; i++) {
            u=0;
            for (int j = 0; j < t; j++) {
                int k=c[i+j]+a[i]*b[j]+u;
                u=k/256;
                v=k%256;
                c[i+j]=v;
            }
            c[i+t]=u;
        }
        for (int i = c.length-1; i >=0; i--) {
            System.out.printf("%5d",c[i]);
        }
        
    }

    static int[] chuyenSoThanhMang(int w, int t, int a) {
        int[] a1 = new int[t];
        int tg = a;
        for (int i = t - 1; i >= 0; i--) {
            a1[i] = (a / (int) ((Math.pow(2, i * w))));
            tg = (int) (a - a1[i] * (Math.pow(2, i * w)));
            a = tg;
            System.out.print("  " + a1[i]);
        }
        System.out.println("");
            
        
        return a1;
    }
}
