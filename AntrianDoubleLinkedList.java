public class AntrianDoubleLinkedList {
    Node head, tail;

    public AntrianDoubleLinkedList(){
        head = null;
        tail = null;
    }
    public boolean isEmpty(){
        return head == null;
    }

    public void tambahAntrian(Kendaraan kendaraan) {
        Node baru = new Node(kendaraan);
        if (isEmpty()) {
            head = tail = baru;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }
    }

    public void tampilkanAntrian() {
        Node temp = head;
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        }else {
            System.out.println("Daftar Kendaraan dalam Antrian:");
            while (temp != null) {
                temp.data.tampilkanInformasi();
                temp = temp.next;
            }
        }
    }

    public void layaniKendaraan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        }
        if (head == tail) {
            System.out.println("Kendaraan " + head.data.platNomor + " telah dilayani.");
            head = tail = null;
        } else {
            System.out.println("Kendaraan " + head.data.platNomor + " telah dilayani.");
            head = head.next;
            head.prev = null;
        }
    }
    
}
