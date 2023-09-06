import java.util.Scanner;

public class Exm5 {
    //klavyeden girilen sayının tüm tam bölenlerini bulup ekrana yazan program
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.println("bir sayı giriniz");
        int sayi = k.nextInt();

        for (int i = 1; i <=sayi ; i++) {

            if (sayi%i==0){
                System.out.println(sayi+"'nın "+i+" böleni");
            }
        }
    }
}