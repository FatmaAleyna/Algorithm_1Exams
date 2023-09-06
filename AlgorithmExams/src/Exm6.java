import java.util.Scanner;

public class Exm6 {
    // klavyeden girilen 10 tane sayı içinden 5 e eşit olanların kaçıncı sıradan girildiğini ekrana yazan program
    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);
        int i;
        System.out.println("10 adet sayı giriniz");

        for ( i = 1; i <=10 ; i++) {
           int sayi=k.nextInt();

            if (sayi==5){
                System.out.println(i+". sırada girildi");
            }
        }
    }
}
