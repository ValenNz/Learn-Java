package JavaDasar.e_Percabangan;

public class If_Bersarang {
    public static void main(String[] args){


        // nested if atau if bersarang

        int a = 5;
        int b = 11;

        System.out.println("ini adalah awal dari program");

        if (a == 5){

            if (b == 10){ // jika a dan b true maka akan menjalankan aksi ini

                System.out.println("ini adalah dimana a = 5 dan b = 10");

            } else { // jika b false maka akan menjalankan aki ini

                System.out.println("ini adalah dimana a = 5 dan b bukan 10");

            }

        } else { // jika a false maka akan menjalankan aksi ini

            System.out.println("ini adalah dimana a salah");

        }

        System.out.println("ini adalah akhir dari program");
    }
}
