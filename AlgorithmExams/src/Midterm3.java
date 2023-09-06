import java.util.Scanner;

public class Midterm3 {
    //klavyeden girilen 2 string'in uzunlukları aynı ise her stringin aynı indisinde olan karakteri diğer stringin yanına yazan
    // ve sonucu ekrana yazan java kodunu yazınız.

    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);

        System.out.println("bir string giriniz");
        String s1=k.nextLine();
        System.out.println("bir string daha giriniz");
        String s2=k.nextLine();

        String sonuc="";

        if (s1.length()==s2.length()){
            for (int i = 0; i <s1.length() ; i++) {
               sonuc+= s1.charAt(i)+""+s2.charAt(i);
            }
        }
        System.out.println("girdiğiniz stringlerin indislerinin birleştirilmiş hali:"+sonuc );
    }
}
