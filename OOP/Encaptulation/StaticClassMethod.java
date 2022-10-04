package OOPKT.Encaptulation;

import java.util.ArrayList;

class Pemain{

    private static int numberOfPlayer;
    private static ArrayList<String>  nameList = new ArrayList<String>();

    private String name;

    Pemain (String name){
        this.name = name;
        Pemain.numberOfPlayer++;
        Pemain.nameList.add(this.name);
    }

    void show(){
        System.out.println("Pemain name " + this.name);
    }

    // static method (menempelkan method ke class)
    static void showNumberOfPlayer(){ // menjadi getter
        System.out.println("Number fo player : " + Pemain.numberOfPlayer);
    }

    static ArrayList<String> getName() {
        return Pemain.nameList;

    }
}

public class StaticClassMethod {
    public static void main(String[] args) {
        Pemain pemain1 = new Pemain("Saitama");
        Pemain pemain2 = new Pemain("The Rock");
        Pemain pemain3 = new Pemain("Valen");
        Pemain pemain4 = new Pemain("Budi");

        Pemain.showNumberOfPlayer();

        // untuk memanggil semua nama
        System.out.println("Name : " + Pemain.getName());
    }
}
