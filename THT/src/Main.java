public class Main {
    public static void main(String[] args) throws Exception {
        KamarHotel kamar1 = new KamarHotel("888", "Reguler", 4);
        kamar1.setTipekamar("Presidential");
        kamar1.setHargaPerMalam(-10000);
        kamar1.pesanKamar();
        kamar1.hitungTotalBayar(3);
        kamar1.tampilkan();
    }
}
