package TugasBuanisa;

import java.util.Scanner;


public class TesToko {
    public static void main(String[] args) {
        Toko toko = new Toko();
        Scanner input = new Scanner(System.in);

        System.out.println("Toko Buku dan Alat Tulis");
        System.out.println("--------------------------");
        System.out.println("Login");
        System.out.println("Username : " + toko.inama());
        System.out.println("Password : " + toko.ipass());
        System.out.println("**********");
        System.out.println("Selamat datang " + toko.inama());
        System.out.println("**********");
        System.out.println("Daftar Barang");
        System.out.println("1.  Buku Tulis (Rp.2500)");
        System.out.println("2.  Alat Tulis Lengkap (Rp.5000)");
        System.out.println("3.  Buku Menggambar (Rp.3500)");
        System.out.print("Pilih barang : ");
        int id = input.nextInt();
        System.out.print("Jumlah barang : ");
        double byk = input.nextDouble();

        toko.setbarang(id);
        toko.setbanyak(byk);

        System.out.println("\nJumlah : " + toko.itotal());

        System.out.print("Bayar : ");
        double bayar = input.nextDouble();

        toko.kembali(bayar);

        System.out.println("Kembalian : " + toko.ikembali());
    }
}
