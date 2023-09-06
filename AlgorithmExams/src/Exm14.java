import java.util.Scanner;

public class Exm14 {
    // klavyeden girilen stringteki sayıların toplamını bulan program

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        String kelime = k.nextLine();
        int toplam = 0;

        for (int i = 0; i <kelime.length(); i++) {

            if (kelime.charAt(i) >= '0' && kelime.charAt(i)<='9'){
                toplam=toplam+((char)kelime.charAt(i)-48);
            }
        }
        System.out.println(toplam);
    }
}