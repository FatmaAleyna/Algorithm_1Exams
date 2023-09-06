import java.util.Scanner;

public class Exm10 {
    // kalvyeden sürekli tam sayılar giriliyor girilen sayulardan 5 sayısının adedi 10 olunca duran programı yazınız

    public static void main(String[] args) {

        int sayi;
        int sayac=0;
        Scanner k=new Scanner(System.in);

        while (true){
            sayi=k.nextInt();
            if(sayi==5){
                sayac++;
            }if (sayac==5){
                System.out.println("program sonlandı, teşekkürler");
                break;
            }
        }
    }
}
