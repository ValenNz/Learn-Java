package OOPKT.Pengenalan;

// class tanpa consrtructro / class polos
class Polos{
    String dataString;
    int dataInteger;
        }


/* class dengan constructor = sesuatu method yag pertama kali dipanggil saat object dibuat */
class  Mahasiswi{
    // Deklarasi atributr / variabel
    String nama, NIM, Jurusan;


    // construktor tanpa parameter
    Mahasiswi(){
        System.out.println("\nIni adalah Constructor");
    }


    // constructor dengan parameter
    Mahasiswi(String inputNama, String inputNIM, String inputJurusan){
        // memasukan param ke var
        nama = inputNama;
        NIM = inputNIM;
        Jurusan = inputJurusan;

        // Output dengan cosntructor parameter
        System.out.println(nama );
        System.out.println(NIM);
        System.out.println(Jurusan);
    }
}


public class Constructor {
    public static void main(String[] args) {

        // isi tanpa connstruktor
        Polos objectPolos = new Polos();
        objectPolos.dataString = "Polos";
        objectPolos.dataInteger = 0;

        // output construktor
        System.out.println(objectPolos.dataString);
        System.out.println(objectPolos.dataInteger);

        // output constructor tanpa parameter
        Mahasiswi mahasiswi1 = new Mahasiswi();


        // pemberian nilai parameter pada constructor
        Mahasiswi mahasiswi2 = new Mahasiswi("\nNuevalen Refitra Alswando","051105","Teknologi Komputer");
        Mahasiswi mahasiswi3 = new Mahasiswi("Recha Audria Reimurti Elswinda","250303","Statistik");

    }
}
