public class Barang {
    private String idBarang;
    private String namaBarang;
    private int stok;
    private int hargaSatuan;

    private String kategoriBarang;

    Barang(String idBarang, String namaBarang){
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.stok = 0;
        this.hargaSatuan = 0;
        this.kategoriBarang = null;
    }
    public String getidBarang(){
        return idBarang;
    }
    public void setidBarang(String idBarang){
        this.idBarang = idBarang;
    }
    public String getnamaBarang(){
        return namaBarang;
    }
    public void setnamaBarang(String namaBarang){
        this.namaBarang = namaBarang;
    }
    public int getstok(){
        return stok;
    }
    public void setstok(int stok){
        if (stok < 0){
            System.out.println(">> Stok barang tidak boleh negatif!");
        } else {
            this.stok = stok;
        }
    }
    public int gethargaSatuan(){
        return hargaSatuan;
    }
    public void sethargaSatuan(int hargaSatuan){
        if (hargaSatuan <= 0){
            System.out.println(">> Harga barang tidak boleh boleh kurang atau sama dengan nol!");
        } else {
            this.hargaSatuan = hargaSatuan;
        }
    }

    public int tambahStok(int jumlah){
        if (jumlah < 0){
            System.out.println(">> Jumlah barang yang ditambahkan tidak ada!");
            return this.stok;
        } else {
            this.stok += jumlah;
            return this.stok;
        }
    }
    public int kurangiStok(int jumlah){
        if (jumlah < 0){
            System.out.println(">> Jumlah barang yang dikurangi tidak ada!");
            return this.stok;
        } else if (jumlah > this.stok){
            System.out.println(">> Stok barang tidak mencukupi!");
            return this.stok;
        } else {
            this.stok -= jumlah;
            return this.stok;
        }
    }

    public String getkategoriBarang(){
        return kategoriBarang;
    }
    public void setkategoriBarang (String kategoriBarang){
        this.kategoriBarang = kategoriBarang;
    }

    public void tampilkan(){
        System.out.println("ID Barang: " + idBarang);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Kategori Barang: " + kategoriBarang );
        System.out.println("Stok: " + stok);
        System.out.println("Harga Satuan: " + hargaSatuan);
    }
}
