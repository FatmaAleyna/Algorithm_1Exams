import java.util.Scanner;

public class ExmA35 {
    // klavyeden girilen dizideki elanların küçükten büyüğe doğru sıralı olup olmadığını kontrol eden pr

    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);

        int array[]=new int[5];
        boolean siralimMi=true;
        int sayac1=0;
        int sayac2=0;

        for (int i = 0; i < array.length ; i++) {
            array[i]=k.nextInt();
        }
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length-1 ; j++) {
                if (array[j]>array[j+1])
                    sayac1++;
                if (array[j]<array[j+1])
                    sayac2++;
            }
        }
        if (sayac1==0 || sayac2==0) {
            siralimMi = true;
            System.out.println("girdiğiniz dizi sıralıdır");
        } else{
            siralimMi=false;
            System.out.println("girdiğiniz dzi sıralı değildir");
        }
    }
}
