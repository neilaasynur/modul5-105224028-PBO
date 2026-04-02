public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa mhs = new Mahasiswa();

        mhs.nama = "Neila";
        System.out.println(mhs.nama);
        mhs.setNim("105224028");
        System.out.println(mhs.getNim());
    }
}
