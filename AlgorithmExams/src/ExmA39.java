import java.util.Scanner;

public class ExmA39 {
    // klavyeden girilen iki boyutlu string dizisindeki küçük harflerin sayısını bulan pr

    public static void main(String[] args) {

        Scanner k=new Scanner(System.in);

        String list[][]=new String[2][2];
        int sayac=0;

        for (int i = 0; i <list.length ; i++) {
            for (int j = 0; j < list[i].length ; j++) {
                list[i][j]=k.nextLine();
            }
        }
        for (int i = 0; i < list.length ; i++) {
            for (int j = 0; j < list[i].length; j++) {
                for (int l = 0; l < list[i][j].length(); l++) {
                    if (list[i][j].charAt(l)>='a' && list[i][j].charAt(l)<='z') {
                        sayac++;
                    }
                }
            }
        }
        System.out.println("string dizisindeki küçük harflerin sayısı: "+sayac);
    }
}
