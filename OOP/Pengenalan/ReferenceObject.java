package OOPKT.Pengenalan;

class book{
    String judul,penulis;

    book(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }

    void show(){
        System.out.println("\nPenulis \t: " + this.judul);
        System.out.println("Penulis \t: " + this.penulis);
    }
        }

public class ReferenceObject {
    public static void main(String[] args) {

        book book1 = new book("Danur", "Risa saraswati");
        book1.show();

        // Menampilkan address
        String addressBook1 = Integer.toHexString(System.identityHashCode(book1));
        System.out.println(addressBook1);

        // Assigment Object
        book book2 = book1;
        book2.show();

        String addressBook2 = Integer.toHexString(System.identityHashCode(book2));
        System.out.println(addressBook2);

        book book3 = new book("Killing me inside", "Sutrii");
        book3.show();

        String addressBook3 = Integer.toHexString(System.identityHashCode(book3));
        System.out.println(addressBook3);

        // karena buku 1 dan buku 2 berada pada addres yang smama maka :
        book1.judul = "Setan";
        book1.show();
        book2.show();
        book3.show();

        // memasukan object dalam method
        fungsi(book2);
        book1.show();
        book2.show();

    }

    public static void fungsi(book dataBook){
        String addressDataBook = Integer.toHexString(System.identityHashCode(dataBook));
        System.out.println("Address dalam fungsi : " + addressDataBook);
        dataBook.penulis = "Budi sutomo";

    }
}
