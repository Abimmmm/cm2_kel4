import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianDoubleLinkedList antrian = new AntrianDoubleLinkedList();
        QueueTransaksi riwayat = new QueueTransaksi(100);

        int pilih;
        do {
            System.out.println("\n===== MENU SPBU =====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Jumlah Kendaraan dalam Antrian");
            System.out.println("4. Layani Kendaraan dan Catat Transaksi");
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    
                    break;
                case 2:
                    antrian.tampilkanAntrian();
                    break;
                case 3:
                    
                    break;
                case 4:
                   if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        Kendaraan dilayani = antrian.dequeue();
                        System.out.println("Petugas melayani" + dilayani.getPlatNomor());

                        System.out.print("Masukkan jenis BBM: ");
                        String bbm = sc.nextLine();
                        System.out.print("Masukkan jumlah liter: ");
                        double liter = sc.nextDouble();
                        System.out.print("Masukkan harga per liter: ");
                        double harga = sc.nextDouble();
                        sc.nextLine(); 
                        System.out.println(">> Transaksi Berhasil Dicatat");
                    }
                    break;
                case 5:
                    riwayat.tampilkanTransaksi();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
    }
}
