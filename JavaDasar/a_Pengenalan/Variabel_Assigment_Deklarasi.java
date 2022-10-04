package JavaDasar.a_Pengenalan;

public class Variabel_Assigment_Deklarasi {

    public static void main(String[] args) {

        //
        /* */
        /**
         *
         */

        /**
        ---------- PENGERTIAN ----------

        * Deklarasi :
                 Pernyataan ringkas dan jelas (tentang suatu hal).

        * Varibel :
                Suatu lokasi memori komputer yang digunakan untuk menampung
            dan menyimpan data yang akan dioalah (sementara)

             ----- Aturan -----
             - Nama variabel tidak boleh menggunakan kata kunci dari Java (reserved word) seperti if, for, switch, dll.
             - Nama variabel boleh menggunakan huruf, angka (0-9), garis bawah (underscore), dan symbol dollar ($),
               namun penggunaan garis bawah dan symbol lebih baik dihindari.
             - Nama variabel harus diawali dengan huruf kecil, karena Java menggunakanb gaya CamelCase.
             - Apabila nama variabel lebih dari 1 suku kata, maka kata ke-2 dituliskan dengan diawali dengan huruf besar
               dan seterusnya, contoh namaVariabel.

        * Final :
                Besaran yang tetap selama pemrograman dijalankan (permanent)

        * Assigment
                Penugasan terhadap suatu variabel dengan menggunakan tanda '='
         */



        System.out.println("\n===== Source Code =====");

        /**
        Formatnya seperti ini:
        <tipe data> namaVariabel;
        Contoh:

        Membuat variabel kosong bertipe integer:

        int namaVariabel;
        Membuat variabel bertipe integer dan langsung diisi nilai:

        int namaVariabel = 19;
        Membuat sekumpulan variabel yang tipe datanya sama:

        int a, b, c;

        */
        var x = 10;
        System.out.println("nilai variabbel x :" + x);

        final String name = "valen";
        // name = "budi" ERROR


         /**
         ---------- PENJELASAN ----------
          - var x       | merupakan deklarasi
          - =           | merupakan assigment
          - var         | merupakan Tipe data
          - x           | merupakan variabel
          - 10          | merupakan nilai variabel
          - var x = 10; | inisialisasi
          - final       | merupakan variabel permanent
        ---------------------------------
         */

    }

}
