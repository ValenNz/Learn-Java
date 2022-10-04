package JavaDasar.b_DataType;

public class NonPrimitive {
    public static void main(String[] args) {
        /**
            Pengertian :
         Tipe data Referensi adalah tipe data yang digunakan dalam Pengertian atau Object Oriented
    Programming (Pemrograman berorientasi Objek). Jadi dalam Pengertian ini kita dapat membuat
    atau mendefinisikan tipe data baru yang merupakan objek dari class tertentu. Semua tipe
    data referensi nilai defaultnya adalah nol atau null, tidak seperti tipe data primitif yang
    memiiliki nilai default variatif.
    Fungsi yang digunakan :

    Beberapa perbedaan antara Tipe data Primitif dan Referensi :
    * Tipe Data Primitif
        - Tipe data primitif langsung di definisikan oleh java.
        - Tipe primitif merepresentasikan nilai tunggal.
    * Tipe Data Relatif
        - Tipe data Referensi di definiskan oleh User.
        - Tipe dara referensi dapat menapung nilai nol atau banyak nilai.
         */

        System.out.println("===== NONPRIMITIF =====");

        /* Integer */
        Integer iniInteger = 10;        // var iniInteger (10) => NonPrimitif Integer
        System.out.println(iniInteger);

        /* Long */
        Long iniLong = 10L;             // var iniLong (10) => NonPrimitif Long
        System.out.println(iniLong);

        /* Short */
        Short iniShort;                 // Default var iniShort (null) => NonPrimitif Short
        iniShort = 100;                 // fil var iniShort (100)
        System.out.println(iniShort);

        /*  Byte */
        Byte iniByte = 100;                // var iniByte (100) => NonPrimitif Byte
        System.out.println(iniByte);
        iniByte = 10;                      // var iniByte (100) change to iniByte (10)
        System.out.println(iniByte);

        System.out.println("===== PRIMITIF TO NONPRIMITIF =====");
        int iniA = 100;                    // Deklarasi
        Integer iniA2 = iniA;              // inisialisasi var iniA2 (NonPrimitif) = iniA (Primitif)
        System.out.println(iniA2);

        System.out.println("===== NONPRIMITIF TO PRIMITIF NON COMPOTABLE=====");

        /* Cara 1*/
        Integer iniO = iniA;               // inisialisasi var ini0 (NonPrimitif) = iniA
        short m = iniO.shortValue();       // Deklarasi => ini0.shortValue() casting Integer to short
        long l = iniO.longValue();         // Deklarasi => ini0.LongValue() casting Integer to long
        System.out.println(m);
        System.out.println(l);

        /* Cara 2 */
        Long amount = 100000L;
        amount.longValue();
        System.out.println(amount.longValue());
    }
}
