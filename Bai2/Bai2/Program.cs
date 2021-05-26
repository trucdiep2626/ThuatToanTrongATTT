using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Bai2
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.OutputEncoding = Encoding.Unicode;
            Console.WriteLine("Nhập p: ");
            int p = Convert.ToInt32(Console.ReadLine());
   
            Console.WriteLine("Nhập W: ");
            int w = Convert.ToInt32(Console.ReadLine());
            int m = (int)Math.Log(p, 2) + 1;
            int t = m / w + 1;
            //đầu vào là mảng
            Console.WriteLine("Nhập mảng a");
            int[] a = new int[t];
            for (int i = 0; i <t; i++)
            {
                a[i] = Convert.ToInt32(Console.ReadLine());
            }
            Console.WriteLine("Nhập mảng b");
            int[] b = new int[t];
           for (int i = 0; i < t; i++)
            {
                b[i] = Convert.ToInt32(Console.ReadLine());
            }
            int[] c = new int[t];        
            int e = 0;
                for (int i = t-1; i>=0; i--)
            {
                c[i] = (a[i] + b[i]+e)%Convert.ToInt32(Math.Pow(2,w));
                e =(a[i] + b[i])>0 && (a[i] + b[i])< Convert.ToInt32(Math.Pow(2, w)) ? 0:1;
                Console.WriteLine(c[i]);   
            }
            //đầu vào là số
             Console.WriteLine("Nhập a: ");
            int a1 = Convert.ToInt32(Console.ReadLine());
            a = chuyenSoThanhMang(w, t, a1);
            Console.WriteLine("Nhập b: ");
            int b1 = Convert.ToInt32(Console.ReadLine());
            b = chuyenSoThanhMang(w, t, b1);
            e = 0;
            for (int i = 0; i<t; i++)
            {
                c[i] = (a[i] + b[i] + e) % Convert.ToInt32(Math.Pow(2, w));
                e = (a[i] + b[i]) > 0 && (a[i] + b[i]) < Convert.ToInt32(Math.Pow(2, w)) ? 0 : 1;
                Console.WriteLine(c[i]);
            }
            Console.ReadKey();
        }
        static int [] chuyenSoThanhMang(int w, int t, int a)
        {
            int[] a1 = new int[t];
            int tg = a;
            for (int i = t - 1; i >= 0; i--)
            {
                a1[i] = (a / (Convert.ToInt32(Math.Pow(2, i * w))));
                tg = Convert.ToInt32(a - a1[i] * (Math.Pow(2, i * w)));
                a = tg;
               Console.WriteLine("  " + a1[i]);
            }
            return a1;
        }
     
    }
}
