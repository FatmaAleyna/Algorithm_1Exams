import java.util.Scanner;

public class Midterm1 {
    // klavyeden girilen iki tam sayı arasındaki 1,2,3 basamkalı sayıları kendi arasında toplayan ve bunları ekrana yazan java kodunu yazınız

    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);

        int sayi1=k.nextInt();
        int sayi2=k.nextInt();
        int toplam1=0; int toplam2=0;  int toplam3=0;

        if (sayi2>sayi1){
            for (int i =sayi1 ; i <=sayi2 ; i++) {
                if (i>=0 && i<10){
                    toplam1=toplam1+i;
                }
                if (i>=10 && i<100){
                    toplam2=toplam2+i;
                }
                if (i>=100 && i<1000){
                    toplam3=toplam3+i;
                }
            }
            System.out.println(sayi1+" ve "+sayi2+" arasındaki tek basamaklı sayıların toplamı: "+toplam1);
            System.out.println(sayi1+" ve "+sayi2+ " arasındaki iki basamaklı sayıların toplamı: "+toplam2);
            System.out.println(sayi1+" ve "+sayi2+" arasındaki üç basamklı sayıların toplamı: "+toplam3);
        }
    }
}
