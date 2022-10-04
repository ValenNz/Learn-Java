package JavaDasar.z_InputUser;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

            Scanner userInput = new Scanner(System.in); // untuk mengambil input(objek)
            int panjang, lebar, luas, tinggi, volume; // Persegi panjang (mendeklarasi tanpa int belakang objek)
            // Membuat perhitungan menghitung luas persegi panjang
            // luas = panjang * lebar

            System.out.println("MENGHITUNG LUAS");
            System.out.print("panjang = ");
            panjang = userInput.nextInt(); // (.nextInt : mengambil intejer baru)
            System.out.print("lebar = ");
            lebar = userInput.nextInt();

            luas = panjang * lebar;
            System.out.println("Luas = " + luas);

            System.out.println("MENGHITUNG VOLUME");
            System.out.print("tinggi = ");
            tinggi = userInput.nextInt();
            volume = luas*tinggi;
            System.out.println("volume = "+ volume);
        }

}
