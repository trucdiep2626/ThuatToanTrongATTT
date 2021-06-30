/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Nhap n: ");
        int n = input.nextInt();
        System.out.println(laSoCarmichael(n));
        }
    }

  static boolean laSoCarmichael(int n) {
        if (laSoNguyenTo(n) == false) {
            for (int i = 2; i < n; i++) {

                if (gcd(i, n) == 1) {
                    if ((power(i, n - 1, n)) != 1) {
                        return false;
                    }

                    if (phanTichRaThuaSo(n) < 3) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }


    static int power(int x, int y, int mod) {
        if (y == 0) {
            return 1;
        }
        int tmp = power(x, y / 2, mod) % mod;
        tmp = (tmp * tmp) % mod;
        if (y % 2 == 1) {
            tmp = (tmp * x) % mod;
        }
        return tmp;
    }

    static int gcd(int a, int b) {
        if (a < b) {
            return gcd(b, a);
        }
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }

    static int phanTichRaThuaSo(int n) {
        List<Integer> a = new ArrayList<Integer>();
        List<Integer> thuaSo = new ArrayList<Integer>();
        if (laSoNguyenTo(n)) {
            return 0;
        } else {

            int p = 2;
            for (int i = 0; i <= (int) Math.sqrt(n); i++) {
                a.add(p++);
            }
            int k = 0;
            do {
                p = (int) a.get(k);
                for (int i = k + 1; i < a.size(); i++) {
                    if ((double) a.get(i) % p == (double) 0) {
                        a.remove(i);
                        i--;
                    }
                }
                k++;

            } while (k != a.size());
            int c, d, m = n, i = 0;
            while (i < a.size()) {
                if (m % a.get(i) == 0) {
                    c = a.get(i);
                    d = m / a.get(i);
                    thuaSo.add(c);
                    if (laSoNguyenTo(d)) {
                        thuaSo.add(d);
                        break;

                    } else {
                        m = d;
                    }
                } else {
                    i++;
                }
            }

        }
        return thuaSo.size();
    }

    static boolean laSoNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
