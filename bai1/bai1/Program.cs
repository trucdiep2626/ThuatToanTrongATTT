using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace bai1
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.OutputEncoding = Encoding.Unicode;
            Console.WriteLine("Nhập p: ");
            int p = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Nhập a: ");
            int a = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Nhập W: ");
            int w= Convert.ToInt32(Console.ReadLine());
            int m = (int)Math.Log(p, 2)+1;
            int t=m/w +1;
            chuỷenSoThanhMang(w, t, a);
            Console.WriteLine(chuyenMangThanhSo(w,t));
            Console.ReadKey();
        }
        static void chuỷenSoThanhMang(int w, int t, int a)
        {
            int[] a1 = new int[t];
            int tg= a;
            for (int i = t - 1; i >= 0; i--)
            {
                a1[i] = (a / (Convert.ToInt32(Math.Pow(2, i * w))));
                tg = Convert.ToInt32(a - a1[i] * (Math.Pow(2, i * w)));
                a = tg;
                Console.WriteLine("  " + a1[i]);
            }
        }
        static int chuyenMangThanhSo(int w, int t)
        {
            int a = 0;
            int[] a1 = new int[t];
            for (int i = t-1; i >=0; i--)
            {
                a1[i]= Convert.ToInt32(Console.ReadLine());
                a += (Convert.ToInt32(Math.Pow(2, i * w))) * a1[i];
            }
            return a;
        }
    }
}
