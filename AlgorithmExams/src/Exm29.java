public class Exm29 {
    // 1 + 3/2! + 4/3! + ... ilk 10 teriminin toplamını hesaplayan programı yazınız.

    public static void main(String[] args) {

        double baslangic=1;

        for (double pay = 3; pay <12 ; pay++) {
            double fak=1;
            for (double payda = pay-1; payda >=1 ; payda++) {
             fak*=payda;
            }
            baslangic= baslangic+(pay/fak);
        }
        System.out.println(baslangic);
    }
}
