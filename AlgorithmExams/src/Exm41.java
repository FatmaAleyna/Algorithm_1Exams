public class Exm41 {
    // toplam sembolu i 1 den 5 e kadar (i/(i+1)!) sonucu

    public static void main(String[] args) {

        double sonuc=0;
        int fak=1;

        for (int i = 1; i <5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                fak=fak*(j+1);
            }
            sonuc=sonuc+(i/(fak));
        }
        System.out.println(sonuc);
    }
}
