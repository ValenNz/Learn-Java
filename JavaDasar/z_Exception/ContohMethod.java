package JavaDasar.z_Exception;

import java.io.FileInputStream;
import java.io.IOException;

public class ContohMethod {
    public static void main(String[] args) throws IOException { // Exception di handle IO

        FileInputStream inputFile = new FileInputStream("input.txt");

        System.out.println((char)inputFile.read());

        System.out.println("akhir dari program");

    }
}
