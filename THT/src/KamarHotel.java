public class KamarHotel {
    //atribut
    private String nomorKamar;
    private String tipeKamar;
    private int kapasitasMaksimal;
    private double hargaPerMalam;
    private boolean isTersedia;
    //atribut untuk menghitung total bayar
    double total;

    //constructor
    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal) {
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.hargaPerMalam = 0.0;
        this.isTersedia = true;
    }
    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal, double hargaPerMalam) {
        this.nomorKamar = nomorKamar;
        this.tipeKamar = tipeKamar;
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.hargaPerMalam = hargaPerMalam;
        this.isTersedia = true;
    }
    //getter
    public String getNomorKamar() {
        return nomorKamar;
    }
    public String getTipekamar() {
        return tipeKamar;
    }
    public int getKapasitasMaksimal() {
        return kapasitasMaksimal;
    }
    public double getHargaPerMalam() {
        return hargaPerMalam;
    }
    public boolean isTersedia() {
        return isTersedia;
    }
    //setter
    public void setNomorKamar(String nomorKamar) {
        this.nomorKamar = nomorKamar;
    }
    public void setTipekamar(String tipeKamar) {
        if (tipeKamar.equalsIgnoreCase("reguler")){
            this.tipeKamar = tipeKamar;
        } else if (tipeKamar.equalsIgnoreCase("premium")){
            this.tipeKamar = tipeKamar;
        } else if (tipeKamar.equalsIgnoreCase("suite")){
            this.tipeKamar = tipeKamar;
        } else {
            System.out.println("\n>> Tipe kamar tidak ada! Tipe kamar diubah menjadi Reguler!");
            this.tipeKamar = "Reguler";
        }
    }
    public void setHargaPerMalam(double hargaPerMalam) {
        if(hargaPerMalam < 50000){
            System.out.println("\n>> Harga tidak valid! Harga diubah menjadi Rp50.000!");
            this.hargaPerMalam = 50000;
        } else {
            this.hargaPerMalam = hargaPerMalam;
        }
    }
    //method
    public void pesanKamar(){
        if (isTersedia){
            System.out.println("\n>> Kamar berhasil dipesan!");
            isTersedia = false;
        } else {
            System.out.println("\n>> Kamar tidak tersedia!");
        }
    }
    public void pesanKamar (int jumlahTamu){
        if (isTersedia){
            if (jumlahTamu <= kapasitasMaksimal){
                System.out.println("\n>> Kamar berhasil dipesan untuk " + jumlahTamu + " tamu!");
                isTersedia = false;
            } else {
                System.out.println("\n>> Jumlah tamu melebihi kapasitas maksimal kamar!");
            }
        } else {
            System.out.println("\n>> Kamar tidak tersedia!");
            isTersedia= true;
        }
    }
    public void batalPesan(){
        if (!isTersedia){
            System.out.println("\n>> Pemesanan kamar dibatalkan!");
            isTersedia = true;
        } else {
            System.out.println("\n>> Kamar sudah tersedia, tidak ada pemesanan yang perlu dibatalkan!");
        }
    }
    public void hitungTotalBayar (int jumlahMalam){
        this.total = hargaPerMalam * jumlahMalam;
    }

    public void hitungTotalBayar (int jumlahMalam, String kodeVoucher){
        if (kodeVoucher == "PROMO" && jumlahMalam >= 3){
            this.total = (hargaPerMalam * jumlahMalam) - (hargaPerMalam * jumlahMalam * 0.2); 
            System.out.println("\n>> Selamat Anda mendapatkan diskon 20%!");
        } else {
            this.total = hargaPerMalam * jumlahMalam;
        }
    }
    public void tampilkan(){
        System.out.println("\nNomor Kamar: " + nomorKamar);
        System.out.println("Tipe Kamar: " + tipeKamar);
        System.out.println("Kapasitas Maksimal: " + kapasitasMaksimal + " tamu");
        System.out.println("Harga Per Malam: Rp" + hargaPerMalam);
        System.out.println("Total pembayaran yang harus dilakukan Rp" + total);
    }
}
