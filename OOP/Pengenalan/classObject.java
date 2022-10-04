package OOPKT.Pengenalan;


class Mahasiswa {
    // Deklarasi atributr /variabel
    String nama, NIM, jurusan;
    double IPK, Umur;

}

public class    classObject {
    public static void main(String[] args) {
        int x;
        // BODY CLASS

// OBJECT 1
        Mahasiswa mahasiswa1 = new Mahasiswa(); // instansiasi / membuat object
        mahasiswa1.nama = "Nuevalen Refitra Alswando"; // memberi nilai variabel
        mahasiswa1.NIM = "28746";
        mahasiswa1.jurusan = "Teknologi Informatika";
        mahasiswa1.IPK = 4.0;
        mahasiswa1.Umur = 16;

        System.out.println(mahasiswa1.nama); // akan null jika belum diisi
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.Umur);

// OBJECT 2
        System.out.println("\n");
        Mahasiswa mahasiswa2 = new Mahasiswa(); // instansiasi / membuat object
        mahasiswa2.nama = "Recha Audria Reimerti Elswinda"; // memberi isi
        mahasiswa2.NIM = "250303";
        mahasiswa2.jurusan = "Statistik";
        mahasiswa2.IPK = 4.0;
        mahasiswa2.Umur = 18;

        System.out.println(mahasiswa2.nama); // akan null jika belum diisi
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.Umur);


    }

}


