public class Kendaraan{
    String platNomor, jenisKendaraan, merk;

    public Kendaraan(String platNomor, String jenisKendaraan, String merk){
        this.platNomor = platNomor;
        this.jenisKendaraan = jenisKendaraan;
        this.merk = merk;
    }

    public String getPlatNomor(){
        return platNomor;
    }

    public String getJenisKendaraan(){
        return jenisKendaraan;
    }

    public String getMerk(){
        return merk;
    }
}