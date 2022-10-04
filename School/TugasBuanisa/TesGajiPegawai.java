package TugasBuanisa;

import java.util.Scanner;

public class TesGajiPegawai {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print("Massukkan gaji : ");
            double  kotor = input.nextDouble();
            GajiPegawai gaji = new GajiPegawai();

            gaji.setGaji(kotor);
            gaji.hitungPajak();
            gaji.hitungGaji();

            System.out.println("Nama : " + gaji.namaPegawai());
            System.out.println("Gaji Kotor : " + gaji.getGajiKotor());
            System.out.println("Pajak : " + gaji.getPajak());
            System.out.println("Potongan : " + gaji.getPotongan());
            System.out.println("Gaji bersih : " + gaji.getGajiBersih());
        }


    }
