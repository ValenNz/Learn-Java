package TugasBuanisa;

public class Toko {
    public double BT = 2500;
    public double AT = 5000;
    public double BM = 3500;

    public double total;
    public double ibarang;
    public double kembalian;

    private String nama = "pasha";

    private String pass = "123";

    public void setbarang(int barang){
        if (barang==1){
            ibarang = BT;
        }else if (barang==2){
            ibarang = AT;
        }else if (barang==3){
            ibarang = BM;
        }
    }

    public void setbanyak(double jumlah){
        total = jumlah*ibarang;
    }

    public void kembali(double in){
        kembalian = in-total;
    }

    public String inama(){
        return nama;
    }

    public String ipass(){
        return pass;
    }

    public double itotal(){
        return total;
    }

    public double ikembali(){
        return kembalian;
    }
}
