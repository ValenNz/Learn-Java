package JavaDasar.z_Exception;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {

        /* Deklarasi Array */
        int[] arrayData = {0,1,2,3};

        /* Input User */
        Scanner userInput = new Scanner(System.in);
        System.out.print("data ke-:");
        int indexInput = userInput.nextInt();

        /* Default Exception */
        System.out.println("Exception biasa");
        try {                       // Mencoba program
            System.out.printf("data dari array ke-%d adalah %d\n\n", indexInput, arrayData[indexInput]);
        } catch (Exception e){      // Menangkap error program
            System.err.println(e);  // err = tulijan menjadi merah | e = exception (error)
        }



        /* Exception Inside Function */
        System.out.println("\nException dalam fungsi");
        int data = ambilDataDariArray(arrayData, indexInput);                       // Menyamankan bhwa data = array data dan index input
        System.out.printf("data dari array ke-%d adalah %d\n\n", indexInput, data); // %d (angka/desimal)



        /* Exception throws by Method */
        System.out.println("Exception throws by method");

        /* Deklarasi */
        int data2 = 0;

        try{                        // Mencoba Program
            data2 = ambilData(arrayData, indexInput);
        } catch (Exception e) {     // Menangkap error program
            System.err.println(e);  // err = tulijan menjadi merah | e = exception (error)
        }

        System.out.printf("data dari array ke-%d adalah %d\n\n", indexInput, data2);

        System.out.println("\n\nakhir dari program");
    }




    /* Method Exception Inside Function (Return Value) */
    private static int ambilDataDariArray(int[] array, int index){
        /* Deklarasi  */
        int hasil = 0; // menyeting var hasil jadi 0

        try {                       // Mencoba program
            hasil = array[index];   // menyamakan bahwa var hasil merupakan index array
        } catch (Exception e){      // Menamngkap error
            System.err.println(e);  // err = tulijan menjadi merah | e = exception (error)
        }

        return hasil;               // Mengembalikan value hasil
    }



    /* Method Exception throws by Method (Return Value) */
    private static int ambilData(int[] array, int index) throws Exception { //kita lempar exceptionyas ke tempat yang memanggil fungsinya
        int hasil = array[index]; // mengakses index dari array
        return hasil;
    }



}
