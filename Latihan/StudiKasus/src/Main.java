public class Main {
    public static void main(String[] args) throws Exception {
        Karyawan karyawan = new Karyawan();
        karyawan.setidKaryawan("ID886");
        karyawan.setnamaKaryawan("Neila");
        karyawan.setgajiPokok(8000000);
        karyawan.setdepartemen("Accounting");
        karyawan.tampilkan();

        karyawan.setgajiPokok(-100000);
        karyawan.tampilkan();        
    }
}
