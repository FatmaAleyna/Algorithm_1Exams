public class ExmS43 {
    // toplam sembolü(i) çarpım sembol(j)ü ikisi de 1 den 3 e kadar (i+j)
    // çarpımların toplamı: seriyi sağdan sola doğru okuyoruz kodunu yazarken soldan sağa doğru forları yazıp okuduğumuz şekilde işlem yapıyoruz

    public static void main(String[] args) {

        int carpim=1;
        int toplam=0;
        for (int i = 1; i <3 ; i++) {
            for (int j = 1; j <3 ; j++) {
                carpim=carpim*(i+j);
            }
            toplam=toplam+carpim;
            carpim=1;
        }
        System.out.println(toplam);
    }
}
