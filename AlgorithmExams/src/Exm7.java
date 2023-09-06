import java.util.Scanner;

public class Exm7 {
     // Klavyeden girilen A ve B gibi iki sayının bölme işlemi kullanmadan sadece
    // toplama ve çıkarma kullanarak kalanlı bölme yapan algoritmayı yaz
    // BAYA GÜZEL SORU
     public static void main(String[] args) {

         Scanner k=new Scanner(System.in);

         System.out.println("bir a sayısı giriniz");
         int a = k.nextInt();

         System.out.println("bir b sayısı giriniz");
         int b = k.nextInt();

         int bolum=0,kalan=0;

         while (true){
             if (a<b){
                 kalan=a;
                 break;
             }else{
                 a-=b;
                 bolum++;
             }
         }
         System.out.println(bolum+","+kalan );
     }
}
