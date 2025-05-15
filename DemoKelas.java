public class DemoKelas {
    public static void main(String[] args) {
        Siswa ican = new Siswa("Ican"); // perhatikan juga huruf kecil agar konsisten

        Kelas k = new Kelas(ican);

        Siswa michael = new Siswa("Michael");
        k.tambahDiBelakang(michael);
        k.tambahDiBelakang(new Siswa("Karung"));
        k.tambahDiBelakang(new Siswa("Dewa"));
        k.tambahDiBelakang(new Siswa("Garry"));
        k.tampilkanSemua();
    }
}
