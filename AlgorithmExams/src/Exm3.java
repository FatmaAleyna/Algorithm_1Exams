import java.util.Scanner;

public class Exm3 {
    // klavyeden girileceke x değerinden n değerine kadar tüm doğal sayılarıekrana yazan program
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int x,n,i;

        System.out.println("bir x değeri giriniz");
        x=k.nextInt();

        System.out.println("bir n değeri giriniz");
        n=k.nextInt();

        for ( i = x; i <=n ; i++) {
            System.out.println(i);
        }
    }
}
