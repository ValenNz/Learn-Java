package OOPKT.Pengenalan;

class Pelajar{

    // Deklarasi atribute atau variabel
    String nama , NIM;

    // Construktor
    Pelajar(String nama, String NIM){
        //interlocal
        this.nama = nama;
        this.NIM = NIM;
    }

    // Method tanpa return dan parameter
    void show(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.NIM);
    }

    // Method tanpa return dengan parameter
    void setNama(String nama){
        this.nama = nama;
    }

    // Method dengan return tanpa parameter
    String getNama(){
        return  this.nama;
    }
    String getNIM(){
        return this.NIM;
    }

    // Method dengan return dan parameter
    String sayHai(String massage){
        return massage + " Hallo bro, jenengku " + this.nama;
    }
}

class Dosen{
        String nama;

        Dosen (String nama){
            this.nama = nama;
}
}

public class Method {
    public static void main(String[] args) {
        // menambahkan nilai var constructor
        Pelajar pelajar1 = new Pelajar("Nuevalen Refitra Alswando","051106");
        System.out.println(pelajar1.nama);
        System.out.println(pelajar1.NIM);

        // Output Method tanpa return dan parameter
        pelajar1.show();

        // Output Method tanpa return dengan parameter
        pelajar1.setNama("Recha Audria Reamutri Elsiwnda");
        pelajar1.show();

        // Output Method dengan return tanpa parameter
        System.out.println(pelajar1.getNama());
        System.out.println(pelajar1.getNIM());

        // Output Method dengan return dan parameter
        String data = pelajar1.sayHai("Cewek");
        System.out.println(data);

        // Output construktor
        Dosen dosen1 = new Dosen("Jarwo");
        // dosen1. // kita tidak bisa menemoelkan pada cllass dosen
        // karna say hai hanya menmepel pada class pelajar
    }
}
