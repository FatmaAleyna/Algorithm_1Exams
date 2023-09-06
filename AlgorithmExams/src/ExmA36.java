import java.util.Scanner;

public class ExmA36 {
    // klavyeden girilen tek boyutlu sayısal dizideki tüm elmanların aynı olup olmadığını konntrpol eden pr

    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);

        int list[] = new int[5];
        boolean control = false;

        System.out.println("dizinin elmanlarını giriniz");
        for (int i = 0; i < list.length; i++) {
            list[i] = k.nextInt();
        }

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] == list[j + 1]) {
                    control = true;
                } else {
                    control = false;
                }
            }
        }
        if (control=true){
            System.out.println("dizinin tüm elmanları aynıdır");
        } else{
            System.out.println("diznin tüm elmanları aynı değildir");
        }
        }
    }

