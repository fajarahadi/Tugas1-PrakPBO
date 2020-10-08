package com.muhammadfajarahadi.modul1.Tugas;

import java.io.IOException;
import java.util.Scanner;

public class MahasiswaBaru {
    public static String bacaString(){
        int character;
        String string = "";
        boolean done = false;
        while(!done){
            try {
                character = System.in.read();
                if(character<0 ||(char)character == '\n')
                    done = true;
                else
                if(character != '\r')
                    string = string+(char)character;
            }catch(IOException ioe){
                System.err.println("Ada Kesalahan Input Data, silahkan coba lagi");
                done = true;
            }
        } return string;
    }
}
class Pendaftaran{
    String nama,alamat, prodi1,prodi2, kelamin;
    int umur;

    public Pendaftaran(String nama, String kelamin, String alamat, int umur, String prodi1, String prodi2) {
        this.nama = nama;
        this.umur = umur;
        this.kelamin = kelamin;
        this.alamat = alamat;
        this.prodi1 = prodi1;
        this.prodi2 = prodi2;

    }

    void pritntData(){
        System.out.println("\nKONFIRMASI REGISTRASI");
        System.out.println("Nama               : " + nama);
        System.out.println("Jenis Kelamin      : " + kelamin);
        System.out.println("Alamat             : " + alamat);
        System.out.println("Umur               : " + umur);
        System.out.println("Pilihan 1          : " + prodi1);
        System.out.println("Pilihan 2          : " + prodi2);
        System.out.println( nama + ", anda berhasil melakukan registrasi. Silahkan tunggu pengumuman selanjutnya");
    }
    public static void main(String[] args) {

        char lagi='y';
        String inputNama, inputKelamin, inputAlamat, inputProdi1, inputProdi2; //variable nama dengan type data string
        int inputUmur;

        while (lagi=='y'){
            Scanner scanner = new Scanner(System.in);
            try{
                System.out.println("\n   FORMULIR PENDAFTARAN ");
                System.out.println("     MAHASISWA BARU ");
                System.out.println("UNIVERSITAS HARAPAN BUNDA");
                System.out.println();
                System.out.println("DATA CALON MAHASISWA BARU ");
                System.out.print("Nama               : ");
                inputNama = scanner.nextLine();
                System.out.print("Jenis Kelamin      : ");
                inputKelamin = scanner.nextLine();
                System.out.print("Alamat             : ");
                inputAlamat = scanner.nextLine();
                System.out.print("Umur               : ");
                inputUmur = scanner.nextInt();
                System.out.println("Program Studi yang dipilih");
                System.out.print("Pilihan 1          : ");
                inputProdi1 = scanner.next();
                System.out.print("Pilihan 2          : ");
                inputProdi2 = scanner.next();

                Pendaftaran pendaftaran = new Pendaftaran (inputNama, inputKelamin, inputAlamat, inputUmur, inputProdi1, inputProdi2);
                pendaftaran.pritntData();
            }catch(NumberFormatException nfe){
                System.err.println("\nAda Kesalahan Dalam Memasukkan Data");
            }
            System.out.println("\nIngin Melakukan Pendaftaran Lagi ? (y/t)");
            String str = MahasiswaBaru.bacaString();
            lagi = str.charAt(0);
            if (lagi == 'Y')
            if (lagi == 'y') continue;
            else{
                System.out.println("Sampai Jumpa di Kampus Tercinta");
                break;
            }
        }
    }
}
