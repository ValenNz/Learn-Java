

        /*                   PENGERTIAN
    - block kode program yang akan berjalan saat kita panggil
    - Sebelumnya kita sudah menggunakan method println() untuk menampilkan tulisan di console
    - Untuk membuat method di Java, kita bisa menggunakan kata kunci void, lalu diikuti dengan nama method, kurung () dan diakhiri dengan block
    - Kita bisa memanggil method dengan menggunakan nama method lalu diikuti dengan kurung ()
    - Di bahasa pemrograman lain, Method juga disebut dengan Function

                             {METHOD}
        Untuk memanggil method cukup menuliskan nama method pada main (otak)
        Method static hanya bisa memanggil method static
                SourceCode :
                 sayHelloWorld();

                         {METHOD PARAMETER}
    - Kita bisa mengirim informasi ke method yang ingin kita panggil
    - Untuk melakukan hal tersebut, kita perlu menambahkan parameter atau argument di method yang sudah kita buat
    - Cara membuat parameter sama seperti cara membuat variabel
    - Parameter ditempatkan di dalam kurung () di deklarasi method
    - Parameter bisa lebih dari satu, jika lebih dari satu, harus dipisah menggunakan tanda koma
                SourceCode :
                 sayHelloWorld("Valen","Nue");

                        {METHOD RETURN VALUE}
    - Secara default, method itu tidak menghasilkan value apapun, namun jika kita ingin, kita bisa membuat sebuah
      method mengembalikan nilai
    - Agar method bisa menghasilkan value, kita harus mengubah kata kunci void dengan tipe data yang dihasilkan
    - Dan di dalam block method, untuk menghasilkan nilai tersebut, kita harus menggunakan kata kunci return,
      lalu diikuti dengan data yang sesuai dengan tipe data yang sudah kita deklarasikan di method (type datanya harus sama)
    - Di Java, kita hanya bisa menghasilkan 1 data di sebuah method, tidak bisa lebih dari satu
                SourceCode :
                System.out.println(hasil(200,200));
    - Mengoutput method dengan System.out.print dan memanggil nama method serta memberikan nilai param

                        {METHOD VARIABEL ARGUMENT}
    -  Kadang kita butuh mengirim data ke method sejumlah data yang tidak pasti
    - Biasanya, agar bisa seperti ini, kita akan menggunakan Array sebagai parameter di method tersebut
    - Namun di Java, kita bisa menggunakan variable argument, untuk mengirim data yang berisi jumlah tak tentu, bisa nol atau lebih
    - Parameter dengan tipe variable argument, hanya bisa ditempatkan di posisi akhir parameter
                SourceCode :
                sayCongrast1("Budi",80,90,96,87);

                        {METHOD OVERLOADING}
    - Method overloading adalah kemampuan membuat method dengan nama yang sama lebih dari sekali.
    - Namun ada ketentuannya, yaitu data parameter di method tersebut harus berbeda-beda, enta jumlah atau tipe data parameternya
    - Jika ada yang sama, maka program Java kita akan error
                SourceCode :
                sayHello1();
                sayHello1("Valen");
                sayHello1("valen","dsfg");

                         {RECURSIVE METHOD}
    - Recursive method adalah kemampuan method memanggil method dirinya sendiri
    - Kadang memang ada banyak problem, yang lebih mudah diselesaikan menggunakan recursive method, seperti contohnya kasus factorial
    - Faktorial Loop : jika memasukan angka 5 maka 5 x 4 x 3 x 2 x 1 x..... (mengalian angka sebelumnya
                SourceCode :
                System.out.println(factorialRecursive(5));

       --- PROBLEM
    - Walaupun recursive method itu sangat menarik, namun kita perlu berhati-hati
    - Jika recursive terlalu dalam, maka  akan ada kemungkinan  terjadi error StackOverflow, yaitu error dimana stack method terlalu banyak di Java
    - Kenapa problem ini  bisa terjadi? Karena ketika kita memanggil method, Java akan menyimpannya dalam stack, jika method tersebut memanggil method lain, maka stack akan menumpuk terus, dan jika terlalu dalam, maka stack akan terlalu besar, dan bisa menyebabkan error StackOverflow




         */

package JavaDasar.g_Method;

