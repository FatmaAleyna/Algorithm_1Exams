import java.util.Scanner;

public class Exm44 {
    // stringteki a yı b yapan program

    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);

        String s="";
        String girilen=k.nextLine();

        for (int i = 0; i <girilen.length() ; i++) {
            if (girilen.charAt(i) == 'a') {
                s = s + 'b';
            } else {
                s = s + girilen.charAt(i);
            }
        }
        System.out.println(s);
    }
}
