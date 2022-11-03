public class MainApp {
    public static void main(String[] args) {
        Hali hali = new Hali(3.5);
        Zemin zemin = new Zemin(2.75, 4.0, "Mutfak");
        System.out.println(zemin);
        System.out.println(hali);
        Hesap hesap = new Hesap(hali, zemin);
        System.out.println(hesap);
        System.out.println("----------------\n");

        hali = new Hali(1.5);
        zemin = new Zemin(5.4, 4.5, "Salon");
        System.out.println(zemin);
        System.out.println(hali);
        hesap = new Hesap(hali, zemin);
        System.out.println(hesap);

    }
}