public class conclusion {
    public static void main(String[] args) {

        //* METHOD 1
        sayHelloWorld(); // panggil nama methodnya

        //** METHOD PARAMETER
        sayHello("Eko","Hhanedy"); // panggil nama method dan var parameternya

        //*** METHOD RETURN VALUE
        var a = 100;
        var b = 200;
        var c = hasil(a, b);
        System.out.println(c); // cara 1
        System.out.println(hasil(200,200)); // cara 2

        //**** METHOD RETURN VALUE NESTED
        System.out.println(hitung(100, "+" , 100));
        System.out.println(hitung(200, "-" , 100));
        System.out.println(hitung(200, "salah" , 100));

        //***** METHOD TANPA VARIABEL ARGUMENT
        int[] values ={80,80,80,80};
        sayCongrast("Valen",values);

        //***** METHOD TANPA VARIABEL ARGUMENT
        sayCongrast1("Budi",80,90,96,87);

        //****** METHOD OVERLOADING
        sayHello1();
        sayHello1("Valen");
        sayHello1("valen","dsfg");

        //****** REQURSIVE METHOD

        //-- Factorial Loop
        System.out.println(factorialLoop(5));
        //-- Factorial Recursive
        System.out.println(factorialRecursive(5));

        //******* ERROR STACKOVERFLOW
        loop(100);
    }





/*
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*/



            //* METHOD 1
                    // untuk mengeksekusi method ini cukup panggil nama methodnya
            static void sayHelloWorld(){
                System.out.println("Hello world 1");
                System.out.println("Hello world 2");
                System.out.println("Hello world 3");
            }

            //** METHOD PARAMETER
                    // untuk mengeksekusi method ini cukup panggil nama methodnya dengan variabelnya
            static void sayHello (String firstName, String lastName){
                System.out.println(("Hello " + firstName + " " + lastName));
            }

            //*** METHOD RETURN VALUE
            static int hasil(int value1, int value2){
                var total = value1 + value2; // variabel baru (var hasil operasi)
                return total; // mengembalikan operasi var total ke main
            }

            //**** METHOD RETURN VALUE NESTED
            static int hitung (int value1, String operasi, int value2) {
                switch (operasi) {
                    case "+":
                        return value1 + value2;
                    case "-":
                        return value1 - value2;
                    default:
                        return 0; // operasi tidak bisa dilakukan
                }
            }

            //***** METHOD TANPA VARIABEL ARGUMENT
            static void sayCongrast(String name, int[] values){
                                    //    (var , array)

                // RATA RATA
                int total = 0;
                for(var value : values) { // var value dimasukan ke array values
                    total += value; // total akan ditambah value setiap loop
                }

                int finalValue = total /values.length; // Total dibagi banyak anggota array

                if (finalValue >= 75) {
                    System.out.println("selamat " + name + "  Anda lulus");
                }else {
                    System.out.println("Maaf" + name + " Anda tidak lulus" );
                }
            }

            //***** METHOD DENGAN VARIABEL ARGUMENT
                static void sayCongrast1(String name1, int... values1){
                    //    (var , array)

                    // RATA RATA
                    int total1 = 0;
                    for(var value1 : values1) { // var value dimasukan ke array values
                        total1 += value1; // total akan ditambah value setiap loop
                    }

                    int finalValue1 = total1 /values1.length; // Total dibagi banyak anggota array

                    if (finalValue1 >= 75) {
                        System.out.println("selamat " + name1 + "  Anda lulus");
                    }else {
                        System.out.println("Maaf" + name1 + " Anda tidak lulus" );
                    }

                }

            //****** METHOD OVERLOADING
            static void sayHello1(){
                System.out.println("Hello");
            }
            static void sayHello1(String name) {
                System.out.println("Hello" + name);
            }
            static void sayHello1(String firstname, String lasname) {
                System.out.println("Hello" + firstname + lasname);
            }

            //****** REQURSIVE METHOD

        //-- Factorial Loop
            static int factorialLoop(int value){
                var result = 1;
                for (int i = 1; i <= value; i++) {  // 1 * 2 * 3 *... value
                    result *= i;
                }
                return result; // mengembailan result
                }
                static int factorialRecursive (int value){
                if (value == 1) {
                    return 1;
                }else {
                    return value * factorialRecursive(value-1);
                }
                }

         //******* ERROR STACKOVERFLOW
            static void loop(int value){
                if (value == 0) {
                    System.out.println("selesai");
                }else {
                    System.out.println("loop " + value);
                    loop(value-1);
                }
    }

            }



