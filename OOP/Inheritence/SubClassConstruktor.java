package OOPKT.Inheritence;

class ParentConstructor{
    // attribute
    String name;
    int umur;

    //constructor
    ParentConstructor(String name, int umur){
        this.name = name;
        this.umur = umur;
    }

    ParentConstructor(String name){
        this.name = name;
    }

    void show(){
        System.out.println("Name : " + this.name);
    }
}

// Sub class
class ChildConstructor extends ParentConstructor{

    //Constructor
    ChildConstructor(String name,int umur){
        super(name,umur); // cara memanggil constructor di parent class
    }

    ChildConstructor(String name){
        super(name);
    }
}


public class SubClassConstruktor {
    public static void main(String[] args) {
        ParentConstructor name1 = new ParentConstructor("Supri",18); // use constructor superclass
        name1.show();

        ChildConstructor name2 = new ChildConstructor("Siti",19); // use constructor childclass dengan memanggil supermua
        name2.show();

        ChildConstructor name3 = new ChildConstructor("Siti");
        name3.show();
    }
}
