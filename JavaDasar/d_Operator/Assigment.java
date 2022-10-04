package JavaDasar.d_Operator;

public class Assigment {
    public static void main(String[] args) {

        /*                  PENGERTIAN
             operator untuk memasukkan suatu nilai ke dalam variabel.
         */

        // Assignment operator jumlah
        System.out.println("===== PENJUMLAHAN =====");
        int a = 1;
        a += 10; // a = a + 10;
        System.out.println("nilai a = " + a);

        // Assignment operator pengurangan
        System.out.println("===== PENGURANGAN =====");
        int b = 100;
        b -= 25;
        System.out.println("nilai b = " + b);

        // Assignment operator perkalian
        System.out.println("===== PERKALIAN =====");
        int c = 100;
        c *= 20;
        System.out.println("nilai c = " + c);

        // Assignment operator pembagian
        System.out.println("===== PEBAGIAN =====");
        int d = 100;
        d /= 20;
        System.out.println("nilai d = " + d);

        // Assignment operator modulus
        System.out.println("===== MODULUS =====");
        int e = 10;
        e %= 7;
        System.out.println("nilai e = " + e);

        /*              CONCLUSION

        var c = 100;

        c += 10;
        System.out.println(c);
        c -= 10;
        System.out.println(c);
        c *= 10;
        System.out.println(c);
        c /= 10;
        System.out.println(c);
        c %= 10;
        System.out.println(c);

         */
    }
}
