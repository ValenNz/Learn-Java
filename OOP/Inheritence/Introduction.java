package OOPKT.Inheritence;

/**
 * Inheritance (Pewarisan) - Memberikan warisan (ortu)
 *                         - warisanya (mobil rumah dll)
 *                         - Mendapatkan warisan (anak)
 * Inheritance adalah hubungan si a
 */

// super class, parent class, base class
class Inheritence {
        String name;

        // Method
        void show(){
                System.out.println("Name : ");
        }
}

// subclass, child class, derived class
class Inheritence1 extends Inheritence{ // akan mendapatkan warisan (akan mendapat atribute dari Inheritence)
        // hampa
}

class Inheritence2 extends Inheritence{
        // tanpa atribute
}

// brain class
public class Introduction {
        public static void main(String[] args) {
                Inheritence jeneng1 = new Inheritence();
                jeneng1.name = "Baim";
                jeneng1.show();

                Inheritence1 jeneng2 = new Inheritence1();
                jeneng2.name = "upik";
                jeneng2.show();

                Inheritence2 jeneng3 = new Inheritence2();
                jeneng3.name = "Judi";
                jeneng3.show();
        }
}
