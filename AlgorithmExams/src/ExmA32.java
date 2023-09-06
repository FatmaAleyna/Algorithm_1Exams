public class ExmA32 {
    // iki boyutlu sayısal dizideki en büyük elemanın indisini geri döndüren pr

    public static void main(String[] args) {

        int array[][]={{1,2,3},{4,5,6}};
        int enb=array[0][0];
        int enbi=0;
        int enbj=0;

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length ; j++) {

                if (array[i][j]>enb){
                    enb=array[i][j];
                    enbi=i;
                    enbj=j;
                }
            }
        }
        System.out.println("bu dizinin en büyük elemanı ["+enbi+"]["+enbj+"] indisindedir");
    }
}
