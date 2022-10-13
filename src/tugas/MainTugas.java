package tugas;

public class MainTugas {
    public static void main(String[] args) {
        Dosen d1 = new Dosen("123", "Dapa", "Malang");
        d1.setSKS(10);
        Dosen d2 = new Dosen("456", "Dafa", "Blitar");
        d2.setSKS(5);
        DaftarGaji dGaji = new DaftarGaji(4);
        dGaji.addPegawai(d1);
        dGaji.addPegawai(d2);
        dGaji.printSemua();
    }
}
