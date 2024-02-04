package finalprojectuts;

public class cPembeli {

    private String nama;

    cPembeli() {
        nama = "";
        System.out.println("Objek pembeli dibuat...");
    }

    cPembeli(String n) {
        nama = n;
        System.out.println("Objek " + nama + " dibuat...");
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String n) {
        nama = n;
    }

    public String ToString() {
        return "Pembeli : " + nama;
    }
}
