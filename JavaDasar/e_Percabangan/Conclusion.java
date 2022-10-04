package JavaDasar.e_Percabangan;

public class Conclusion {
    public static void main(String[] args) {

        var nilai = 80;
        var absen = 90;

        // IF statment
        if (nilai >= 80 && absen >= 80) { // jika nilai dan absen >= 80
            System.out.println("Nilai A");

            // jika nilai dan absen tidak terpenuhi di if maka akan mengeksekusi else if
        } else if (nilai >= 70 && absen >= 70) {
            System.out.println("Niali B");
        } else if (nilai >= 60 && absen >= 60) {
            System.out.println("Nilai C");
        } else if (nilai >= 50 && absen >= 50) {
            System.out.println("Niali D");
        } else if (nilai >= 40 && absen >= 40) {
            System.out.println("Nilai E");
            //jika if dan else if tidak tepilih maka akan mengeksekusi else
        } else {
            System.out.println("KAPOK");
        }

        // SWITCH CASE STATMENT
        System.out.println("");

        var mapel = "A";

        switch (mapel) { // nilai if switch
            case "A":
                System.out.println("Sangant Baik");
                break; // untuk memberhentikan percabangan
            case "B":
            case "C":
                System.out.println("Baik");
                break;
            case "D": // nilai else if case
                System.out.println("Cukup Baik");
                break;
            default: // nilai else switch
                System.out.println("COBA LAGI");
        }

        // SWITCH LAMBDA (->)
                // menyingkat switch case
        switch (mapel) {
            case "A" -> System.out.println("Sangat Baik");
            case "B", "C" -> System.out.println("Baik");
            case "D" -> System.out.println("cukup Baik");
            default -> {
                System.out.println("Ulangi");
                System.out.println("kapok");
                System.out.println("sukur");
            }
        }

        // Kata kunci tanpa yield
        String ucapan;
        switch (mapel) {
            case "A" -> ucapan = "Sangat Baik";
            case "B", "C" -> ucapan = "Baik";
            case "D" -> ucapan = "cukup Baik";
            default -> {
                ucapan = "Ulangi";
            }
        }
        System.out.println(ucapan);

        // Kata kunci dengan yield
                // menyingkat switch lambda
        ucapan = switch (mapel) {
            case "A":
                yield "Sangat Baik";
            case "B", "C":
                yield "Baik";
            case "D":
                yield "cukup Baik";
            default:
                yield "Ulangi";
        };
        System.out.println(ucapan);

    }
}
