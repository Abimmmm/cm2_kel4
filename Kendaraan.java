public class Kendaraan {
    String platNomor;
    String tipe;
    String merk;

    public Kendaraan(String plat, String tipe, String merk) {
        this.platNomor = plat;
        this.tipe = tipe;
        this.merk = merk;
    }

    void tampilkanInformasi () {
        System.out.println("Masukkan Plat Nomor : " + platNomor);
        System.out.println("Masukkan Jenis Kendaraan : " + tipe);
        System.out.println("Masukkan Merk : " + merk);
    }
}

//case 3 :
//system.out.println(">> Jumlah kendaraan dalam antrian : " + get.JumlahAntrian); (get.jumlahAntrian = print dengan memanggil fungsi dan menyesuaikan)
//break;

//case 1 :
// System.out.println("Masukkan Plat Nomor : " + platNomor);
// String platNomor = sc.nextLine();
// System.out.println("Masukkan Jenis Kendaraan : " + tipe);
// String tipe = sc.nextLine();
// System.out.println("Masukkan Merk : " + merk);
// String merk = sc.nextLine();
// System.out.println(">> Kendaraan masuk ke dalam antrian.");
// Kendaraan kendaraan = new Kendaraan(plat, tipe, merk); (membuat objek kendaraan baru berdasarkan data yang sudah dimasukkan : plat, tipe, merk)
// antrian.tambahAntrian(kendaraan); (menambah objek kendaraan ke daftar antrian dg fungsi tambahAntrian from DLL)
//break;