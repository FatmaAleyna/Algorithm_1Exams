import java.util.Scanner;

public class Exm20 {
    // klavyeden girilecek olan 20 sayıdan çiftleri ayrı tekleri ayrı toplayıp ekrana yazan pr.

    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);
        int sayi;
        int tektop=0;
        int cifttop=0;

        System.out.println("lütfen 20 adet sayı giriniz");
        for (int i = 0; i <20 ; i++) {
            sayi=k.nextInt();
            if (sayi%2==0){
                cifttop=cifttop+sayi;
            } else{
                tektop=tektop+sayi;
            }
        }
        System.out.println("girilen tek sayıların toplamı: "+tektop);
        System.out.println("girilen çift sayıların toplamı: "+cifttop);
    }
}
