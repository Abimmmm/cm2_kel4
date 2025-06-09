public class QueueTransaksi {
    Transaksi[] transaksi;
    int front, rear, size, max;

    public QueueTransaksi(int max) {
        this.max = max;
        transaksi = new Transaksi[max];
        front = rear = size = 0;
    }


    public void tampilkanTransaksi() {
        if (size == 0) {
            System.out.println("Belum ada transaksi.");
            return;
        }
        System.out.println("-- Riwayat Transaksi --");
        System.out.println("Daftar Transaksi: ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            transaksi[index].tampil();
        }
    }
}
