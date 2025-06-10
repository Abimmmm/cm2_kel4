import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianDoubleLinkedList antrian = new AntrianDoubleLinkedList();
        QueueTransaksi riwayat = new QueueTransaksi();

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
            pilih = sc.nextInt(); 
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan plat nomor: ");
                    String plat = sc.nextLine();
                    System.out.print("Masukkan jenis kendaraan: ");
                    String jenis = sc.nextLine();
                    System.out.print("Masukkan merk kendaraan: ");
                    String merk = sc.nextLine();
                    Kendaraan k = new Kendaraan(plat, jenis, merk);
                    antrian.tambahAntrian(k);
                    System.out.println(">> Kendaraan berhasil ditambahkan ke antrian.");
                    break;
                case 2:
                    antrian.tampilkanAntrian();
                    break;
                case 3:
                    int jumlah = 0;
                    Node temp = antrian.head;
                    while (temp != null) {
                        jumlah++;
                        temp = temp.next;
                    }
                    System.out.println(">> Jumlah kendaraan dalam antrian: " + jumlah);
                    break;
                case 4:
                    if (antrian.isEmpty()) {
                            System.out.println("Antrian kosong.");
                    } else {
                        Kendaraan dilayani = antrian.head.data;
                        System.out.println("Petugas Melayani Kendaraan " + dilayani.platNomor);
                        System.out.print("Jenis BBM: ");
                        String bbm = sc.nextLine();
                        System.out.print("Jumlah Liter: ");
                        double liter = sc.nextDouble();
                        System.out.print("Harga per Liter: ");
                        double harga = sc.nextDouble(); 
                        sc.nextLine();
                        BBM b = new BBM(bbm, harga);
                        Transaksi tr = new Transaksi(dilayani, b, liter);
                        riwayat.enqueue(tr);
                        antrian.layaniKendaraan();
                        System.out.println("Transaksi berhasil dicatat.");
                    }    
                    break;
                case 5:
                    riwayat.tampilkanTransaksi();
                    break;
                case 0:
                    System.out.println("Program Selesai Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
    }
}
