package JavaDasar.b_DataType.String;

import java.lang.StringBuilder;

public class Builder {
    public static void main(String[] args) {

        // DEKLARASI
        StringBuilder builder = new StringBuilder("halo");
        printData(builder);

        // append (menambahkan)
        System.out.println("\n===== APPEND =====");
        builder.append(" semuanya");
        printData(builder);

        builder.append(" warga Surabaya");
        printData(builder);

        // insert (menambahkan diantara)
        System.out.println("\n===== INSERT =====");
        builder.insert(19," Kota");
        printData(builder);

        // delete (menghapus string)
        System.out.println("\n===== DELETE =====");

        builder.delete(19,24);
        printData(builder);

        // rubah character pada index tertentu
        System.out.println("\n===== CHANGE CHAR =====");
        builder.setCharAt(14,'W');
        printData(builder);

        // replace (mengganti satu kata dengan kata lain)
        System.out.println("\n===== REPLACE =====");
        builder.replace(20,28,"Bandung");
        printData(builder);

        // casting menjadi string (string builder ke string)
        System.out.println("\n===== CASTING TO STRING =====");
        String kalimat = builder.toString();
        System.out.println(kalimat);
        int addressString = System.identityHashCode(kalimat);
        System.out.println("address = " + Integer.toHexString(addressString));

    }

    // Method
    private static void printData(StringBuilder dataBuilder){
        System.out.println("data = " + dataBuilder);
        System.out.println("panjang = " + dataBuilder.length());
        System.out.println("kapasitas = " + dataBuilder.capacity());

        int addressBuilder = System.identityHashCode(dataBuilder);
        System.out.println("address = " + Integer.toHexString(addressBuilder));
    }
}
