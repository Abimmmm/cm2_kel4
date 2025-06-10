public class QueueTransaksi {
    Transaksi[] transaksi;
    int front, rear, size, max;

    public QueueTransaksi() {
        max = 100;
        transaksi = new Transaksi[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean IsEmpty() {
        return size == 0;
    }
    
    public boolean IsFull() {
        return size == max;
    }

    public void enqueue(Transaksi t){
         if (size == max) {
            System.out.println("Queue penuh. Riwayat transaksi tidak dapat ditambahkan.");
            return;
        }
        rear = (rear + 1) % max;
        transaksi[rear] = t;
        size++;
    }


    public void tampilkanTransaksi() {
        if (IsEmpty()) {
            System.out.println("Belum ada transaksi.");
            return;
        }else {
            System.out.println("-- Riwayat Transaksi --");
            System.out.println("Daftar Transaksi: ");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                transaksi[index].tampil();
            }
        }
        
    }
}
