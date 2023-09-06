import java.util.Scanner;

public class Exm13 { // YAPAMADIM
    // klavyeden girilen 10 stringi son girilenden il girilene doğru yazdıran program

    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);
        String s;
        String son="";

        for (int i = 0; i <2 ; i++) {
            s=k.nextLine();
                son=son+" "+s;
            }
        System.out.println(son);
        }
    }

