/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aplikasi;
//Mengimport dari package Pengguna untuk memanggil Admin dan Customer
import Pengguna.*;
//Mengimport Scanner untuk dapat memasukan input dalam program
import java.util.Scanner;

public class DemoHotel {
    public static void main(String[] args) {
        //Memberikan nama baru untuk objek Scanner
        Scanner masukan = new Scanner(System.in);
        
        //Tampian Utama untuk memilih menu apa yang akan dipilih
        System.out.println("================SELAMAT DATANG DI YANS HOTEL==============");
        System.out.println("|                1. Login Sebagai Admin                  |");
        System.out.println("|                2. Login Sebagai Customer               |");
        System.out.println("|                3. Batalkan Reservasi                   |");
        System.out.println("|                4. Keluar Aplikasi                      |");
        System.out.println("==========================================================");
        //Pengguna Memasukan opsi menu apa yang ingin dilakukan
        System.out.print("\nPilih Menu: ");
        int opsi = masukan.nextInt();
        masukan.nextLine();
        //Jika memilih
        switch (opsi) {
           //opsi 1 maka akan login sebagai admin
            case 1:
                Admin admin = new Admin();
                admin.loginUntukUser();
                break;
           //opsi 2 maka akan login sebagai customer
            case 2:
                Customer customer = new Customer();
                customer.loginUntukUser();
                break;
           //opsi 3 maka akan masuk ke menu pembatalan reservasi
            case 3:
                Admin adminCancel = new Admin();
                adminCancel.batalkanReservasi();
                break;
           //opsi 4 jika memili opsi keluar 
            case 4:
                System.out.println("Terima Kasih Sampai Jumpa Kembali Di YANS HOTEL.");
                break;
           // opsi 5 jika user memasukan input bukan antara 1,2,3,4
            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                break;
        }
    }
}
