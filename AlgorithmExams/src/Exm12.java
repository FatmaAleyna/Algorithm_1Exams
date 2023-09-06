import java.util.Scanner;

public class Exm12 {
    // klavyeden girilen sayının interger aralığında olup olamdığını bulan program
    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi=k.nextInt();

        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;

        if (sayi>=min && sayi<=max){
            System.out.println("girdiğiniz sayı integer aralığındadır");
        } else {
            System.out.println("girdiğiniz sayı integer aralığında değildir");
        }
    }
}
