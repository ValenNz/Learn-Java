package JavaDasar.e_Percabangan;

public class Ternary {

    /*                  PENGERTIAN
        Ternary operator adalah operator sederhana dari if statement
        Ternary operator terdiri dari  kondisi yang dievaluasi, jika menghasilkan true maka nilai pertama diambil, jika false, maka nilai kedua diambil

        operation:
        var x = expresi ? statment_true : statment_false
     */
    public static void main(String[] args) {

        // SourceCode tanpa Ternary Operator
        var umur = 20;
        String say ;
        if(umur >20){
            say = "Kapan nikah ? ";
        } else {
            say = "Kuliah dimana ?";
        }
        System.out.println(say);

        // SourceCode dengan Ternary Operator
        var nilai = 75;
        String ucapan = nilai >= 75 ? "Selamat Anda Lulus" : "Silahkan Coba lagi";

        System.out.println(ucapan);
        }
}
