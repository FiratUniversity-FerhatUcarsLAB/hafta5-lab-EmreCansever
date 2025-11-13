/*
 * Ad Soyad: [Emre Cansever]
 * Ogrenci No: [250541060]
 * Tarih: [13.11.2025]
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */

import java.util.Scanner;

public class Fizikhesap {
    public static double hızhesap(double m, double t){
        return m/t;
    }
    public static double ivmehesap(double v, double t){
        return v/t;
    }
    public static double kuvvethesap(double m, double a){
        return m*a;
    }
    public static double ishesap(double f,double d){
        return f*d;
    }
    public static double potenhesap(double m, double h){
        final double g= 9.18;
        return m*h*g;
    }
    public static double kienhesap(double m, double v){
        return m*v*0.5;
    }
    public static double momentumhesap(double m, double v){
        return m*v;
    }
    public static void main(String[] args) {
        Scanner nicelik = new Scanner(System.in);
        System.out.print("Hesaplamak istediğiniz niceliği seçiniz: \n" + "(Hız,İvme,Kuvvet,İş,Güç,Enerji,Momentum) \n");
        String secilennicelik = nicelik.nextLine();

        if("hız".equals(secilennicelik)){
            Scanner ms= new Scanner(System.in);
            System.out.println("Lütfen yer değiştirmeyi giriniz:" + "  ");
            double m = ms.nextDouble();
            System.out.println("Lütfen zamanı giriniz:" + "  ");
            double t= ms.nextDouble();

            double hiz= hızhesap(m, t);
            System.out.printf("Hız(m/s): %.2f", hiz);
        }
        if ("İvme".equals(secilennicelik)){
            Scanner vt= new Scanner(System.in);
            System.out.println("Lütfen hız değeri giriniz:" + "  ");
            double v = vt.nextDouble();
            System.out.println("Lütfen zamanı giriniz:" + "  ");
            double t= vt.nextDouble();

            double ivme= ivmehesap(v, t);
            System.out.printf("İvme(v/t): %.2f", ivme);
        }
        if ("Kuvvet".equals(secilennicelik)){
            Scanner ma= new Scanner(System.in);
            System.out.println("Lütfen kütle giriniz:" + "  ");
            double m = ma.nextDouble();
            System.out.println("Lütfen ivme değerini giriniz:" + "  ");
            double a= ma.nextDouble();

            double kuvvet= kuvvethesap(m, a);
            System.out.printf("Kuvvet(m x a): %.2f", kuvvet);
        }
        if ("İş".equals(secilennicelik)){
            Scanner fd= new Scanner(System.in);
            System.out.println("Lütfen kuvvet değerini giriniz:" + "  ");
            double f = fd.nextDouble();
            System.out.println("Lütfen yer değiştirmeyi giriniz:" + "  ");
            double d= fd.nextDouble();

            double is= ishesap(f, d);
            System.out.printf("İş(Fxd)= %.2f", is);
        }
        if ("Güç".equals(secilennicelik)){
            Scanner mvh= new Scanner(System.in);
            System.out.println("Lütfen hız değerini giriniz:" + "  ");
            double v = mvh.nextDouble();
            System.out.println("Lütfen kuvvet değerini giriniz:" + "  ");
            double m= mvh.nextDouble();
            System.out.println("Lütfen yüksekliği giriniz:" + "  ");
            double h= mvh.nextDouble();

            double poten= potenhesap(m, h);
            double kien= kienhesap(m, v);
            double topen= poten+kien;
            System.out.printf("Potansiyel Enerji: %.2f", poten);
            System.out.printf("Kinetik Enerji: %.2f", kien);
            System.out.printf("Toplam Enerji: %.2f", topen);
        }
        if("Momentum".equals(secilennicelik)){
            Scanner mv= new Scanner(System.in);
            System.out.println("Lütfen Hız Değerini Giriniz:" + "  ");
            double v = mv.nextDouble();
            System.out.println("Lütfen Kütle Değerini Giriniz:" + "  ");
            double m= mv.nextDouble();

            double momentum= momentumhesap(m, v);
            System.out.printf("Momentum(P): %.2f", momentum);

            Scanner sonuc= new Scanner(System.in);
        }
    }
}
