/*
 * Ad Soyad: EMRE CANSEVER
 * Ogrenci No: 250541060
 * Tarih: 11.11.2025
 * Aciklama: Gorev 1 - Geometrik Sekil Hesaplayici
 * 
 * Bu program temel geometrik sekillerin alan ve
 * cevre hesaplamalarini yapar.
 */

import java.util.Scanner;

public class Main {
    public static double kare(double n) {
        return n*n;
    }
    public static double karecevre(double n) {
        return n*4;
    }
    public static double dikdortgenalan(double n1, double n2) {

        return n1*n2;
    }
    public static double dikdortgencevre(double n1, double n2) {
        return n1*n2;
    }
    public static double ucgenalan(double a1, double a2){
        return a1*a2/2;
    }
    public static double ucgencevre(double a1, double a2, double a3) {
        return a1+a2+a3;
    }
    public static double dairealan(double r){
        return r*java.lang.Math.PI*Math.PI;
    }
    public static double dairecevre(double r){
        return r*java.lang.Math.PI*2;
    }

    public static void main(String[] args) {
        Scanner kenar1= new Scanner(System.in);
        System.out.println("Kare için bir kenar uzunluğu giriniz:");
        double n = kenar1.nextDouble();
        Scanner kenar2= new Scanner(System.in);
        System.out.println("Dikdörtgen için iki kenar giriniz");
        double n1= kenar2.nextDouble();
        double n2= kenar2.nextDouble();
        Scanner yukstaban = new Scanner(System.in);
        System.out.println("Üçgen için üç kenar belirleyin:");
        double a1= yukstaban.nextDouble();
        double a2 =yukstaban.nextDouble();
        double a3= yukstaban.nextDouble();
        Scanner yaricap= new Scanner(System.in);
        System.out.println("Bir yarıçap belirleyin;");
        double r= yaricap.nextDouble();
        


        double kalan= kare(n);
        double kcevre= karecevre(n);
        double dalan= dikdortgenalan(n1, n2);
        double dcevre= dikdortgencevre(n1, n2);
        double daalan= dairealan(r);
        double dacevre= dairecevre(r);
        double Ualan= ucgenalan(a1, a2);
        double Ucevre= ucgencevre(a1, a2, a3);


        System.out.println("----------------");
        System.out.println(" HESAPLAMALAR   ");
        System.out.println("----------------");
        System.out.printf("Kare Alanı: %.2f\n", kalan);
        System.out.printf("Kare Çevresi: %.2f\n", kcevre);
        System.out.printf("Dikdörtgen Alanı: %.2f\n", dalan);
        System.out.printf("Dikdörtgen Çevresi: %.2f\n", dcevre);
        System.out.printf("Daire Alanı: %.2f\n", daalan);
        System.out.printf("Daire Çevresi: %.2f\n", dacevre);
        System.out.printf("Üçgen Alanı: %.2f\n", Ualan);
        System.out.printf("Üçgen Çevresi: %.2f\n", Ucevre);
    }
}
