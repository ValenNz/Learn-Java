package JavaDasar.b_DataType;

public class Conversion {
    public static void main(String[] args) {

        /**
         Konversi Tipe Data Number :
            Widening Casting (Otomatis) : byte -> short -> int -> long -> float -> byte
            Narrowing Casting (manual) : double -> float -> int -> int -> char -> short -> byte
         */

        System.out.println("-------------- HASIL KACAU KETIKA CONVERSE -------------");
        /* akan kacau jika nilai int melebihi nilai MAX atau  */


        System.out.println("===== CODE CONVERSE DATA =====");
        int nilaiInt = 450; //32-bit
        System.out.println("nilai int = " + nilaiInt);

        System.out.println("===== TIPE DATA KE BESAR =====");
        long nilaiLong = nilaiInt; // int -> long
        System.out.println("nilai long = " + nilaiLong);

        // Memperkecil rentang ke tipe data yang lebih kecil
        System.out.println("===== TIPE DATA KE KECIL =====");
        byte nilaiByte = (byte) nilaiInt; // long - > byte  casting operator atau di konversi ke byte terlebih dahuu supaya tdk error
        // (didepan nillai yang mau di casting)
        System.out.println("nilai byte = " + nilaiByte);

        // chek nilai byte
        System.out.println("===== CEK NILAI BYTE =====");
        System.out.println("nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("nilai min byte = " + Byte.MIN_VALUE);



        System.out.println("\n-------------- HASIL TIDAK KACAU KETIKA CONVERSE -------------");
        /* Value ada diantara nilai max dan min */

        System.out.println("===== CODE CONVERSE DATA =====");
        int nilaiInte = 14; //32-bit
        System.out.println("nilai int = " + nilaiInte);

        System.out.println("===== TIPE DATA KE BESAR =====");
        long nilaiLonge = nilaiInte;
        System.out.println("nilai long = " + nilaiLonge);

        System.out.println("===== TIPE DATA KE KECIL =====");
        byte nilaiBytes = (byte) nilaiInte; // casting operator atau di konversi ke byte terlebih dahuu supaya tdk error
        // (didepan nilai yang mau di casting)
        System.out.println("nilai byte = " + nilaiBytes);

        System.out.println("===== CASTING PEMBAGIAN =====");
        int a = 10;
        float b = 4; // jadikan salah satu float supaya hasil nya float

        float c = a/b;

        System.out.printf("%d / %f = %f\n",a,b,c);

        /* Use var Integer */
        int x = 10;
        int y = 4;

        float z = (float)x / y; // hasilnya akan di converse ke float
        System.out.printf("%d / %d = %f \n",x,y,z); // %d (desimal) %f (float)

    }
}
