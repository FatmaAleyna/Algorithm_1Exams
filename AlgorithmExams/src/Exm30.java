import java.util.Scanner;

public class Exm30 {
    //klavyeden girilen stringin uzunluğunu hesaplayıp (boşlukları saymayacak) ekrana yazan pr

    public static void main(String[] args) {

        Scanner j=new Scanner(System.in);

        System.out.println("klavyeden bir string giriniz");
        String girilen=j.nextLine();

        String ileti="";
        ileti=ileti+""+girilen;

        int sayac=0;

        for (int i = 0; i <ileti.length() ; i++) {
            if (ileti.charAt(i) == ' '){
           sayac++;
            }
        }
        int uzunluk=ileti.length()-sayac;

        System.out.println("klavyeden giriğimiz stringin uzunluğu: "+uzunluk);
    }
}
