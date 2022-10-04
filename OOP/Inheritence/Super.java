package OOPKT.Inheritence;

/**
 * This akan me acc atribute didalam classnya sendiri
 * akan tetapi jika tidak memiliki atribute maka akan mengambil dari class induk

 * Super akan me acc atribute dari induk
 */
class ParentSuper{
    String name = "Recha";

    void display(){
        System.out.println("Ini adalah " + this.name);
    }

    void dummyMethod(){
        System.out.println("Method ini ada di superclass");
    }
}

class ChildSuper extends ParentSuper{
    String name = "Valen";

    void display(){
        System.out.println("Ini adalah " + super.name); // akan meacc atribute induk
        this.dummyMethod();
    }

    void displaySuper(){
        System.out.println("Ini adalah " + this.name); // akan meacc atribute induk
        super.dummyMethod();
    }

    void dummyMethod(){
        System.out.println("Method ini ada di subclass");
    }
}


public class Super {
    public static void main(String[] args) {
        ParentSuper siswa1 = new ParentSuper();
        siswa1.display();
        ChildSuper siswa2 = new ChildSuper();
        siswa2.display();
        siswa2.displaySuper();

    }
}
