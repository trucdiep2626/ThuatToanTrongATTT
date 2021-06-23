/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai15;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap chuoi T: ");
        String t = input.nextLine();
        System.out.print("Nhap chuoi P: ");
        String p = input.nextLine();
        List<Character> P = new ArrayList<Character>();
        List<Integer> l = new ArrayList<Integer>();
        for (int i = 0; i < t.length(); i++) {
            if (P.contains(t.charAt(i)) == false) {
                P.add(t.charAt(i));
                for (int j = p.length() - 1; j >= 0; j--) {
                    if (p.charAt(j) == t.charAt(i)) {
                        l.add(j);
                        break;
                    }
                    if (j == 0) {
                        l.add(-1);
                    }
                }

            }
            //a pattern matching algorithm
            //rithm 
            //abacaabadcabacabaabb
            //abacab
        }
     //   System.out.println(P.toString());
       // System.out.println(l.toString());
        int j = p.length() - 1;
        int i = p.length() - 1;
        int count = 0, viTri = -1;

        while (i < t.length()) {
            count++;
            while (p.charAt(j) == t.charAt(i)) {
                 System.out.println(p.charAt(j) + "   " + t.charAt(i));
                count++;
                j--;
                i--;
                if (j == 0) {
                    viTri = i;
                    break;
                }

            }
            if (j == 0) {
                break;
            }
//            System.out.println(j + "  " + i);
            System.out.println(p.charAt(j) + "   " + t.charAt(i));
//            System.out.println("L(x)=" + l.get(P.indexOf(t.charAt(i))));

            i = i + p.length() - Math.min(j, 1 + l.get(P.indexOf(t.charAt(i))));
          //  System.out.println("i=" + i);
            j = p.length() - 1;
        }
        System.out.println("So lan lap = "+count);
        if(viTri==-1)
            System.out.println("Khong tim thay");
        else
            System.out.println("P xuat hien o vi tri "+ viTri);
    }
}
