public class Exm9 {
    // ilk yüz doğal sayının kareleri toplamı ile ilk yüz doğal sayının toplamının karesi arasındaki farkı bulun

    public static void main(String[] args) {

        int toplaminkaresi=0;
        for (int i = 0; i <100 ; i++) {
            toplaminkaresi=toplaminkaresi+i;
        }
        toplaminkaresi=(int) Math.pow(toplaminkaresi,2);

        int karelertoplami=0;
        for (int i = 0; i <100 ; i++) {
            int kare=i*i;
            karelertoplami=karelertoplami+kare;
        }
        int sonuc= toplaminkaresi-karelertoplami;
        System.out.println(sonuc);
    }
}
