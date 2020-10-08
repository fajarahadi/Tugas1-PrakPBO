package com.muhammadfajarahadi.modul1.Tugas;

public class Karyawan {
    private static String nama = "Muhammad Fajar Ahadi";
    private static String alamat = "Cirebon";
    private static String jabatan = "Software engineer";
    private static String Kelamin  = "Laki-laki";

    private static int Umur(){
        int umur = 19;
        return umur;
    }
    private static int Nik(){
        int nik = 123123;
        return nik;
    }
    private static int Notelp(){
        int telp = 123222222;
        return telp;
    }

    public static void main(String[] args) {
        System.out.println("\nBIODATA KARYAWAN");
        System.out.println("NIK           : "+Nik());
        System.out.println("Nama          : "+nama);
        System.out.println("Umur          : "+Umur());
        System.out.println("Jenis Kelamin : "+Kelamin);
        System.out.println("Alamat        : "+alamat);
        System.out.println("Jabatan       : "+jabatan);
        System.out.println("No.Telp       : "+Notelp());
    }

}
