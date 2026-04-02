import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        RekeningBank rekening1 = new RekeningBank();

        System.out.print("Masukkan nomor rekening: ");
        String nomorRekening = input.nextLine();
        System.out.println(">> Rekening berhasil dibuat!\nSaldo awal Anda saat ini: Rp" + rekening1.getSaldo());

        while (true) {
            System.out.print("\n1. Cek Saldo\n2. Isi Saldo\n3. Keluar\nPilih menu: ");
            int pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("\nSaldo Anda saat ini: Rp" + rekening1.getSaldo());
                    break;
                case 2:
                    System.out.print("Masukkan jumlah saldo yang ingin dimasukkan: Rp");
                    int isiSaldo = input.nextInt();
                    rekening1.setPengisianSaldo(isiSaldo);
                    break;
                case 3:
                    return;
                default:
                    System.out.println(">> Pilihan tidak valid!");
            }
        }
    }
}
