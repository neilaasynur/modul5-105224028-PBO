public class Main {
    public static void main(String[] args) throws Exception {
        Barang barang = new Barang("ID883", "Pensil Mekanik");
        // barang.stok = 50; hal ini akan menyebebabkan error. hal ini karena atribut bersifat private        
        barang.sethargaSatuan(-4000); 
        barang.setkategoriBarang("Alat Tulis");
        barang.kurangiStok(3);
        barang.tampilkan();
    }
}
