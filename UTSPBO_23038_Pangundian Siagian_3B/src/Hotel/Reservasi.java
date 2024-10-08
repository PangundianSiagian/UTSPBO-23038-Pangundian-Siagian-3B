/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;
/**
 *
 * @author Asus
 */
public class Reservasi {
    //Mendeklarasikan Variabel
    String namaPemesan;
    Kamar kamar;
    int lamaMenginap;
    int totalHarga;
    
    //Konstruktor untuk reservasi
    public Reservasi(String namaPemesan, Kamar kamar, int lamaMenginap) {
        this.namaPemesan = namaPemesan;
        this.kamar = kamar;
        this.lamaMenginap = lamaMenginap;
        //Untuk menghitung total harga
        hitungTotalHarga();
    }

    // Method untuk pengecekan
    public final void hitungTotalHarga() {
        int hargaAwal = (kamar.hargaPerMalam * lamaMenginap);
        //Apakah tipe kamar adalah Myhtic? jika iya
        if ("Myhtic".equals(kamar.tipeKamar)) {
            //Berapa lama menginapnya?
            //Apabila 2 hari maka mendapatkan ini
            if (lamaMenginap == 2) {
                System.out.println("\nSELAMAT ANDA BERUNTUNG !!!!!");
                System.out.println("Anda Mendapatkan Dinner Gratis Selama 2 Malam!");
            //Apabila 3 hari maka mendapatkan ini
            } else if (lamaMenginap == 3) {
                hargaAwal *= 0.75; // diskon 25%
                System.out.println("\nSELAMAT ANDA BERUNTUNG !!!!!");
                System.out.println("Mendapatkan Potongan Harga 25%!");
            //Apabila 4 hari maka mendapatkan ini
            } else if (lamaMenginap >= 5) {
                hargaAwal *= 0.5; // diskon 50%
                System.out.println("\nSELAMAT ANDA BERUNTUNG !!!!!");
                System.out.println("Mendapatkan Potongan Harga 50%!");
            }
        }
        //total harga setelah diskon (jika memnuhi syarat diatas)
        this.totalHarga = hargaAwal;
    }
    //Method untuk menampilkan Struk atau bukti reservasi
    public void tampilkanDetailPesanan() {
        System.out.println("\n======================Tanda Bukti YANS HOTEL================================");
        System.out.println("Nama Pemesan    : " + namaPemesan);
        System.out.println("Kamar           : " + kamar.noKamar + " ("+kamar.tipeKamar + ")");
        System.out.println("Lama Menginap   : " + lamaMenginap + " Malam");
        System.out.println("Total Harga     : Rp. " + totalHarga);
        System.out.println("=====================Terima Kasih Sampai Jumpa Kembali======================");
    }
}
