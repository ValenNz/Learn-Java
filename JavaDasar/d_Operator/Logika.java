package JavaDasar.d_Operator;

public class Logika {
    public static void main(String[] args) {

        /*                    PENGERTIAN
         Operator Logika --> operasi yang bisa kita lakukan kepada tipe data boolean
        */

        // DEKLARASI
        boolean a,b,c;

        // OR / atau (||)
        // tambah
        System.out.println("==== OR (||) =====");
        a = false;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);
        a = false;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + "  = " + c);
        a = true;
        b = false;
        c = (a||b);
        System.out.println(a + "  || " + b + " = " + c);
        a = true;
        b = true;
        c = (a||b);
        System.out.println(a + "  || " + b + "  = " + c);

        // AND / dan (&&)
        // kali

        System.out.println("\n==== AND (&&) =====");
        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);
        a = false;
        b = true;
        c = (a&&b);
        System.out.println(a + " && " + b + "  = " + c);
        a = true;
        b = false;
        c = (a&&b);
        System.out.println(a + "  && " + b + " = " + c);
        a = true;
        b = true;
        c = (a&&b);
        System.out.println(a + "  && " + b + "  = " + c);


        // XOR / exlusive or (^)
        // jika salah satu true hasil true jika 2 2 tru hasil false
        System.out.println("\n==== XOR (^) ======");
        a = false;
        b = false;
        c = (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        a = false;
        b = true;
        c = (a^b);
        System.out.println(a + " ^ " + b + "  = " + c);
        a = true;
        b = false;
        c = (a^b);
        System.out.println(a + "  ^ " + b + " = " + c);
        a = true;
        b = true;
        c = (a^b);
        System.out.println(a + "  ^ " + b + "  = " + c);


        // NOT / negasi --> flipping (!)
        System.out.println("\n==== NEGASI (!) ====");
        a = true;
        c = !a; // dibalik
        System.out.println(a + "  --> (!) = " + c);

        a = false;
        c = !a; // dibalik
        System.out.println(a + " --> (!) = " + c);

    }
}
