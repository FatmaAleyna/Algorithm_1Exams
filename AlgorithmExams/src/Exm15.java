import java.util.Scanner;

public class Exm15 {
    // klavyeden girilen stringteki çift olanların sayısını ekrana yazan pr
    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);
        int sayac=0;
        String s=k.nextLine();;

        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)>='0' && s.charAt(i)<='9' && s.charAt(i)%2==0){
                sayac++;
            }
        }
        System.out.println(sayac);
    }
}
