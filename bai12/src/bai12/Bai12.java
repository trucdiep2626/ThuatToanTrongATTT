/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        for (int i = 0; i < 3; i++) {
              System.out.print("Nhap n: ");
        int n = input.nextInt();
        int t = 2;
        int a =  r.nextInt(n-2)+2;
        List<Integer> k = new ArrayList<Integer>();
        k = phanTich(n - 1);
        System.out.println(fermat(a, k, t, n));
        }
      
    }

    static List phanTich(int n) {
        List<Integer> a = new ArrayList<Integer>();
        do {
            a.add(n % 2);
            n = n / 2;
        } while (n != 0);
        return a;
    }

    static String fermat(int a, List k, int t, int n) {
        for (int i = 1; i <= t; i++) {
            if (nhanBinhPhuongCoLap(a, k, t, n) != 1) {
                return "Hop so";
            }
        }
        return "Nguyen to";
    }

    static int nhanBinhPhuongCoLap(int a, List k, int t, int n) {
        int b = 1;
        if (n - 1 == 0) {
            return b;
        }
        int A = a;
        if ((int) k.get(0) == 1) {
            b = a;
        }
        for (int i = 0; i < k.size(); i++) {
            A = A * A % n;
            if ((int) k.get(i) == 1) {
                b = (A * b) % n;
            }
        }
        return b;
    }

}
