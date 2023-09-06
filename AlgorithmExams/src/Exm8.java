import java.util.Scanner;

public class Exm8 {
    // klavyden girilen 3 sayıdan büyüklük sıralamasına göre ortada bulunan sayıyı ekrana yazan program

    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);

        System.out.println("birinci sayıyı giriniz");
        int a=k.nextInt();

        System.out.println("ikinci sayıyı giriniz");
        int b=k.nextInt();

        System.out.println("üçüncü sayıyı giriniz");
        int c=k.nextInt();

        int ortadeger=0;

        if (a>b && a>c && b>c){
            ortadeger=b;
        } if (a>b && a>c && c>b){
            ortadeger=c;
        } if (b>a && a>c && b>c){
            ortadeger=a;
        } if (b>a && c>a && b>c){
            ortadeger=c;
        } if (c>b && c>a && a>b){
            ortadeger=a;
        } if (c>b && c>a && b>a){
            ortadeger=b;
        }
        System.out.println(ortadeger);
    }
}
