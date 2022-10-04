package JavaDasar.f_Looping;

public class Looping_Bersarang {
    public static void main (String[] args){

        // looping bersarang

        for(int i = 0; i < 5; i++){ // lopping ke bawah
            for(int j = 0; j < 5; j++){ // looping ke kanan
                System.out.print("* ");
            }
            System.out.print("\n"); // untuk menambahkan kebawahnya (enter)
        }

        // Membuat segitiga
        System.out.print("\n");

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("* ");
                if(i == j){
                    break;
                }
            }
            System.out.print("\n");
        }

        // membuat segitiga kebaalik
        System.out.print("\n");

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print("* ");
                if ( (i+j) == 4){
                    break;
                }
            }
            System.out.print("\n");
        }

        // membuat segitiga sama kaki hadap kanan
        System.out.print("\n");

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                System.out.print("* ");
                if (i == j){
                    break;
                } else if ( (i+j) == 8){
                    break;
                }
            }
            System.out.print("\n");
        }



    }
}
