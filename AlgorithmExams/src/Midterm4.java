import java.util.Scanner;

import static java.lang.System.*;

public class Midterm4 {
    // "CIKIS" kelimesi girilene kadar ,klavyeden  girilen rastgele stringleri toplayan ve sonucu yazdıran programı yapınız!

    public static void main(String[] args) {

        Scanner k=new Scanner(in);
        System.out.println("rastgele art arda stringler giriniz");
        String sonuc="";

        while(true) {
            String girilen = k.nextLine();
                if (girilen.equals("CIKIS"))
                    break;
                    sonuc = sonuc + girilen;
            }
        out.println(sonuc);
        out.println("program sonlandı teşekkürler");
    }
}