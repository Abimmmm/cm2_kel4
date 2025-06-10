public class Transaksi {
    Kendaraan kendaraan;
    BBM bbm;
    double liter, totalBayar;

    Transaksi(Kendaraan kendaraan, BBM bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
        
    }

    public void tampil() {
        System.out.println(kendaraan.platNomor + ": " + bbm.hargaPerLiter * liter );
    }
}
