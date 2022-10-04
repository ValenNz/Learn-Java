package OOPKT.Encaptulation;

/**
 *  kita ingin membuat class dilindungi
 */

class Data{

    // Deklarasi
    public int intPublic;
    private int intPrivate; // tdk dapat dirubah
    private float floatPrivate; // tidak kebaca

    // Constuctor
    public Data(){
        this.intPublic = 0;
        this.intPrivate = 15;
    }

    // Menampilkan hasil
     void display() {
         System.out.println(this.intPublic);
         System.out.println(this.intPrivate);
         System.out.println(this.floatPrivate);
     }

    // Getter
    public int getIntPrivate(){ // membaca
        return this.intPrivate; // return private
    }

    // Setter
    public void setFloatPrivate(float value){
        this.floatPrivate = value;
    }

}

class Lingkaran{
    private double diameter;

    Lingkaran(double diameter){
        this.diameter = diameter;
    }

    // Setter | jari jari
    public void setJari2(double jari2){
        this.diameter = jari2;
    }

    // Getter
    public double getJari2(){
        return this.diameter/2;
    }

    // Hard Getter
    public double getLuas(){
        return 3.14*diameter*diameter/4;
    }
}





public class GetterSetter {
    public static void main(String[] args) {

// DATA CREATE
        Data object = new Data();

// PublicPUBLIC
        object.intPublic = 5; // Write
        System.out.println("Public : " + object.intPublic); // read

// PRIVATE
        // Private (read only) | Getter
        int angka = object.getIntPrivate();
        System.out.println("Getter : " + angka);

        // Private (Write only) | Setter
        object.setFloatPrivate(24);
        object.display();

        // Gabungkan read and write dng setter and getter
        Lingkaran object2 = new Lingkaran(5);
        System.out.println("Jari jari : " + object2.getJari2());
        object2.setJari2(14);
        System.out.println("Jari jari : " + object2.getJari2());

        System.out.println("Luas : " + object2.getLuas());


    }
}
