public class AntrianDoubleLinkedList {
    Node head, tail;

    public boolean isEmpty(){
        return head == null;
    }

    public void tampilkanAntrian(){
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

         NodeKendaraan temp = head;
        System.out.println("-- Daftar Kendaraan dalam Antrian");
        while (temp != null) {
            System.out.println("Plat Nomor : " + temp.kendaraan.platNomor);
            System.out.println("Jenis      : " + temp.kendaraan.jenisKendaraan);
            System.out.println("Merk       : " + temp.kendaraan.merk);
            System.out.println("-----------------------------");
            temp = temp.next;
        }
    }

   public void enqueue(Kendaraan k){
        NodeKendaraan baru = new NodeKendaraan(k);
        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }
    }

    public Kendaraan dequeue(){
        if (head == null) return null;

        Kendaraan k = head.kendaraan;
        head = head.next;
        if (head != null) head.prev = null;
        else tail = null;

        return k;
    }
    
}
