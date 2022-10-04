package JavaDasar.b_DataType;

public class Primitif {
    public static void main(String[] args) {

        System.out.println("\n* ----- Integer Number ----- ");
        /*
          Pengertian :
                Dalam ilmu komputer, istilah "Integer" digunakan untuk merujuk kepada tipe data apapun yang
            merepresentasikan bilangan bulat, atau beberapa bagian dari bilangan bulat. Disebut juga sebagai
            Integral Data Type.
         */

        int i = 10;
        System.out.println("\n======INTEGER======");
        System.out.println("nilai integer i = " + i);                       // memanggil variabel integer
        System.out.println("nilai integer i = " + (i + 1));                 // (variabel i  + 1)
        System.out.println("Nilai max = " + Integer.MAX_VALUE);             // nilai tertinggi integer (2147483647)
        System.out.println("Nilai min = " + Integer.MIN_VALUE);             // nilai terendah integer (-2147483648)
        System.out.println("Besar integer = " + Integer.BYTES + " bytes");  // cek ukuran memori intejer dalam bytes
        System.out.println("Besar integer = " + Integer.SIZE + " bit");     // cek ukuran integer daalam bit

        byte b = 10;
        System.out.println("\n======BYTE======");
        System.out.println("nilai byte b = " + b);                          // memanggil variabel byte
        System.out.println("Nilai max = " + Byte.MAX_VALUE);                // nilai tertinggi byte (127)
        System.out.println("Nilai min = " + Byte.MIN_VALUE);                // nilai terendah byte (-128)
        System.out.println("Besar byte = " + Byte.BYTES + " bytes");        // cek ukuran memori byte dalam bytes
        System.out.println("Besar byte = " + Byte.SIZE + " bit");           // cek ukuran byte dalam bit

        short s = 10;
        System.out.println("\n======SHORT======");
        System.out.println("nilai short s = " + s);                         // memanggil variabel short
        System.out.println("Nilai max = " + Short.MAX_VALUE);               // nilai tertinggi short (32767)
        System.out.println("Nilai min = " + Short.MIN_VALUE);               // nilai terendah short (-32768)
        System.out.println("Besar short = " + Short.BYTES + " bytes");      // cek ukuran memori short dalam bytes
        System.out.println("Besar short = " + Short.SIZE + " bit");         // cek ukuran byte dalam short

        long l = 10L;
        System.out.println("\n======LONG======");
        System.out.println("nilai long l = " + l);                          // memanggil variabel long
        System.out.println("Nilai max = " + Long.MAX_VALUE);                // nilai tertinggi long (9223372036854775807)
        System.out.println("Nilai min = " + Long.MIN_VALUE);                // nilai terendah long (-9223372036854775808)
        System.out.println("Besar long = " + Long.BYTES + " bytes");        // cek ukuran memori long dalam bytes
        System.out.println("Besar long = " + Long.SIZE + " bit");           // cek ukuran long dalam bit



        System.out.println("\n* ----- Floatong Point Number ----- ");
        /*
           Pengertian :
             Floating-point atau bilangan titik mengambang, adalah sebuah format bilangan yang dapat digunakan untuk
        merepresentasikan sebuah nilai yang sangat besar atau sangat kecil.
         */

        double d = -10.5d;
        System.out.println("\n======DOUBLE======");
        System.out.println("nilai double d = " + d);                         // memanggil variabel double
        System.out.println("Nilai max = " + Double.MAX_VALUE);               // nilai tertinggi double (1.7976931348623157E308)
        System.out.println("Nilai min = " + Double.MIN_VALUE);               // nilai terendah double (4.9E-324)
        System.out.println("Besar double = " + Double.BYTES + " bytes");     // cek ukuran memori double dalam bytes
        System.out.println("Besar double = " + Double.SIZE + " bit");        //cek ukuran double dalam bit

        float f = -8.5f;
        System.out.println("\n======FLOAT======");
        System.out.println("nilai float f = " + f);                          // memanggil variabel byte
        System.out.println("Nilai max = " + Float.MAX_VALUE);                // nilai tertinggi float (3.4028235E38)
        System.out.println("Nilai min = " + Float.MIN_VALUE);                // nilai terendah float (1.4E-45)
        System.out.println("Besar float = " + Float.BYTES + " bytes");       // cek ukuran memori byte dalam bytes
        System.out.println("Besar float = " + Float.SIZE + " bit");          //cek ukuran byte dalam bit



        System.out.println("\n* ----- Literals Number -----");
        /*
            Pengertian :
                huruf yang digunakan dalam ekspresi aljabar untuk mewakili angka atau kuantitas yang tidak diketahui.
         */

        // Decimal
        int decimalInt = 25;
        System.out.println("nilai Decimal = " + decimalInt); // memanggil variabel byte

        // Hexadecimal
        int hexInt = 0xA132B;
        System.out.println("nilai Hexadecimal = " + hexInt); // memanggil variabel byte

        int binInt = 0b01010101;
        System.out.println("nilai Biner  = " + binInt); // memanggil variabel byte



        System.out.println("\n* ----- Character ----- ");
        /*
            Pengertian :
                salah satu tipe data yang memungkinkan kita untuk memesan memori berformat
                text (huruf, angka, dan simbol) dengan karakter tunggal.
         */

        char c = 'c';
        System.out.println("nilai char c = " + c); // memanggil variabel byte
        System.out.println("Nilai max = " + Character.MAX_VALUE); // nilai tertinggi char (127)
        System.out.println("Nilai min = " + Character.MIN_VALUE); // nilai terendah char (-128)
        System.out.println("Besar char = " + Character.BYTES + " bytes"); // cek ukuran memori char dalam bytes
        System.out.println("Besar char = " + Character.SIZE + " bit"); //cek ukuran char dalam bit



        System.out.println("\n* ----- BOOLEAN ----- ");
        /*
            Pengertian :
                tipe data yang memiliki 2 nilai, yaitu benar dan salah

            Aturan :
         - Tipe data boolean di Java direpresentasikan dengan kata kunci boolean
         - Nilai benar direpresentasikan dengan kata kunci true
         - Nilai salah direpresentasikan dengan kata kunci false
         - Default value untuk boolean adalah false

         */

        boolean val = false;
        System.out.println("nilai boolean val = " + val); // memanggil bolean
        System.out.println("Nilai max = " + Boolean.TRUE); // memanggil bolean (true)
        System.out.println("Nilai min = " + Boolean.FALSE); // memanggil bolean (false)



        System.out.println("\n* ----- STRING ----- ");
        /*
            Pengertian :
                tipe data yang berisikan data kumpulan karakter atau sederhananya adalah teks.

            Aturan :
            - Di Java, tipe data String direpresentasikan dengan kata kunci String
            - Untuk membuat String di Java, kita menggunakan karakter “ (petik dua) sebelum dan setelah teks nya
            - Default value untuk String adalah null
          */

        String name = "Nuevalen Refitra Alswando";
        System.out.println(name);
        String name2 = " XR7";
        System.out.println(name + " " +name2); // '+' menggabungkan string
    }
}
