package com.muhammadfajarahadi.modul1.Tugas;

import java.util.Scanner;

public class KonversiSuhu {
    private double suhu,celcius,fahreinheit,kelvin,reamur;
    private int pilihan;

    public void menu(){
        System.out.println("Pilih suhu dari : ");
        System.out.println("1. Celcius ");
        System.out.println("2. Fahreinheit ");
        System.out.println("3. Kelvin ");
        System.out.println("4. Reamur ");
    }
    public void inputan(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Masukkan Pilihan : ");
        pilihan = scanner.nextInt();
        System.out.print("Masukkan Suhu : ");
        suhu = scanner.nextDouble();
        System.out.println("Konversi : ");
    }
    public void konversi(){
        switch (pilihan){
            case 1:
                celcius=suhu;
                System.out.println("Celcius     : "+celcius);
                fahreinheit=(celcius*1.8)+32;
                System.out.println("Fahreinheit : "+fahreinheit);
                kelvin=celcius+273;
                System.out.println("Kelvin      : "+kelvin);
                reamur=celcius*0.8;
                System.out.println("Reamur      :"+reamur);
                break;
            case 2:
                fahreinheit=suhu;
                System.out.println("Fahreinheit : "+fahreinheit);
                celcius=0.55*(fahreinheit-32);
                System.out.println("Celcius     : "+celcius);
                kelvin=0.55*(fahreinheit-32)+273;
                System.out.println("Kelvin      : "+kelvin);
                reamur=0.44/9*(fahreinheit-32);
                System.out.println("Reamur      :"+reamur);
                break;
            case 3:
                kelvin=suhu;
                System.out.println("Kelvin      : "+kelvin);
                celcius=kelvin-273;
                System.out.println("Celcius     : "+celcius);
                fahreinheit=1.8*(kelvin-273)+32;
                System.out.println("Fahreinheit : "+fahreinheit);
                reamur=0.8*(kelvin-273);
                System.out.println("Reamur      :"+reamur);
                break;
            case 4:
                reamur=suhu;
                System.out.println("Reamur      :"+reamur);
                celcius=1.25*reamur;
                System.out.println("Celcius     : "+celcius);
                fahreinheit=(0.25*reamur)+32;
                System.out.println("Fahreinheit : "+fahreinheit);
                kelvin=(1.25*reamur)+273;
                System.out.println("Kelvin      : "+kelvin);
                break;
            default:
                System.out.println("Coba lagi..");
        }
    }

        public static void main(String[] args) {
            KonversiSuhu Konversi = new KonversiSuhu();
            Konversi.menu();
            Konversi.inputan();
            Konversi.konversi();
        }

}
