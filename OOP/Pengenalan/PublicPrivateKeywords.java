package OOPKT.Pengenalan;

class Game{
    //Deklarasi
    String name; // default, dia akan bisa dibaca dan ditulis   | Bisa di acc luar class
    public int exp; // public, dia akan bisa dibaca dan ditulis | Bisa di acc luar class
    private int health; //private, dia akan bisa dibaca dan ditulsi | Hanya bisa di acc didalam class saja


    // constructor
    Game(String name, int exp, int health){
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

    // Default modifier acces
    void display(){
        addExp(); // acc private method
        System.out.println("\nName\t:" + this.name);
        System.out.println("Exp\t   :" + this.exp);
        System.out.println("Health\t:" + this.health); // membaca tapi didalam class
    }

    // public
    public void setName(String newName){
        this.name = newName;
    }

    // private
    private void addExp(){
        this.exp += 100;
    }
}
public class PublicPrivateKeywords {
    public static void main(String[] args) {

        // membuat data
        Game player1 = new Game("Budi",0,100);

        // Default
        System.out.println(player1.name); // embaca data
        player1.name = "Tono"; // menulis data
        System.out.println(player1.name); // membaca data

        // Public
        System.out.println(player1.exp); // embaca data
        player1.exp = 100; // menulis data
        System.out.println(player1.exp); // membaca data

        //Private
//        System.out.println(player1.health); // Membaca data |
//        player1.health = 200; // menulis data               | Tidak bisa di acc
//        System.out.println(player1.health); // membaca data |

        // Method
        player1.display(); // memanggil method


        // Public
        player1.setName("Tejo");
        player1.display();

        // privaye
        // player1.addExp(); // tidak bisa acc dari luar
    }
}
