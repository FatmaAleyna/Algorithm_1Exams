import java.util.Scanner;

public class Exm26 {
    // grilen 10 stringin ascii deki değerlerini toplayıp ekrana yazan pr

    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);

        int toplam=0;
        String kelime="";

        for (int i = 0; i <2; i++) {
            System.out.println("string girin");
            kelime=k.nextLine();
            for (int j = 0; j <kelime.length() ; j++) {
                if (kelime.charAt(j)!=' '){
                    toplam=toplam+kelime.charAt(j);
                }
            }
        }
        System.out.println("girilen stringleri ascii tablosuna göre değerlerinin toplamı: "+toplam);
    }
}
