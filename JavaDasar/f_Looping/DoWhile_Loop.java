package JavaDasar.f_Looping;

public class DoWhile_Loop {
    public static void main (String[] args){

        System.out.println("ini adalah awal program");

        int a = 0;
        boolean kondisi = true;


        do {
            a++;
            System.out.println("do while ke-" + a);

            if (a == 10) { // untuk cek kondisi
                kondisi = false;
            }

        }while(kondisi); // jika kondisi = false maka aksi akan berjalan sekali

        System.out.println("ini adalah akhir program"); // jika kondisi = false maka ini akan diprint setelah aksu
    }
}

