package OOPKT.Encaptulation;

import org.w3c.dom.ls.LSOutput;

/**
Membuat method yang sama namun perilakunya berbeda
 */


// Overloading Constructor
class Play{
    // Deklarasi
    private String name;
    private static int jumlahPlayer; // pasti 0

    // Overloading constructor opsi 1
    Play(String name){
        Play.jumlahPlayer++; // akan selalu menambah
        this.name = name;
    }

    // Overloading constructor opsi 2
    Play(){
        Play.jumlahPlayer++; // akan selalu nambah
        this.name = "player" +Play.jumlahPlayer;
    }

    void show(){
        System.out.println("Name : " + this.name);
    }

}

// Overloading Methos
class Matematika {

    public static int tambah(int x, int y){
        return x + y;
    }

    public static double tambah(int x, double y){
        return(double)x + y; // merubah int ke double
    }


}


public class OverloadingConstructorMethod {
    public static void main(String[] args) {

        // Overloading constructor
        Play player1 = new Play("Budi");
        Play player2 = new Play();
        Play player3 = new Play();
        Play player4 = new Play("Tretan");

        player1.show();
        player2.show();
        player3.show();
        player4.show();

        // Overloading Method
        int a = Matematika.tambah(10,5);
        System.out.println(a);
        double b = Matematika.tambah(10,0.98);
        System.out.println(b);
    }
}
