package JavaDasar.f_Looping;

public class For_Loop {
    public static void main (String[] args){

//        for (inisialisasi; kondisi; step nilai){
//
//            aksi;
//
//        }

        // inisialisasi : nilai awal yang kita masukan kedalam looping ( nilai = ..,)
        // kondisi : suatu kondisi dari sebuah variabel/ operator (while (kondisi) }
        // Step nilai : program yang ditaruh pada sebuah variabel (nilai++)
        // aksi : sebuah perintha dalam mengeluarkan output ( Pritnln dll)

        System.out.println("ini adalah awal program");
        System.out.println("loop pertama");

        for(int nilai = 0; nilai <= 10 ; nilai++){
                         // nilai kurang dari sama dengan 10 nilai true kalau lebih nilai false

            System.out.println("for loop ke-" + nilai);

        }


        System.out.println("loop kedua");

        for(int nilai = 0; nilai < 10 ; nilai++){ //increment

            System.out.println("for loop ke-" + nilai);

        }

        System.out.println("loop ketiga"); // nilainya akan menghitung mundur

        for(int nilai = 10; nilai >= 5 ; nilai--){

            System.out.println("for loop ke-" + nilai);

        }

//        System.out.println("loop keempat"); // selama nilai true maka akan tetap looping
//
//        int nilai = 0;
//
//        for(; true ;){
//
//            System.out.println("for loop ke-" + nilai);
//            nilai++;
//        }

        System.out.println("ini adalah akhir program");

    }
}
