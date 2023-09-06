public class Exm1 {
    // iki boyutlu bir sayısal dizideki en büyükle en küçük sayının indisini bulan program
    public static void main(String[] args) {

        int enb;
        int enk;
        int bi = 0, bj = 0;
        int ki = 0, kj = 0;
        int a[][] = {{45,44}, {46,47}};
        enb = a[0][0];
        enk = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > enb) {
                    enb = a[i][j];
                    bi = i;
                    bj = j;
                }
                if (a[i][j] < enk) {
                    enk = a[i][j];
                    ki = i;
                    kj = j;
                }
            }
        }
        System.out.println("en büyük sayının indisi = "+"["+bi+","+bj+"]");
        System.out.println("en lüçük sayının indisi = "+"["+ki+","+kj+"]");
    }
}