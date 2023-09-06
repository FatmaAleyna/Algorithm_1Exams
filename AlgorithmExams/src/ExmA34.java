import java.util.Scanner;

public class ExmA34 {
    // elemanları klavyeden girilen bir tek boyutlu sayısal dizidedki en byük ikinci sayıyı ekrana ayzan pr

    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);

        int list[]=new int[5];
        int enb1=list[0];
        int enb2=list[1];

        System.out.println("dizinin elemanlarını giriniz");
        for (int i = 0; i <list.length ; i++) {
            list[i]=k.nextInt();
        }
        for (int i = 0; i <list.length ; i++) {
            if (list[i]>enb1){
                enb2=enb1;
                enb1=list[i];
            }
            if (list[i]<enb1 && list[i]>enb2){
                enb2=list[i];
            }
        }
        System.out.println("gridiğiniz dizinin en büyük ikinci elemanı: "+enb2);
    }
}
