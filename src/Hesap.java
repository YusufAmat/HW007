public class Hesap {
    private Hali hali;
    private Zemin zemin;

    public Hesap(Hali hali, Zemin zemin) {
        this.hali = hali;
        this.zemin = zemin;
    }

    public double getToplamMaliyet() {
        return zemin.alanHesapla() * hali.getFiyat();
    }

    @Override
    public String toString() {
        return String.format("Toplam Maliyet = %5.2f" , getToplamMaliyet());
    }
}
