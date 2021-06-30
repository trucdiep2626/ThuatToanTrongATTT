/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai16;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai16 {

   static int count=0;
    public static void main(String[] args) {
        //abcaabacabaca
        //aba
        //abacaabaccabacabaabb
        //abacab
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chuoi T: ");
        String T= input.nextLine();
         System.out.println("Nhap chuoi P: ");
        String P= input.nextLine();
        if(KMP(T,P))
            System.out.println("So phep tinh = "+ count);
        else
        {
            System.out.println("P khong xuat hien trong T");
            System.out.println("So phep tinh = "+ count);
        }
    }
    static int [] tienXuLi(String P)
    {
        int []f= new int[P.length()];
        int len=0;
        int i=1;
        f[0]=0;
        
        while (i<P.length()) {
            if(P.charAt(i) == P.charAt(len))
            {
                len++;
                f[i]=len;
                i++;
            }
            else{
                if(len!=0)
                {
                    len=f[len-1];
                }
                else
                {
                    f[i]=len;
                    i++;
                }
            }         
        }
        return f;
    }
    
    static boolean KMP(String T, String P)
    {
        int []f= tienXuLi(P);
        int j=0;
        int i=0;
//        for(int k=0;k<f.length;k++)
//        {
//            System.out.print(" "+f[k]);
//        }
        while(i<T.length())
        {
            count++;
           // System.out.println( (j)+" va "+ (i));
            System.out.println(P.charAt(j)+" va "+T.charAt(i));
            if(P.charAt(j)==T.charAt(i))
            {
                i++;j++;
                 if(j==P.length())
            {
                System.out.println("vi tri xuat hien cua mau P : " +(i-j) );
               return true;
            }
            }
           
            else if(i<T.length() && P.charAt(j)!= T.charAt(i)){
                if(j!=0)
                {
                    j=f[j-1];
                }
                else
                {
                    i++;
                }
                
            }
        }
        return false;
    }
}
