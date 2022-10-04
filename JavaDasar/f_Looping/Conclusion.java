package JavaDasar.f_Looping;

public class Conclusion {
    public static void main(String[] args) {

        System.out.println("===== FOR =====");
        /*                      PENGERTIAN
        For adalah salah satu kata kunci yang bisa digunakan untuk melakukan perulangan
        Blok kode yang terdapat di dalam for akan selalu diulangi selama kondisi for terpenuhi

                                 SINTAK FOR
        for(init statement; kondisi; post statement){
            // block perulangan
            }

        - Init statement akan dieksekusi hanya sekali di awal sebelum perulangan
        - Kondisi akan dilakukan pengecekan dalam setiap perulangan, jika true perulangan akan dilakukan, jika false perulangan akan berhenti
        - Post statement akan dieksekusi setiap kali diakhir perulangan
        - Init statement, Kondisi dan Post Statement tidak wajib diisi, jika Kondisi tidak diisi, berarti kondisi selalu bernilai true
          */


         /*                        INFINITY LOOP
        for (;;){
            System.out.println("Java_Dasar.Perulangan tanpa henti");
        }
          */

        /*                     Perulangan dengan kondisi
        var counter = 1;

        for (; counter <= 10;){
            System.out.println("Perulangan ke- " + counter);
            counter++;
        }
        */

        /*                  Perulangan dengan init statment
        for (var counter1 =1; counter1 <=10;){
            System.out.println("Perulangan ke- " + counter1);
            counter1++;
        }
        */

        /*                  Perulangan dengan post statment
       for (var number = 1; number <= 10; number++) {
            System.out.println("Perulangan ke-" + number);
        }
        System.out.println("\n");

         */



        // WHILE LOOP
        System.out.println("===== WHILE LOOP =====");
        var number1 = 1;

        while (number1 <= 10) { // kondisi
            System.out.println("Perulangan ke-" + number1);
            number1++;
        }
        System.out.println("\n"); // memindahkan kebawah ketika melakukan perulangan



        /*                      DO WHILE LOOP
        - Do While loop adalah perulangan yang mirip dengan while
        - Perbedaannya hanya pada pengecekan kondisi
        - Pengecekan kondisi di while loop dilakukan di awal sebelum perulangan dilakukan, sedangkan di do while loop dilakukan setelah perulangan dilakukan
        - Oleh karena itu dalam do while loop, minimal pasti sekali perulangan dilakukan walaupun kondisi tidak bernilai true
         */

        System.out.println("===== DO WHILE LOOP =====");
        var number2 = 10;


        do {
            System.out.println("Perulangan ke-" + number2);
            number2++;
        } while (number2 <= 10);

        System.out.println("\n");



        // ========= KATA KUNCI ===========
        // Break
        System.out.println("----- BREAK -----");

        var number3 = 1;

        while (true) {
            System.out.println("Perulangan ke-" + number3);
            number3++;

            if (number3 > 10) {
                break;
            }
        }


        // Continue
        System.out.println("----- CONTINUE -----");

        for (var number4 = 1; number4 <= 10; number4++) {
            if (number4 % 2 == 1) { // == 0 (ganjil) == 1  (genap)
                continue; // skip
            }
            System.out.println("Perulangan Ganjil- " + number4);
        }
        System.out.println("\n");


                // tanpa for each
        System.out.println("----- NO ARRAY -----");

        String[] array = {"Eko","Panji","Dodik","Lele"};

        for (int i = 0; i < array.length; i ++){ // array.length digunakan untuk mengitung jumlah index di array
            System.out.println(array[i]);
        }
        System.out.println("\n");


                // Menggunakan for each
        System.out.println("----- ARRAY -----");

        String[] array1 = {"Eko","Panji","Dodik","Lele"};

        for (var value :array1){ // data value akan dimasukan oleh array 1
            System.out.println(value);
        }



    }
}
