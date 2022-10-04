package JavaDasar.f_Looping;

public class While_Loop {
    public static void main (String[] args){

        int a = 0;
        boolean kondisi = true;

        System.out.println("awal program");

        while (kondisi) {
            System.out.println("while loop ke-" + a);

          //a++; akan berhenti di 9

            if (a == 10){ // cara menganti kondisi ditengah jalan
                kondisi = false;
            }

            a++; // akan berhenti di 10
        }

        System.out.println("akhir program"); // jika false maka akan meng-print ini

    }
}

