public class Exm22 {
    // bir dizide en büyük ikinci sayıyı bulan programı yapınız

    public static void main(String[] args) {

        int array[]={1,2,3,4,5};
        int largest=array[0];
        int largest2=Integer.MIN_VALUE;

        for (int i = 0; i <array.length ; i++) {
            if (array[i]>largest){
                largest2=largest;
                largest=array[i];
            }
        }
        System.out.println("dizideki en büyük ikinci eleman: "+largest2);
    }
}
