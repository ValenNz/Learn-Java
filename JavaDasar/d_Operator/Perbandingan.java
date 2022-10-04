package JavaDasar.d_Operator;

public class Perbandingan {
    public static void main(String[] args) {

        // operator komparasi...ini akan menghasilkan nilai dalam bentuk boolean

        int a,b;
        boolean hasilKomparasi;

        // operator equal atau persamaan
        System.out.println("----- PERSAMAAN");
        a = 10;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s \n",a,b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s \n",a,b, hasilKomparasi);

        // operator not equal atau pertidaksamaan
        System.out.println("\n----- PERTIDAKSAMAAN");
        a = 10;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n",a,b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n",a,b, hasilKomparasi);

        // operator less than atau kurang dari
        System.out.println("\n----- KURANG dari");
        a = 9;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n",a,b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n",a,b, hasilKomparasi);

        // operator greater than atau lebih dari
        System.out.println("\n----- LEBIH dari");
        a = 9;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n",a,b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n",a,b, hasilKomparasi);

        // operator less than equal atau kurang dari sama dengan
        System.out.println("\n----- KURANG DARI SAMA DENGAN");
        a = 9;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n",a,b, hasilKomparasi);

        a = 10;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n",a,b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n",a,b, hasilKomparasi);

        // operator greater than equal atau lebih dari sama dengan
        System.out.println("\n----- LEBIH DARI SAMA DENGAN");
        a = 9;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n",a,b, hasilKomparasi);

        a = 10;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n",a,b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n",a,b, hasilKomparasi);

        /*              CONSLUSION
        int v1 = 100;
        int v2 = 100;

        System.out.println(v1>v2); // lebih dari
        System.out.println(v1<v2); // kurang dari
        System.out.println(v1>=v2); // lebih dari sama dengan
        System.out.println(v1<=v2); // kurang dari sama dengan
        System.out.println(v1==v2); // sama dengan
        System.out.println(v1!=v2); // tidak sama dengan


        1, 2, ,3 ,4 ,5 ,6 ,7 , 8, 9, 10
         */

    }
}
