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
public class Admin implements ILogin{
    //Memberikan nama baru untuk objek Scanner
    Scanner masukan = new Scanner(System.in);
    
    //Method ini override dengan interface ILogin
    @Override
    public void loginUntukUser () {
        //Admin diminta memasukkan Nama
        System.out.print("\nMasukkan Nama Anda  : ");
        String nama = masukan.nextLine();
        
        //Masukkan Kata sandi
        System.out.print("\nMasukkan Kata Sandi : ");
        String kataSandi = masukan.nextLine();
        
        //kata sandi untuk login yaitu admin
        String kataSandiBenar = "admin";
          //Jika kata sandi salah maka akan keluar output kata sandi salah
          if (!kataSandi.equals(kataSandiBenar)) {
            System.out.println("\nKata sandi salah. Akses ditolak.");
            return;
    }
        //Jika sandi benar maka akan muncul output selamat datang admin
        System.out.println("\nSelamat Datang Admin, " + nama);
        tampilkanDaftarKamar();
        buatReservasi();
    }
    //Method untuk menampilkan daftar kamar
    public void tampilkanDaftarKamar() {
        System.out.print("===================================================");
        System.out.println("\nDaftar Kamar dan Harga yang Tersedia");
        //Membuat objek kamar
        Kamar kamar1 = new Kamar("1","Myhtic", 3500000);
        Kamar kamar2 = new Kamar("2","Epic", 2000000);
        Kamar kamar3 = new Kamar("3","Master", 1000000);
        
        //Menampilkan informasi dari Kamar
        kamar1.tampilkanInfoKamar();
        kamar2.tampilkanInfoKamar();
        kamar3.tampilkanInfoKamar();
        System.out.println("===================================================");
    }
    //Method membuat reservasi
    public void buatReservasi() {
        //Diminta untuk memasukkan nama customer
        System.out.print("\nMasukkan Nama Customer : ");
        String namaPemesan = masukan.nextLine();
        
        //Diminta untuk memasukkan tipe kamar
        System.out.print("\nMasukkan Tipe Kamar yang Dipesan : ");
        String namaKamar = masukan.nextLine();
        
        //Diminta untuk memasukan berapa lama menginap
        System.out.print("\nMasukkan Lama Menginap : ");
        int lamaMenginap = masukan.nextInt();
        
        //Melakukan Pengecekan
        Kamar kamarDipilih;
        //Apabila tidak menmasukkan maka akan keluar output ini
        if (null == namaKamar) {
            System.out.print("\nNama kamar tidak valid.");
            return;
        //Apabila Memasukan Nama yang benar maka pilihan ini akan menapilkan nama kamar dan lain2
        }else 
            switch (namaKamar) {
            case "Myhtic":
                kamarDipilih = new Kamar("1", "Myhtic", 3500000);
                break;
            case "Epic":
                kamarDipilih = new Kamar("2", "Epic", 2000000);
                break;
            case "Master":
                kamarDipilih = new Kamar("3", "Master", 1000000);
                break;
            default:
                System.out.print("\nNama Kamar Salah.");
                return;
        }
        //Membuat objek reservasi
        Reservasi reservasi = new Reservasi(namaPemesan, kamarDipilih, lamaMenginap);
        //Menampilkan Detail pesanan
        reservasi.tampilkanDetailPesanan();
    }
    //Method membatalkan Reservasi
    public void batalkanReservasi() {
        System.out.println("=============================Pembatalan Reservasi========================================");
        //Diminta untuk memasukan Nama
        System.out.println("Masukkan Nama Anda untuk Membatalkan Reservasi: ");
        String namaPemesan = masukan.nextLine();
        System.out.println("Reservasi atas Nama Bapak/ibu                 : " + namaPemesan + " Dibatalkan.");
        System.out.println("=======================Mohon Maaf Uang Tidak Dapat Dikembalikan==========================");
    }
}