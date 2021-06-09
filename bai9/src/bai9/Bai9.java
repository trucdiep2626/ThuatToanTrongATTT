 package bai9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai9 {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = input.nextInt();
       List<Integer> a=new ArrayList <Integer>();
        int p=2;
        for (int i = 0; i < n-1; i++) {
            a.add(p);
            p++;
        }
        int k=0;
        do{
            p=  (int) a.get(k);
            for (int i = k+1; i < a.size(); i++) {
                if((double)a.get(i) % p == (double)0 )
                {
                    a.remove(i);
                    i--;
                }
            }
            k++;
         
        }while(k != a.size());
        System.out.println(a.toString());
    }
    
}
