package JavaDasar.z_Exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Pengenalan {
    public static void main(String[] args) {

        // DEKLARASI
            int[] array = {0,1,2,3};
            FileInputStream fileInput = null;           // menandakan bahwa object masih kososng

            /* Input User */
            Scanner userInput = new Scanner(System.in);
            System.out.print("nilai array ke: ");
            int index = userInput.nextInt();



            /* Penangan Diluar batas (input > 4) */
            try {                                                                   // Mencoba Program
                System.out.printf("index ke-%d, adalah %d\n", index, array[index]); // massage error
            } catch (ArrayIndexOutOfBoundsException e){                             // Menamngkap error
                System.err.println(e);                                              // e (exception) err (menjadikan warna merah)
            }


            /* Handling IO not Found */
            try {                                                   // Mencoba program
                fileInput = new FileInputStream("input.txt"); // instansiasi
            } catch (IOException e){                                //  Menangkap error program
                System.err.println(e);                              // e (exception) err (menjadikan warna merah)
            } finally {
                System.out.println("Yee selesai");
            }



            /* Combine Exception */
            try {                                                                               // Mencoba program
                System.out.printf("index ke-%d, adalah %d\n", index, array[index]);
                fileInput = new FileInputStream("input.txt");                             // instansiasi
            } catch (ArrayIndexOutOfBoundsException e){                                         //  Menangkap error program (Exception Handling)
                System.err.println("Index yang anda masukan tidak sesuai dengan jumlah array");
            } catch (IOException e){                                                            //  Menangkap error program (IO Exception)
                System.err.println("file tidak ditemukan");
            }


            /* Finaly */
            try {
                System.out.printf("index ke-%d, adalah %d\n", index, array[index]);
            } catch (ArrayIndexOutOfBoundsException e){
                System.err.println("Index yang anda masukan tidak sesuai dengan jumlah array");
            } finally {
                System.out.println("finally"); // akan dijalankan ketika 2 exception dijalankan (mengeclose file yang telah dibuka)
            }

            System.out.println("\nakhir dari program"); // akan tetap berjalan meskipun [rogram error
        }
    }
