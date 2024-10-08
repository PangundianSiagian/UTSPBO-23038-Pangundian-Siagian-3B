/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pengguna;
//Mengimport dari package Hotel untuk memanggil objek tampilkanInfoKamar
import Hotel.*;
//Mengimport Scanner untuk dapat memasukan input dalam program
import java.util.Scanner;
/**
 *
 * @author Asus
 */
//Class ini Inherit dari Kelas Admin
public class Customer extends Admin{
    //Memberikan nama baru untuk objek Scanner
    Scanner masukan = new Scanner(System.in);
    
    //Method ini override dengan interface ILogin
    @Override
    public void loginUntukUser () {
        //Customer diminta memasukkan Nama
        System.out.print("\nMasukkan Nama Anda : ");
        String nama = masukan.nextLine();
        // muncul output selamat datang
        System.out.println("\nSelamat Datang Bapak/Ibu, " + nama);
        pilihKamar(nama);
    }
    //Method untuk menampilkan daftar kamar
    public void pilihKamar(String nama) {
        System.out.print("===================================================");
        System.out.println("\nDaftar Kamar Tersedia");
        //Membuat objek kamar
        Kamar kamar1 = new Kamar("1.", "Myhtic", 3500000);
        Kamar kamar2 = new Kamar("2.", "Epic", 2000000);
        Kamar kamar3 = new Kamar("3.", "Master", 1000000);
        
        //Menampilkan informasi dari Kamar
        kamar1.tampilkanInfoKamar();
        kamar2.tampilkanInfoKamar();
        kamar3.tampilkanInfoKamar();
        System.out.println("===================================================");

        //Diminta untuk memasukkan Nama kamar
        System.out.print("\nMasukkan Nama Kamar yang ingin dipesan:");
        String namaKamar = masukan.nextLine();
        
        //Melakukan Pengecekan
        Kamar kamarDipilih = null; 
        switch (namaKamar){
            //Jika Memilih tipe kamar Myhtic maka kamar 1
            case "Myhtic":
                kamarDipilih = kamar1;
                break;
            //Jika Memilih tipe kamar Epic maka kamar 2
            case "Epic":
                kamarDipilih = kamar2;
                break;
            //Jika Memilih tipe kamar Master maka kamar 3
            case "Master":
                kamarDipilih = kamar3;
                break;
            //Jika tidak ada diantara nama diatas maka akan keluar output ini
            default:
                System.out.println("\nNama Kamar tidak valid.");
                return;
        }
        //Diminta untuk memasukan berapa lama menginap
        System.out.print("\nMasukkan Lama Menginap : ");
        int lamaMenginap = masukan.nextInt();
        
        //Membuat objek reservasi
        Reservasi reservasi = new Reservasi(nama, kamarDipilih, lamaMenginap);
        //Menampilkan Detail pesanan
        reservasi.tampilkanDetailPesanan();
    }
}
