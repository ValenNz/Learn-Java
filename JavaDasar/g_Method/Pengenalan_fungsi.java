package JavaDasar.g_Method;

public class Pengenalan_fungsi {

    // fungsi utama yang selalu dipanggi
    public static void main(String[] args) {

        // y = (x+2) * x = rumus fungsi

        // deklarasi var
         int x,y;

         // operasi fungsI (method hitung)
        x = 10;
        y = hitung(x);
        System.out.println("x = " + x + ", y = " + y);

        // Fungsi
        x = 20;
        y = (x+2) * x;
        System.out.println("x = " + x + ", y = " + y);


        // method jumlah
        System.out.println(hitung(2));
        System.out.println(jumlah(1,4)); // memberi nilaI disini
    }



    private static int hitung (int input){ // didalam class

        int hasil = (input+2)*input;

        return hasil;
    }

    public static int jumlah (int a, int b){

        int jum = a * b;

        return jum ;
    }

}
