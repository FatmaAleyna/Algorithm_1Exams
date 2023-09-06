import java.util.Scanner;

public class Exm19 {
    // klavyeden 0 girilinceye kadar klavyeden okutulan dğerlerin ortalmasını bulup ekrana yazan pr

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        System.out.println("rastgele sayılar giriniz");
        int sayi;
        int toplam = 0;
        int ort;
        int sayac=0;

        while (true) {
            sayi = k.nextInt();
            if (sayi == 0) {
                break;
            } else {
                    toplam += sayi;
                    sayac++;
            }
        }
        ort=toplam/sayac;
        System.out.println("klavyeden girgiğiniz sayıların ortalaması " + ort);
        System.out.println("program sonlandı teşekkürler");
    }
}