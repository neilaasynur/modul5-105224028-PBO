public class RekeningBank {
    private String nomorRekening;
    private int saldo;
    
    public RekeningBank() {
        saldo = 0;
    }

    public String getNomorRekening() {
        return nomorRekening;
    }
    public int getSaldo() {
        return saldo;
    }

    public void setPengisianSaldo(int isiSaldo) {
        if (isiSaldo < 0){
            System.out.println(">> Saldo tidak boleh negatif!");
        }
        this.saldo = saldo + isiSaldo;
        System.out.println(">> Saldo berhasil diisi!\nSaldo Anda saat ini: Rp" + this.saldo);
    }
}
