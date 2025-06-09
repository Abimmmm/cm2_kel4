import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLinkedList antrian = new AntrianLinkedList();
        
        int pilihan;
        do {
            System.out.println("\n===== MENU SPBU =====");
            System.out.println("3. Tampilkan Jumlah Kendaraan dalam Antrian");
            System.out.println("4. Layani Kendaraan dan Catat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 2:
                    antrian.tampilkanAntrian();
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
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);    
    }
}
