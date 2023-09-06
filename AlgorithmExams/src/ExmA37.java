import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

public class ExmA37 { // MANTIĞINI ANLAMADIM
    // klavyeden girilen tek boyutlun sayısal dizidek elmanları bir sağa döndüren pr

    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);

        int array[]=new int[5];

        for (int i = 0; i < array.length ; i++) {
            array[i]=k.nextInt();
        }
        for (int i = array.length-1; i > 0 ; i--) {
            int yedek=array[i-1];
            array[i-1]=array[i];
            array[i]=yedek;
        }
        System.out.println(Arrays.toString(array));
    }
}
