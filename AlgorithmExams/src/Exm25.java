import java.util.Scanner;

public class Exm25 {
    // klavyeden girilen stringteki sesli harfleri çıkarıp yeniden ekrana yazan pr

    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);

        System.out.println("string giriniz");
        String cumle=k.nextLine();
        String sesliharfler="aeıioöuüAEIİOÖUÜ";
        String sonuc="";

        for (int i = 0; i <cumle.length() ; i++) {
            boolean kontrol=true;
            for (int j = 0; j <sesliharfler.length() ; j++) {
                if (cumle.charAt(i)==sesliharfler.charAt(j)){
                    kontrol=false;
                }
            }
            if (kontrol){
                sonuc=sonuc+cumle.charAt(i);
            }
        }
        System.out.println(sonuc);
    }
}
