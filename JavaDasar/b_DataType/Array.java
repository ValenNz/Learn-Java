package JavaDasar.b_DataType;

public class Array {
    public static void main(String[] args) {

                // Membuat Array
                String[] arrayString = new String[3];
                arrayString[0] ="Valen";
                arrayString[1] ="Ganteng";
                arrayString[2] ="Sekali";

                System.out.println(arrayString[0]);
                System.out.println(arrayString[1]);
                System.out.println(arrayString[2]);

                // Array Initialixer
                int[] arrayint = new int[]{10,29,39,38,23};
                int[] arrayLong  ={12,93,8,4};

                System.out.println(arrayint[0]);
                System.out.println(arrayLong[1]);

        /*              Operasi di array
            array[index]   |    mengabil data di array
            array[index] = |    value mengubah data di array
            array.length = |    mengambil panjang array
         */

                //              Sourc code opersi
                long[] arrayLong2 = {10,28,39,27};

                arrayLong2[3] = 0; // menghapus data arraysebenernya tdk dapat dihapus hanya mengkosongkan)
                arrayLong2[0] = 100; // mengganti var index d array

                System.out.println(arrayLong2[0]); // output index baru
                System.out.println(arrayLong[1]); // ouput index 1
                System.out.println(arrayLong2.length); // melihat panjang array

        /* Array Multi Dimensi
                    0       1       2
               0 {"Nue" , "Valen" , "Refitra"},
               1 {"halo", "ges"   , "what"   },
               2 {"up"  , "bsjxxb", "hsbx"   },
                };

         */
                String[][] members = {

                        {"Nue", "Valen", "Refitra"},
                        {"halo", "ges", "what"},
                        {"up", "bsjxxb", "hsbx"},
                };
                System.out.println(members[0][0]);
                System.out.println(members[1][1]);
            }
        }

