public class Transaksi {
    Kendaraan kendaraan;
    String jenisBBM;
    double liter;
    double hargaPerLiter;
    double totalBayar;

    public Transaksi(Kendaraan kendaraan, String jenisBBM, double liter, double hargaPerLiter) {
        this.kendaraan = kendaraan;
        this.jenisBBM = jenisBBM;
        this.liter = liter;
        this.hargaPerLiter = hargaPerLiter;
        this.totalBayar = liter * hargaPerLiter;
    }

    public void tampil() {
        System.out.println(kendaraan.platNomor + ": " + totalBayar );
    }
}
