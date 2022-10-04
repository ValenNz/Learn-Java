package TugasBuanisa;

public class GajiPegawai {

//deklarasi variabel dengan modifier private

    public double gajiKotor;

    private double pajak, gajiBersih;

    private double potongan=75000;

    private String nama = "Surya";

    public void setGaji(double gaji){ //mengatur nilai gajiKotor

        gajiKotor=gaji;
    }
    public void hitungPajak(){ //menghitung nilai pajak
        pajak=0.2*gajiKotor;

    }

    public void hitungGaji(){ //menghitung nilai gajiBersin
        gajiBersih=gajiKotor-pajak-potongan;

    }

    public String namaPegawai(){ //menampilkan nama
        return nama;

    }

    public double getGajiKotor(){ //menampilkan nilai gajikotor
        return gajiKotor;

    }

    public double getPajak(){ //menampilkan nilai pajak
        return pajak;

    }

    public double getPotongan(){ //menampilkan nilai potongan
        return potongan;

    }

    public double getGajiBersih(){ //menampilkan nilai gajiBersin
        return gajiBersih;

    }


}
