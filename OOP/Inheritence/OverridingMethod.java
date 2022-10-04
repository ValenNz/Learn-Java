package OOPKT.Inheritence;


class Overriding{
    String name;

    // Method
    void show(){
        System.out.println("\nName : " + this.name);
    }
}

class Overriding1 extends Overriding{
    double Bb;

    void show(){
        System.out.println("\nAdd object Overriding");
        System.out.println("Name : " + this.name);
        System.out.println("Bb   : " + this.Bb);
    }
}

class Overriding2 extends Overriding{

}

public class OverridingMethod {
    public static void main(String[] args) {
        Overriding jeneng1 = new Overriding();
        jeneng1.name = "Roanldo";
//      jeneng1.Bb = 100; nggak punya
        jeneng1.show();

        Overriding1 jeneng2 = new Overriding1();
        jeneng2.name = "Kanna";
        jeneng2.Bb = 100;
        jeneng2.show();

        Overriding2 jeneng3 = new Overriding2();
        jeneng3.name = "Hashimoto";
        jeneng3.show();

    }
}
