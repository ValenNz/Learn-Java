package OOPKT.Polymorphism;

public class Polymorphism {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Puan");
        HeroStrength hero2 = new HeroStrength("Luhut");
        hero1.display();
        hero2.display();

        //polymorphic
        Hero hero3 = new HeroStrength("Maria");
        hero3.display();

        HeroIntel hero4 = new HeroIntel("Siti");
        hero4.display();

        Hero hero5 = new HeroAgility("Hitler");
        hero5.display();

        HeroAgility hero6 = new HeroAgility("Budi");
        hero6.display();
        hero6.showoff();

//        HeroIntel hero4 = new Hero("Budi"); // akan error berlaku kebawah bukan keatas
//        hero4.display(); // akan error karna hero strength beleum tentu hero

        // Array List
        System.out.println("===== ARRAY =====");
        Hero[] kumpulanHero = new Hero[4];
        kumpulanHero[0] = hero1;
        kumpulanHero[1] = hero2;
        kumpulanHero[2] = hero3;
        kumpulanHero[3] = hero6; // casting

        kumpulanHero[0].display();
        kumpulanHero[1].display();
        kumpulanHero[2].display();

        // Method calsls
//        kumpulanHero[3].showoff(); // Error

        // Aplikasi
        hero1.attack(hero2);
        hero1.attack(hero3);
        hero1.attack(hero4);



    }
}
