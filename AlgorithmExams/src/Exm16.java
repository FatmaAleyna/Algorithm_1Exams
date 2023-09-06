import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Exm16 { // YAPAMADIM
    // klavyeden girilen sayıya kadar olan asal sayıların toplamını bulan program

    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);
        int sayac=0;
        int toplam=0;
        int n=k.nextInt();

        boolean asal=true;

        for (int i = 2; i < n; i++) {
                if (n%i==0){
                    sayac++;
                }
            if (sayac==0){
                System.out.println(i);
            }


        }
    }
}
