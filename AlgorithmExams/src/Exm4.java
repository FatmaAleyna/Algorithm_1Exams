import java.util.Scanner;

public class Exm4 {
    // klavyeden girilecek n sayısı kadar fibonacchi dizisinin toplamını bulan program
    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);
        int n;
        int a=0;
        int b=1;
        int c=a+b;

        System.out.println("bir n sayısı giriniz");
        n=k.nextInt();

        for (int i = a; i <=n ; i+=b) {

            System.out.println(c);

           a=b;
           b=c;
           c=a+b;

        }
    }
}
