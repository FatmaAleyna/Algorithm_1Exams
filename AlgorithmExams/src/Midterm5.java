import java.util.Scanner;

public class Midterm5 {
    // Klavyeden girilen tamsayı kadar adınızı ekrana yazan java kodunu yazınız!.
    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);

        String ad="fatma aleyna";
        System.out.println("klavyeden bir tamsayı giriniz");
        int sayi=k.nextInt();

        for (int i = 1; i <=sayi ; i++) {
            System.out.println(ad);
        }
    }
}
