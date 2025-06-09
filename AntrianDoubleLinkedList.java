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
        System.out.println("-- Daftar Kendaraan dalam Antrian --");
        while (temp != null) {
            System.out.println("Plat Nomor : " + temp.kendaraan.getPlatNomor());
            System.out.println("Jenis      : " + temp.kendaraan.getJenisKendaraan());
            System.out.println("Merk       : " + temp.kendaraan.getMerk());
            System.out.println("-----------------------------");
            temp = temp.next;
        }
    }

    public Kendaraan dequeue(){
        if (head == null) return null;
        
        Kendaraan k = head.kendaraan;
        head = head.next;

        if (head == null) tail = null;
        return k;
    } 
    
}
