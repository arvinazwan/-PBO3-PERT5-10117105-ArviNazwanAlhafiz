//NAMA  :Arvi Nazwan Alhafiz 
//NIM   :10117105    
//KELAS :IF-3

/**
 *
 * @author RIA FITRIANI
 */
public class Main {
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.setNip("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");

        System.out.println("NIP DOSEN : "+dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("10117105");
        mahasiswa.setNama("Arvi Nazwan A");
        mahasiswa.setUmur(20);
        mahasiswa.setKelas("PBO3");

        System.out.println("\nNIP MAHASISWA : "+mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }
    
}
