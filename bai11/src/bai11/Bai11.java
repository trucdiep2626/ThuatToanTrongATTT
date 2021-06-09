package bai11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = input.nextInt();
        if (laSoNguyenTo(n)) {
            System.out.println(n + "la so nguyen to");
        } else {
            List<Integer> a = new ArrayList<Integer>();
            List<Integer> coSo = new ArrayList<Integer>();
            List<Integer> soMu = new ArrayList<Integer>();
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
            int c, d, m = n,i=0;
            while (  i < a.size() ) {
                if (m % a.get(i) == 0) {
                    c = a.get(i);
                    d = m / a.get(i); 
                    if (coSo.contains(c)) {
                        soMu.set(coSo.indexOf(c), soMu.get(coSo.indexOf(c)) + 1);
                    } else {
                        coSo.add(c);
                        soMu.add(1);
                    }
                    if (laSoNguyenTo(d)) {
                        if (coSo.contains(d)) {
                            soMu.set(coSo.indexOf(d), soMu.get(coSo.indexOf(d)) + 1);
                        } else {
                            coSo.add(d);
                            soMu.add(1);
                        }
                        break;
                    } else {
                        m = d;
                    }
                }
                else
                {
                    i++;
                }
            }
            System.out.println("Co so = " + coSo.toString());
            System.out.println("So mu = " + soMu.toString());

        }
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
