package JavaDasar.f_Looping;

public class Continue_Return_Break {
    public static void main (String[] args){

        // break, continue, dan return

        int a = 0;

        while(true){
            a++;

            if(a == 10){
                break;
                // ini adalah keyword untuk memaksa keluar dari loop
            } else if(a == 5){
                continue;
                // ini adalah keyword untuk memaksa memulai aksi dari awal ( di skip)
            } else if (a == 12){
                return; // ini adalah keyword  memberhentikan program
            }
            System.out.println("looping ke - " + a);

        }

        System.out.println("akhir dari looping");

    }
}

