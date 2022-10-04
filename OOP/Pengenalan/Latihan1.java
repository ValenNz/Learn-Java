package OOPKT.Pengenalan;

// Player
class Player {
    String name;
    double health;
    int level;

    // Object Member
    Weapon weapon;
    Armour armour;

    // Constructor untuk mmembuat player
    Player(String name, double health){
        this.name = name;
        this.health = health;
    }

    // Method untuk mengequip weapon
    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    // Method untuk menggunakan armour
    void equipArmour(Armour armour){
        this.armour = armour;
    }


    // Method supaya player saling menyerang
    void attack(Player enemy){
        double attackPower =this.weapon.attackPower;
        System.out.println(this.name + " attacking " + enemy.name + " with power " + attackPower);
        // Player mendapatkan damage
        enemy.defence(attackPower);
    }


    // Method supaya player bertahan
    void defence(double attackPower){

        // akan mengambil damage
        double damage;
        if (this.armour.defencePower < attackPower){ // memberikan damage
            damage = attackPower - this.armour.defencePower;
        }else {
            damage = 0;
        }
        this.health -= damage; // mengurangi darah player
        System.out.println(this.name + " gets damage " + damage);

    }



    // Method untuk menampilkan hasil
    void display(){
        System.out.println("\nName : " + this.name );
        System.out.println("Health : " + this.health+ " hp");
        this.weapon.display();
        this.armour.display();
    }
}

// Senjata
class Weapon {
    double attackPower;
    String name;

    // constructor
    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }
    void display(){
        System.out.println("Weapon : " + this.name + " , attack : " + this.attackPower );
    }
}

// Armor
class Armour {
    double defencePower;
    String name;

    // constructor
    Armour(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;

    }
    void display(){
        System.out.println("Armour : " + this.name + " , defence : " + this.defencePower );
    }
}


public class Latihan1 {
    public static void main(String[] args) {

        // membuat object player
        Player player1 = new Player ("Valen",100);
        Player player2 = new Player ("Recha",150);

        // membuat object weapon
        Weapon pedang = new Weapon("pedang", 20);
        Weapon tolop = new Weapon("tolop", 10);

        // membuat object armour
        Armour bajuBesi = new Armour("Baju besi",50);
        Armour bajukayu = new Armour("Baju kayu",30);

        // Player 1
        player1.equipWeapon(pedang);
        player1.equipArmour(bajuBesi);
        player1.display();

        // Player 2
        player2.equipWeapon(tolop);
        player2.equipArmour(bajukayu);
        player2.display();

        // Fighting
        System.out.println("\nFIGTHING");
        System.out.println("\nEpisode - 1\n");
        player1.attack(player2); // player 1 akan attack player 2 akan defence
        player1.display();
        player2.display();
        System.out.println("\nEpisode - 2\n");
        player2.attack(player1);
        player1.display();
        player2.display();
    }
}
