package tugas;

public class Dosen extends Pegawai {
    public int jmlSKS;
    public int tarifSKS;

    Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setSKS(int sks) {
        this.jmlSKS = sks;
    }

    @Override
    public String getNama() {
        // TODO Auto-generated method stub
        return super.getNama();
    }

    @Override
    public int getGaji() {
        this.tarifSKS = super.getGaji() * jmlSKS;
        return tarifSKS;
    }
}
