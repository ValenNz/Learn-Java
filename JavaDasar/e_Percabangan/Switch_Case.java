package JavaDasar.e_Percabangan;

import java.util.Scanner;

public class Switch_Case {
        // switch case

        public static void main(String[] args){

            String input;
            Scanner inputUser = new Scanner(System.in);

            System.out.print("panggil nama: "); // untuk memasukan nama
            input = inputUser.next(); // untuk mengambil string (memasukan nama)

            // ekspresinya berupa satuan (int,long,byte,short), String, atau enum
            switch(input){
                case "otong": // jika yang di masukan "otong"
                    System.out.println("saya otong dan hadir Bos!!!"); // maka akan menampilkan aksi ini
                    break; // supaya statement selanjutnya tidak dieksekusi jika statment sebelumnya terpenuhi
                case "ucup":
                    System.out.println("saya ucup dan hadir Bos!!!!");
                    break;
                case "mario":
                    System.out.println("saya mario dan hadir Bos!!!!");
                    break;
                default: // jika yang dimasukan tidak ada pada case(else)
                    System.out.println(input + " tidak hadir Bos!!!");
            }

            System.out.println("selesai program");

        }

    }

