import java.util.Scanner;

public class Exm21 {
    // klavyeden rastgele karakterler giriliyor girilen karakterlerden de bilgisayar kelimesi oluşturulmak isteniyor pr

    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);
        String istenilen="bilgisayar";
        String kelime="";
        int sayac=0;

        while (true){
            if(kelime.equals(istenilen)){
                break;
            }
            System.out.println("lütfen klavyeden karakter girişi yapınız");
            char c=k.next().charAt(0);

            if (c==istenilen.charAt(sayac)){
                kelime=kelime+c;
                sayac++;
            }
        }
        System.out.println("klavyeden girmiş olduğunuz karakterlerden oluşan kelime: "+kelime);
    }
}
