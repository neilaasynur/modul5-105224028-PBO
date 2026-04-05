public class Main {
    public static void main(String[] args) throws Exception {
        KamarHotel kamar1 = new KamarHotel("888", "Reguler", 4);
        kamar1.setTipekamar("Presidential");
        kamar1.setHargaPerMalam(-10000);
        kamar1.pesanKamar();
        
        KamarHotel kamar2 = new KamarHotel("666", "Reguler", 2, 50000);
        kamar2.pesanKamar(4);
        kamar2.pesanKamar(2);
        kamar2.pesanKamar();
        
        kamar1.hitungTotalBayar(2, "PROMO");
        kamar2.hitungTotalBayar(4, "PROMO");
        kamar1.tampilkan();
        kamar2.tampilkan();
    }
}
