public class Zemin {
    private double genislik;
    private double uzunluk;
    private String aciklama;

    public Zemin(double genislik, double uzunluk, String aciklama) {
        this.setGenislik(genislik);
        this.setUzunluk(uzunluk);
        this.aciklama = aciklama;
    }

    public Zemin() {
    }

    public double getGenislik() {
        return genislik;
    }

    public void setGenislik(double genislik) {
        if (genislik > 0) {
            this.genislik = genislik;
        }
    }

    public double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        if (uzunluk > 0) {
            this.uzunluk = uzunluk;
        }
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public double alanHesapla() {
        return genislik * uzunluk;
    }

    @Override
    public String toString() {
        return aciklama + " (" + genislik + " x " + uzunluk + ")";
    }
}
