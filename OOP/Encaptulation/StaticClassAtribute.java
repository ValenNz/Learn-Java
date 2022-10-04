package OOPKT.Encaptulation;

import com.sun.security.jgss.GSSUtil;

/**
 * static = menaruh atribute aau var menempel [ada class
 */

// STATIC ATRIBUTE
class Display {
    public static String type = "Display"; // var ini dishare ke semuanya (semua var akan sama)
    private String name;

    Display(String name){
        this.name = name;
    }

    void setType(String typeInput){
//        type = typeInput; // alternatif 1
//        this.type = typeInput; // alternatif 2
        Display.type = typeInput; // alternatif 3
    }

    void show(){
        System.out.println("Display name : " + this.name);
    }
}

// STATIC METHOD
class Player1{
    private String name;

    Player1(String name){
        this.name = name;
    }



    void show(){
        System.out.println("Player name : " + this.name);
    }
}



public class StaticClassAtribute {
    public static void main(String[] args) {

        Display display1 = new Display("Laptop");
        display1.show();

        Display display2 = new Display ("HP");
        display2.show();

        // Mengganti variabel static\
//        display1.setType("Tampilan"); // alternatif 1
//        Display.type = "Baliho"; // alternatif 2
        Display.type = "Monitor"; // alternatif 2


        // Menampilakn static variabel
        System.out.println("\n+++ Menampilakn static variabel +++");
        System.out.println(display1.type);
        System.out.println(display2.type);
        System.out.println(Display.type);


        Player1 player1 = new Player1("Sutisna");
        Player1 player2 = new Player1("Budi");
        player1.show();
        player2.show();



    }
}
