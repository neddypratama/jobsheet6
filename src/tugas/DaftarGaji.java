package tugas;

public class DaftarGaji {
    Pegawai[] listPegawai;

    DaftarGaji(int jumlah) {
        this.listPegawai = new Pegawai[jumlah];
    }

    public void addPegawai(Pegawai pegawai) {
        for (int i = 0; i < listPegawai.length; i++) {
            if (listPegawai[i] == null) {
                this.listPegawai[i] = pegawai;
                break;
            }
        }
    }

    public void printSemua() {
        for (int i = 0; i < listPegawai.length; i++) {
            System.out.println("Nama: " + listPegawai[i].getNama());
            System.out.println("Gaji: " + listPegawai[i].getGaji());
        }
    }
}
