import java.util.Scanner;

public class Exm27 {
    // klavyeden kenar uzunluğu girildiğinde üçgen çizen programı yazınız

    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);

        System.out.println("yıldız sayısını girin");
        int yıldız= k.nextInt();

        for (int i = 1; i <=yıldız ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = yıldız-1; i >=0 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
