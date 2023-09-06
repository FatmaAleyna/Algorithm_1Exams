public class Midterm2 {
    // 200 + 1/3 +2/7 + 3/11 ... diye giden serinin 30. elmanını ekrana yazdıran ve ilk 50 elamnının toplaımını ekrana yazdıran java
    //kodunu yazınız.

    public static void main(String[] args) {

        double toplam=200;
        double payda=3;

        for (int i = 1; i <50 ; i++) {
            double istenilen=i/payda;
            payda+=4;
            if (i==29){
                System.out.println("30. eleman: "+istenilen);
                toplam=toplam+istenilen;
            }
        }
        System.out.println("dizinin ilk 50 elamanının toplamı: "+toplam);
    }
}
