import java.util.Scanner;

public class Exm17 {
    // klavyeden girilen bir cümlenin sondan ikinci kelimesini ekrana yazan program

    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);
        System.out.println("bir string giriniz");
        String s=k.nextLine();

        String istenilen="";

        int sonbosluk=s.lastIndexOf(" ");

        while (true){
            char harf=s.charAt(sonbosluk-1);

            if (harf==' '){
                break;
            }
            istenilen=harf+istenilen;
            sonbosluk-=1;
        }
        System.out.println(istenilen);
    }
}
