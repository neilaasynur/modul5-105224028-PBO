public class Karyawan {
    private String idKaryawan;
    private String namaKaryawan;

    //soal 2
    private double gajiPokok;

    //soal 3
    private String departemen;

    //soal 1
    Karyawan () {
        setidKaryawan(idKaryawan);
        setnamaKaryawan(namaKaryawan);
    }
    public String getidKaryawan() {
        return idKaryawan;
    }
    public String getnamaKaryawan () {
        return namaKaryawan;
    }
    public void setidKaryawan (String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }
    public void setnamaKaryawan (String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    //getter setter soal 2
    public double getgajiPokok () {
        return gajiPokok;
    }
    public void setgajiPokok (double gajiPokok) {
        if (gajiPokok < 0) {
            System.out.println(">> Gaji pokok tidak boleh negatif!");
        } else {
            this.gajiPokok = gajiPokok;
        }
    }

    //getter setter soal 3
    public String getdepartemen () {
        return departemen;
    }
    public void setdepartemen (String departemen) {
        this.departemen = departemen;
    }
    //tampilkan soal 3
    public void tampilkan (){
        System.out.println("ID Karyawan: " + idKaryawan);
        System.out.println("Nama Karyawan: " + namaKaryawan);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Departemen: " + departemen);
    }
}
