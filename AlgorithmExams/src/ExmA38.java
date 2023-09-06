import java.util.Arrays;
import java.util.Scanner;

public class ExmA38 {
// klavyeden girilen tek boyutlu sayısal dizideki elemanları küçükten büyüğe doğru sıralayan pr

    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);

        int list[]=new int[5];
        int enk=list[0];
        int enb=list[1];

        for (int i = 0; i <list.length ; i++) {
            list[i]=k.nextInt();
        }
        for (int i = 0; i <list.length ; i++) {
            for (int j = 0; j < list.length-1 ; j++) {
                if (list[j]>list[j+1]){
                    int yedek=list[j];
                    list[j]=list[j+1];
                    list[j+1]=yedek;
                }
            }
        }
        System.out.println(Arrays.toString(list));

    }
}
