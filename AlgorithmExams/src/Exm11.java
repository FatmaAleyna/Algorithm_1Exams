import java.util.Scanner;

public class Exm11 {
    //klavyeden girilen stringte kaç tane rakam olduğunu bulan ve bunların sayısını ekrana yazan program

    public static void main(String[] args) {

        String s="";
        Scanner k= new Scanner(System.in);
        System.out.println("bir steing giriniz");
        s=k.nextLine();

        int sayac=0;

        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)>='0' && s.charAt(i)<='9'){
                sayac++;
            }
        }
        System.out.println("girilen stringteki sayı adedi: "+sayac+" kadardır");
    }
}
