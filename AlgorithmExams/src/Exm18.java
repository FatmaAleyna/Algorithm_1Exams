import java.util.Scanner;
import java.util.SortedMap;

public class Exm18 {
    // klavyeden girilen sayının palindromik olup olmadığını bulan program

    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");

        int sayi=k.nextInt();
        String str=String.valueOf(sayi);
        int i=0;
        int j=str.length()-1;
        boolean kontrol=true;

        while (i<j){
            if (str.charAt(i++) != str.charAt(j--)){
                kontrol=false;
                break;
            }
        }
        if (kontrol){
            System.out.println(sayi+" bir palindrom sayıdır");
        }else{
            System.out.println(sayi+" bir palindrom sayı değildir");
        }
    }
}
