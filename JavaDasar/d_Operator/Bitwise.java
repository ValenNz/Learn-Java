package JavaDasar.d_Operator;

public class Bitwise {
    public static void main(String[] args) {

        /*              PENGERTIAN
           operator khusus untuk menangani operasi logika bilangan biner dalam bentuk bit.
        */

        byte a = 3;
        byte b,c;
        String a_bits,b_bits,c_bits;


        // Operator SHIFT LEFT (Geser ke kiri)
        System.out.println("===== SHIFT LEFT (<<)");
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0'); //oldchar' ',new char'0' mengisi tempat kosong
        // menampilkan yang kosong
        // toBinayString (memindahkan binary ke string)
        // ("%8s" : menampilkan 8 buah karakter)
        System.out.printf("%s = %d \n",a_bits, a);

        b = (byte)(a << 3); // Menggeser ke kiri lagi
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bits, b);

        // Operator SHIFT RIGHT (Geser kanan)
        System.out.println("===== SHIFT RIGHT (>>)");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = (byte)(a >> 2); // Menggeser kekanan lagi
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bits, b);



        // Operator bitwise OR
        System.out.println("\n===== BITWISE OR (|)");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bits, b);
        System.out.println("--------------------OR");
        c = (byte)(a | b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n",c_bits, c);

        // Operator bitwise AND
        System.out.println("\n===== BITWISE AND (&)");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bits, b);
        System.out.println("--------------------AND");
        c = (byte)(a & b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n",c_bits, c);

        // Operator bitwise XOR
        System.out.println("\n===== BITWISE XOR (^)");
        a = 24;
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits, a);
        b = 12;
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ','0');
        System.out.printf("%s = %d \n",b_bits, b);
        System.out.println("--------------------XOR");
        c = (byte)(a ^ b);
        c_bits = String.format("%8s",Integer.toBinaryString(c)).replace(' ','0');
        System.out.printf("%s = %d \n",c_bits, c);


        // Operator Negasi / Not
        System.out.println("\n===== BITWISE NOT (~)");
        a = 24;
        b = (byte) (~a);
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d \n",a_bits, a);
        System.out.println("--------------------NOT");
        b_bits = String.format("%8s",Integer.toBinaryString(b).substring(24));
        System.out.printf("%s = %d \n",b_bits, b);

    }
}
