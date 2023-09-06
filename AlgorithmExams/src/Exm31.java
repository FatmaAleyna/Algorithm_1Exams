import java.util.Scanner;

public class Exm31 {
    // klavyeden girilen stringteki boşlukları silip ekrana yeni halini yazdıran pr

    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);

        System.out.println("bir string giriniz");
        String girilen=k.nextLine();

        String ileti="";
        ileti=ileti+""+girilen;
        int uzunluk;

        for (int i = 0; i <ileti.length(); i++) {
            if(ileti.charAt(i)==' ') {
              //  girilen-= " " +ileti.charAt(i);
            }
        }
        System.out.println(girilen);
    }
}
