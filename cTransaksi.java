package finalprojectuts;

public class cTransaksi {

    private String kode;
    private cPakaian[] pakaian;
    private int js, ms;

    cTransaksi(String k, int n) {
        kode = k;
        ms = n;
        pakaian = new cPakaian[n];
        System.out.println("Object transaksi dibuat...");
    }

    public void addPakaian(cPakaian s) {
        if (js < ms) {
            pakaian[js] = s;
            js++;
            System.out.println("Adding done.");
        } else {
            System.out.println("Over capacity!");
        }
    }

    public void delPakaian(String m) {
        if (js > 0) {
            boolean ada = false;
            for (int i = 0; i < js; i++) {
                if (pakaian[i].getMerk().equalsIgnoreCase(m)) {
                    ada = true;
                    for (int j = i; j < js; j++) {
                        if (j == js - 1) {
                            pakaian[j] = null;
                        } else {
                            pakaian[j] = pakaian[j + 1];
                        }
                    }
                    js--;
                    System.out.println("Delete done...");
                    break;
                }
            }
            if (ada == false) {
                System.out.println("Not found!");
            }
        } else {
            System.out.println("Empty!");
        }
    }

    public void showPakaian() {
        System.out.println("Daftar Belanja : ");
        if (js == 0) {
            System.out.println("Kosong");
        } else {
            for (int i = 0; i < js; i++) {
                System.out.println(pakaian[i].getMerk());
                System.out.println(" [Rp." + pakaian[i].getHarga() + "]");
            }
        }
        System.out.println("");
    }

    public String getKode() {
        return kode;
    }

    public cPakaian[] getPakaian() {
        return pakaian;
    }

    public int getMS() {
        return ms;
    }
}
