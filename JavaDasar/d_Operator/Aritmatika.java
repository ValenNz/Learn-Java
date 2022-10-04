package JavaDasar.d_Operator;

public class Aritmatika {
    public static void main(String[] args) {

        /*                   PENGERTIAN
            Operator Aritmatika adalah operator matematis yang terdiri dari operator penambahan, pengurangan, perkalian,
        pembagian, modulus, plus, dan minus.
        */
    // DEKLARASI
    int a = 15; // angka  1
    int b = 5; // angka 2

    int hasil; // untuk hasil

    // 1. penjumlahan
        System.out.println("\n====== PENJUMLAHAN ======");
    hasil = a + b; // rumus
        System.out.println(hasil);  // menampilkan hasil cara 1 (tanpa rumus)
        System.out.println(a + " + " + b + " = " + hasil); // menampilkan hasil cara 2

    // 2. pengurangan
        System.out.println("\n====== PENGURANGAN ======");
    hasil = a - b; // rumus
        System.out.println(hasil);  // menampilkan hasil cara 1 (tanpa rumus)
        System.out.printf("%d - %d = %d \n",a,b,hasil); // menampilkan hasil cara 2

    // 3. perkalian
        System.out.println("\n====== PERKALIAN ======");
    hasil = a * b; // rumus
        System.out.println(hasil);  // menampilkan hasil cara 1 (tanpa rumus)
        System.out.printf("%d x %d = %d \n",a,b,hasil); // menampilkan hasil cara 2

    // 4a. pembagian int
        System.out.println("\n====== PEMBAGIAN (INTEGER) ======");
    hasil = a / b; // rumus
        System.out.println(hasil);  // menampilkan hasil cara 1 (tanpa rumus)
        System.out.printf("%d / %d = %d \n",a,b,hasil); // menampilkan hasil cara 2

    // 4b. Pembagian Float
        System.out.println("\n====== PEMBAGIAN (FLOAT) ======");
    float x = 6;
    float y = 5;
    float hasilFloat = x/y;
        System.out.println(x + " / " + y + " = " + hasilFloat);

    // 5. modulus (sisa pembagian)
        System.out.println("\n====== MODULUS ======");
    hasil = a % b; // rumus
        System.out.println(hasil);  // menampilkan hasil cara 1 (tanpa rumus)
        System.out.printf("%d %% %d = %d \n",a,b,hasil); // menampilkan hasil cara 2



        /*          CONCLUSION

        int a = 100;
        int b = 10;

        System.out.println(a + b); // tambah
        System.out.println(a - b); // kurang
        System.out.println(a * b); // kali
        System.out.println(a / b); // bagi
        System.out.println(a % b); // modulus

        */

}

}
