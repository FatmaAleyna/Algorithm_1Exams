import java.util.Scanner;

public class Exm42 {
    // çarpım sembolü kullanmadan: 1+2+2+3+3+3+...+n+n+n+n.. işlemini yapınız

    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);

        int sayi=k.nextInt();
        int sonuc=0;

        for (int i = 0; i <=sayi; i++) {
            for (int j = 1; j <=i ; j++) {
                sonuc=sonuc+i;
            }
        }
        System.out.println(sonuc);
    }
}
