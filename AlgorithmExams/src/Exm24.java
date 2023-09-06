import java.util.Scanner;

public class Exm24 {
    // klavyeden girilen bir stringte herhangi bir kelimenin var olup olamdığını bulan
    //varsa ekrana bulunuyor yoksa bulunmuyor yazan pr

    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);
        System.out.println("string giriniz");
        String kelime=k.nextLine();
        String istenilen="selam";
        String yedek="";
        int j=0;

        for (int i = 0; i <kelime.length() ; i++) {
if (kelime.charAt(i)==istenilen.charAt(j)){
    j++;
    yedek=yedek+kelime.charAt(i);

}
            if (yedek.equals(istenilen)){
                System.out.println("girilen stringte "+istenilen+" kelimesi vardır");
                break;
            }
}
        if (!yedek.equals(istenilen)){
            System.out.println("girilen stringte "+istenilen+" kelimesi yoktur");
        }
    }
}
