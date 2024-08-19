//Driver Class
public class SiswaTester {
    public static void main(String[] args) {
        //membuat Object
        //namaClass namaObject = new
        //Constructor();
        Siswa shabrina = new Siswa();
        Siswa rasyid = new Siswa();
        Siswa bella = new Siswa();
        Siswa chyla = new Siswa();
        Siswa grace = new Siswa();
        Siswa aya = new Siswa();

        
        shabrina.id = 32;
        shabrina.nama = "Shabrina";
        shabrina.ipk = 85.7;
        rasyid.id = 30;
        rasyid.nama = "Rasyid";
        rasyid.ipk = 80.3;
        bella.id = 5;
        bella.nama = "Bella";
        bella.ipk = 85.7;
        chyla.id = 7;
        chyla.nama = "Chyla";
        chyla.ipk = 85.5;
        grace.id = 12;
        grace.nama = "Grace";
        grace.ipk = 85.9;
        aya.id = 36;
        aya.nama = "Aya";
        aya.ipk = 85.9;
        shabrina.print();
        rasyid.print();
        bella.print();
        chyla.print();
        grace.print();
        aya.print();
    }
}