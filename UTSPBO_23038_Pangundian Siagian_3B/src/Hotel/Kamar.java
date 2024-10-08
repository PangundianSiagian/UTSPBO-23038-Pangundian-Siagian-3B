/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;
/**
 *
 * @author Asus
 */
public class Kamar {
    //Mendeklarasikan Variabel
    String noKamar;
    String tipeKamar;
    int hargaPerMalam;
    
    //Konstruktor untuk kamar
    public Kamar(String noKamar, String tipeKamar, int hargaPerMalam) {
        this.noKamar = noKamar;
        this.tipeKamar = tipeKamar;
        this.hargaPerMalam = hargaPerMalam;
    }
    //Method untuk menampilkan detail dari kamar
    public void tampilkanInfoKamar() {
        System.out.println("Nomor Kamar : " +noKamar);
        System.out.println("Tipe Kamar  : " +tipeKamar);
        System.out.println("Harga       : " +hargaPerMalam + "/Malam");
    }
}
