/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai17;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai17 {

    static int count = 0;

    public static void main(String[] args) {
        //abacaabaccabacabaabb
        //abacab
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chuoi T: ");
        String T= input.nextLine();
         System.out.println("Nhap chuoi P: ");
        String P= input.nextLine();
        if (vetCan(T,P)) {
            System.out.println("So phep tinh = " + count);
        } else {
            System.out.println("P khong xuat hien trong T");
            System.out.println("So phep tinh = " + count);
        }
    }

    static boolean vetCan(String T, String P) {

        for (int i = 0; i < T.length(); i++) {
            for (int j = 0; j < P.length();) {
                count++;
                System.out.println(P.charAt(j)+ " va "+ T.charAt(i+j));
                if (P.charAt(j) == T.charAt(i+j)) {
                    j++;
                    if (j == P.length()) {
                        System.out.println("vi tri xuat hien cua mau P : " + (i));
                        return true;
                    }
                }
                else{
                    break;
                }
            }

        }
        return false;
    }
}
