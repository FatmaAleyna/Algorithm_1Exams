import java.util.Scanner;

public class Exm23 { 
    // klavyeden girilen 10 adet sayıyı büyükten küçüğe sıralayan programı yapınız

    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);
        int myarray[]=new int[10];

        for (int i = 0; i <10 ; i++) {
            System.out.println("lütfen sayı giriniz");
            myarray[i]=k.nextInt();
        }
        int yedek=0;

        for (int i = 0; i <myarray.length ; i++) {
            for (int j = i + 1; j < myarray.length; j++) {
                if (myarray[i] > myarray[j])
                    yedek = myarray[i];
                myarray[i] = myarray[j];
                myarray[j] = yedek;
            }
        }
        for (int i = 0; i < myarray.length; i++) {
            int sayi2 = myarray[i];
            System.out.println(sayi2);
        }
    }
}
