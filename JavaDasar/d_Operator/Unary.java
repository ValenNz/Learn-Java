package JavaDasar.d_Operator;

public class Unary {
    public static void main(String[] args) {

        /*                      PENGERETIAN
                Operator unary adalah operator yang hanya memiliki 1 operand
         */


        // unary + dan -
        System.out.println("\n===== UNARY + AND - ======");
        int angka = 1;
        System.out.printf("unary '+', %d menjadi %d\n",angka, +angka);
        System.out.printf("unary '-', %d menjadi %d\n",angka, -angka);



        // unary decrement dan increment
        System.out.println("\n\n===== UNARY DECREMENT AND INCREMENT =====");
        int angka2 = 10;
        angka2++; // variabel akan ditambah satu
        System.out.println("nilai dengan '++' menjadi = " + angka2);

        int angka3 = 10;
        angka3--; // variabel akan dikurangi 1
        System.out.println("nilai dengan '--' menjadi = " + angka3);

        System.out.println("\n----- PREFIX -----");
        int a = 5;
        System.out.printf("nilai dengan '++' prefix menjadi = %d \n", ++a); // akan dieksekusi baru ditampilkan

        System.out.println("\n----- POSTFIX -----");
        int b = 5;
        System.out.printf("nilai dengan '++' postfix menjadi = %d \n", b++); // ditaruh dulu baru dijumlah
        System.out.printf("nilai hasil dari postfix menjadi = %d \n", b); // sudah di eksekusi dan ditampilakn



        // unary boolean dengan ! untuk negasi
        // negasi adalah suatu pernyataan yang bernilai salah walaupun dalam keadaan benar.
        System.out.println("\n\n===== UNARY BOLEAN =====");

        boolean ucup = true;
        System.out.println("nilai boolean = " + ucup); // tidak akan merubah nilai bolean
        System.out.println("nilai boolean = " + !ucup);

    }
}



        /*          CONCLUSION


        int d = -100;

        d++;
        System.out.println(d); // menambah 1
        d--;
        System.out.println(d); // berkurang 1
        System.out.println(!true); // kebalikan

         */

