import java.util.Scanner;

public class Exm45 {
    // stringteki boşlukları silip tek bir string haline getiren pr yazınız

    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);
        String s=k.nextLine();
        String s2="";

        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)!=' '){
                s2=s2+s.charAt(i);
            }
        }
        System.out.println(s2);
    }
}
