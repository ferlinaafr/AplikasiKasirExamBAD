package finalprojectuts;

public class cPakaian {

    private String merk;
    private double harga;

    cPakaian(String m, double h) {
        merk = m;
        harga = h;
        System.out.println("Object pakaian dibuat...");
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String m) {
        merk = m;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double h) {
        harga = h;
    }

}
